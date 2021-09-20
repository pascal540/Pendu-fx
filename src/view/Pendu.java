package view;

import javafx.scene.Parent;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import model.Partie;

public class Pendu extends Parent {
    private final StackPane _pane;

    /**
     * Constructeur
     */
    // Il faut l'instancier il est 'final'
    public Pendu() {
        this._pane = new StackPane();
        this._pane.setPrefSize(400, 400);// positionnement de la taille
        this._pane.setTranslateX(0);
        this._pane.setTranslateY(0);
        getChildren().add(_pane);
        dessine();
    }

    public void dessine() {
        _pane.getChildren().clear();// On efface tous les enfants
        // Dessiner un rectangle de fond
        Rectangle rectangle;
        rectangle = new Rectangle(380, 380);
        rectangle.setFill(Color.BLACK);
        // On arrondit les angles
        rectangle.setArcWidth(30);
        rectangle.setArcHeight(30);
        // effet de reflexion
        Reflection r = new Reflection();
        r.setFraction(1);
        r.setBottomOpacity(0);
        r.setTopOpacity(0.5);
        rectangle.setEffect(r);
        // ajout au pane
        _pane.getChildren().add(rectangle);
        dessinePotence();
        dessinePendu();
    }

    private void dessinePotence() {
        // Poteau vertical
        Line l1 = new Line(0, 20, 0, 320);
        l1.setStrokeWidth(4);
        l1.setStroke(Color.WHITE);
        l1.setTranslateX(-60); // on la deplace au bon endroit

        // poteau horizontal
        Line l2 = new Line(0, 0, 120, 0);
        l2.setStrokeWidth(4);
        l2.setStroke(Color.WHITE);
        l2.setTranslateY(-150); // on la deplace au bon endroit

        // traverse
        Line l3 = new Line(0, 0, 60, -60);
        l3.setStrokeWidth(4);
        l3.setStroke(Color.WHITE);
        l3.setTranslateX(-30); // on la deplace au bon endroit
        l3.setTranslateY(-120); // on la deplace au bon endroit

        // pied
        Line l4 = new Line(0, 0, 100, 0);
        l4.setStrokeWidth(4);
        l4.setStroke(Color.WHITE);
        l4.setTranslateX(-60); // on la deplace en x au bon endroit
        l4.setTranslateY(150); // on la deplace en y au bon endroit

        _pane.getChildren().addAll(l1, l2, l3, l4);

    }

    private void dessinePendu() {
          int nbrVie = Partie.getinstancePartie().get_monJoueur().get_nombreVies();
        if (nbrVie < 7) {
            // La corde
            Line l = new Line(0, 20, 0, 50);//taille
            l.setStrokeWidth(4);
            l.setStroke(Color.WHITE);
            l.setTranslateX(40); // on la deplace au bon endroit
            l.setTranslateY(-130);
            _pane.getChildren().add(l);
        }
        if (nbrVie < 6) {
            // La tête
            Circle c = new Circle(20);//taille
            c.setStrokeWidth(4);
            c.setStroke(Color.WHITE);
            c.setTranslateX(40); // on la deplace au bon endroit
            c.setTranslateY(-90);
            _pane.getChildren().add(c);
        }
        if (nbrVie < 5) {
            // Le corps
            Line l = new Line(0, 0, 0, 50);//taille
            l.setStrokeWidth(4);
            l.setStroke(Color.WHITE);
            l.setTranslateX(40); // on la deplace au bon endroit
            l.setTranslateY(-40);
            _pane.getChildren().add(l);
        }
        if (nbrVie < 4) {
            // Le bras gauche
            Line l = new Line(10, 0, 60, -40);//taille
            l.setStrokeWidth(4);
            l.setStroke(Color.WHITE);
            l.setTranslateX(15); // on la deplace au bon endroit
            l.setTranslateY(-40);
            _pane.getChildren().add(l);
        }
        if (nbrVie < 3) {
            // Le bras droit
            Line l = new Line(10, -40, 60, 0);//taille
            l.setStrokeWidth(4);
            l.setStroke(Color.WHITE);
            l.setTranslateX(65); // on la deplace au bon endroit
            l.setTranslateY(-40);
            _pane.getChildren().add(l);
        }
        if (nbrVie < 2) {
            // La jambe gauche gauche
            Line l = new Line(10, 0, 30, -80); //taille
            l.setStrokeWidth(4);
            l.setStroke(Color.WHITE);
            l.setTranslateX(30); // on la deplace au bon endroit
            l.setTranslateY(28);
            _pane.getChildren().add(l);
        }
        if (nbrVie < 1) {
            // La jambe gauche droite
            Line l = new Line(10, -80, 30, 0); //taille
            l.setStrokeWidth(4);
            l.setStroke(Color.WHITE);
            l.setTranslateX(50); // on la deplace au bon endroit
            l.setTranslateY(28);
            _pane.getChildren().add(l);
        }
 
        
    }
}