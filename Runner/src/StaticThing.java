import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {

    private double sizeX;
    private double sizeY;
    private ImageView imageView;

    public StaticThing(String fileName, double sizeX, double sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        // Charge l'image depuis le fichier
        Image image = new Image(fileName);

        // Créer l'objet ImageView et lui assigner l'image
        imageView = new ImageView(image);
        imageView.setFitWidth(sizeX);
        imageView.setFitHeight(sizeY);
    }

    public ImageView getImageView() {
        return imageView;
    }
}
