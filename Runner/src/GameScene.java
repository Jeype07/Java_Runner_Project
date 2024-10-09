import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameScene extends Scene {

    //Initialisation des variables
    private Camera camera;
    private StaticThing leftBackgroung;
    private StaticThing rightBackground;

    public GameScene(Camera camera, String leftBackgroundFile, String rightBackgroundFile) {
        super(new Group(), 800, 600); // Utilisation d'un Group comme Parent

        this.camera = camera;

        // Ajouter les éléments StaticThing pour le background gauche et droit
        leftBackgroung = new StaticThing(leftBackgroundFile, 400, 600);
        rightBackground = new StaticThing(rightBackgroundFile, 400, 600);

        // Obtenir le Group de la scène pour y ajouter les ImageView des backgrounds
        Group root = (Group) this.getRoot();
        root.getChildren().addAll(leftBackgroung.getImageView(), rightBackground.getImageView());

    }

    // Méthode pour mettre à jour les positions en fonction de la caméra
    public void render() {
        // Obtient les coordonnées de la caméra
        int cameraX = camera.getX();
        int cameraY = camera.getY();

        // Met à jour la position des backgrounds en fonction de la caméra
        leftBackgroung.getImageView().setTranslateX(-cameraX);
        leftBackgroung.getImageView().setTranslateY(-cameraY);

        rightBackground.getImageView().setTranslateX(-cameraX + 400); // Ajoute la moitié de la largeur de l'image
        rightBackground.getImageView().setTranslateY(-cameraY);
    }

    public Camera getGameCamera() {
        return camera;
    }

    public void setGameCamera(Camera camera) {
        this.camera = camera;
    }
}
