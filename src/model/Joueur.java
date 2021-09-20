package model;

import java.util.HashMap;

public class Joueur {

    /**
     * variables
     */
    private int _nombreVies;
    private final HashMap<String, String> _lettresUtilisees;

    /**
     * Constructeur
     */

    public Joueur() {
        _lettresUtilisees = new HashMap<>();
        _nombreVies = 7;
    }

    /**
     * Methodes et getters setters
     */
    public void nouvellePartie() {
        _nombreVies = 7;
        _lettresUtilisees.clear();
    }

    public boolean isPendu() {
        return _nombreVies <= 0;
    }

    /**
     * @return int return the _nombreVies
     */
    public int get_nombreVies() {
        return _nombreVies;
    }

    /**
     * @param _nombreVies the _nombreVies to set
     */
    public void set_nombreVies(int _nombreVies) {
        this._nombreVies = _nombreVies;
    }

    /**
     * verifie si la lettre a deja ete utilisée
     * 
     * @param lettre
     * @return
     */
    public boolean lettreDejaUtilisee(String lettre) {
        return _lettresUtilisees.containsKey(lettre);

    }

    /**
     * Ajoute la lettre à la liste des lettres trouvees
     * 
     * @param lettre
     */
    public void addLettreUtilisee(String lettre) {
        _lettresUtilisees.put(lettre, lettre);
    }

    /**
     * Enleve une vie au joueur
     */
    public void retireUneVie() {
        _nombreVies--;
        System.out.println("pendu_partie_1.Joueur.retireUneVie() " + _nombreVies);
    }

}