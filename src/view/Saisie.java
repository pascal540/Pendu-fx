package view;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import model.Partie;

public class Saisie extends VBox {
    private final Pendu _monPendu;
    private final Text _motMystere;
    private final Clavier _clavier;

    // Constructeur
    public Saisie(Pendu monPendu) {
        super();
        this._monPendu = monPendu;
        this._clavier = new Clavier();
        // label du mot mystere
        Text label = new Text("Mot mystère");
        label.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 16));
        label.setFill(Color.web("#804000"));
        // Création d'un texte pour l'affichage du mot mystère
        _motMystere = new Text();
        _motMystere.setFill(Color.web("#502512"));
        _motMystere.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 18));
        getChildren().addAll(label, _motMystere, _clavier);
        setTranslateX(410);
        setTranslateY(20);
        afficheMotMystere();
    }

    public void afficheMotMystere() {
        String text = "";
        String mot = Partie.getinstancePartie().get_monJeu().get_motCourant();
        int nbrLettres = Partie.getinstancePartie().get_monJeu().get_motCourant().length();
        
        for (int i = 0; i < nbrLettres; i++) {
            char c = mot.charAt(i);
            if (!Partie.getinstancePartie().get_monJeu().isLettreTrouvee(Character.toString(c).toUpperCase())) {
                text += "_ ";
            } else {
                text += Character.toString(c).toUpperCase() + " ";
            }
        }
    _motMystere.setText(text);
    }
}
