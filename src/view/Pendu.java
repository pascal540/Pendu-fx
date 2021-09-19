package view;

import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Pendu extends Parent{
    private final StackPane _pane;


/**
 * Constructeur
 */
// Il faut l'instancier il est 'final'
    public Pendu() {
        this._pane = new StackPane();
        this._pane.setPrefSize(400, 400);//positionnement de la taille
        this._pane.setTranslateX(0);
        this._pane.setTranslateY(0); 
        getChildren().add(_pane);
        dessine();
    }

    public void dessine() {
        _pane.getChildren().clear();// On efface tous les enfants
        // Dessiner une rectangle de fond
        Rectangle rectangle;
        rectangle = new Rectangle(380, 380);
        rectangle.setFill(Color.BLACK);
        // On arrondit les angles
        rectangle.setArcWidth(30);
        rectangle.setArcHeight(30);
        // ajout au  pane
        _pane.getChildren().add(rectangle);


        }
}