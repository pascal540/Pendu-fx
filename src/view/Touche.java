package view;


import javafx.scene.Cursor;
import javafx.scene.control.Button;

public class Touche extends Button {
    private final String _valeur;// valuer de la touche

    public Touche(String valeur) {
        super(valeur);
        this._valeur = valeur;
        setPrefSize(20, 20);
        // setWidth(15);
        // setHeight(15);
        setStyle("-fx-background-color: " + "linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),"
                + "linear-gradient(#020b02, #3a3a3a),"
                + "linear-gradient(#9d9e9d 0%, #6b6a6b 20%, #343534 80%, #242424 100%),"
                + "linear-gradient(#8a8a8a 0%, #6b6a6b 20%, #343534 80%, #262626 100%),"
                + "linear-gradient(#777777 0%, #606060 50%, #505250 51%, #2a2b2a 100%);"
                + "-fx-background-insets: 0,1,4,5,6;" + "-fx-background-radius: 9,8,5,4,3;"
                + "-fx-padding: 15 30 15 30;" + "-fx-font-family: `\"Arial\";" + "-fx-font-size: 15px;"
                + "-fx-font-weight: bold;" + "-fx-text-fill: white;"
                + "-fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1));");

        setCursor(Cursor.HAND);
    }
}
