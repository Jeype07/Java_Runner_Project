import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);


    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Runner Game");

        Camera gameCamera = new Camera(0, 0);
        GameScene gameScene = new GameScene(gameCamera, "file:///C:/Users/jeanp/Documents/ENSEA/S7/POO Java/Ressources audio et image pour le runner-20231211/img/desert.png", "file:///C:/Users/jeanp/Documents/ENSEA/S7/POO Java/Ressources audio et image pour le runner-20231211/img/desert.png");

        primaryStage.setScene(gameScene);
        primaryStage.show();

        // Test 1 : Accès à la caméra depuis GameScene
        Camera sceneCamera = gameScene.getGameCamera();
        System.out.println("Scene Camera Coordinates: " + sceneCamera.toString());

        // Test 2 : Déplacer la caméra et mettre à jour la scène
        gameCamera.setX(50);
        gameCamera.setY(50);
        gameScene.render();
    }
}