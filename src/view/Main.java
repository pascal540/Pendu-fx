package view;

import javafx.application.Application;
import javafx.event.ActionEvent;

//import javafx.event.EventHandler;

import javafx.scene.Group;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Partie;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // ==================== TEST =======================
        // Button btn = new Button();
        // btn.setText("Hello Java FX");
        // btn.setOnAction(new EventHandler<ActionEvent>(){
        // @Override
        // public void handle(ActionEvent event) {
        // System.out.println("Hello java fx");
        // }
        // });
        // StackPane root = new StackPane();
        // root.getChildren().add(btn);

        // Scene scene = new Scene(root, 300, 250);
        // primaryStage.setTitle("Le pendu");
        // primaryStage.setScene(scene);
        // primaryStage.show();
        Partie.getinstancePartie().nouvellePartie();// Creation d'une nouvelle partie
        Group root = new Group(); // creation d'un group

        Scene scene = new Scene(root, 800, 400, Color.AQUAMARINE);
        Pendu pendu = new Pendu();
        
        root.getChildren().add(pendu);
        

        primaryStage.setTitle("Le jeu du pendu");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
