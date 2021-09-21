package view;

import java.util.ArrayList;

import javafx.scene.layout.GridPane;

public class Clavier extends GridPane {
    
    private final static String[] alphabet = new String[] {
        "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
        "P","Q","R","S","T","U","V","W","X","Y","Z"
    };
    private final ArrayList<Touche> mesTouches;

    public Clavier() {
        super(); // équivaut a faire un new GridPane !
        mesTouches = new ArrayList<>();
        int colonne = 0, ligne = 0;
        setHgap(10);
        setVgap(10);
        for (String a : alphabet) { // for each
            
            System.out.println(a);
        }

    }


}