package model;
import java.util.HashMap;
import java.util.Random;


public class Jeu {

/**
 * Variables
 */
private String[] _mesMots;
private int _motCourant; // index du tableau mesMots
private HashMap<String, String> _lettresTrouvees; // collection dynamique avec une cle en premier et la valeur, le type que l'on veut placer dans la hashmap

private int _nbrLettresTrouvees;

/**
 * Constructeur
 */

public Jeu() {

    this._lettresTrouvees = new HashMap<>();
    initMots();
}

/**
 * Methodes
 */


/**
 * initialise la liste de smots
 */
private void initMots() {
    _mesMots = new String[6];
    _mesMots[0] = "velo";
    _mesMots[1] = "chien";
    _mesMots[2] = "chaton";
    _mesMots[3] = "voiture";
    _mesMots[4] = "ordinateur";
    _mesMots[5] = "landeau";

}

/**
 * Création nouvelle partie
 */
public void nouvellePartie() {
    // reset les valeurs
    _nbrLettresTrouvees = 0;
    _lettresTrouvees.clear();
    //tire au hasard un mot courant pour le jeu
    Random r = new Random();
    _motCourant = r.nextInt(_mesMots.length-1);

}
    
    /**
     * 
     * @return le mot courant indicé avec_motCourant dans le hashmap
     */
 public String get_motCourant() {
        return _mesMots[_motCourant];
    }


/**
 * on compare nombre de lettres trouvees avec la longueur du mot
 * @return vrai si le mot est decouvert sinon return faux
 */
    public boolean isMotTrouve() {
        return _mesMots[_motCourant].length()  == _nbrLettresTrouvees;

    }
/**
 * Test si une lettre a deja ete decouverte
 * @param lettre la lettre a chercher
 * @return vrai si la lettre est dans le mot en court de jeu
 */
    public boolean isLettreTrouvee(String lettre) {
        return _lettresTrouvees.containsKey(lettre);
    }

/**
 * cherche la lettre dans le mot mystere et compte les occurences de celle-ci
 * @param lettre
 * @return
 */
    public boolean chercheLettre(String lettre) {
        int nombreOccurence = 0;
        int index =0;
        String  m = _mesMots[_motCourant];
        while (true) {
            index = m.toUpperCase().indexOf(lettre.toUpperCase(), index);
            if (index != -1) {
                nombreOccurence++;
                index++;
            } else {
                break;
            }
       }

            if (nombreOccurence > 0) {
                _nbrLettresTrouvees += nombreOccurence;
                _lettresTrouvees.put(lettre, lettre);
                return true;
            }
             return false;
        }
       
    }
    

    

    

