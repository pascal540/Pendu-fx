package model;
/**
 * @pattern design pattern singleton
 */
public class Partie {

    /*
     * static veut dire que le membre appartient a lui meme et non à une instance de
     * ce type : donc une seule instance de ce membre static est crée et partagé par
     * tous les membres de la classe : ne depend pas de l'instanciation mais de la classe Partie
     */

    private static Partie _instancePartie = null; // unique
    private final Jeu _monJeu;
    private final Joueur _monJoueur;

    private Partie() {
        _monJeu = new Jeu();
        _monJoueur = new Joueur();
    }

    // methode static est accessible depuis la classe
    /**
     * 
     * @return instancePartie
     */
    public static Partie getinstancePartie() {
        if (_instancePartie == null) {
            _instancePartie = new Partie();
        }
        return _instancePartie;

    }

    /**
     * Getters et setters
     */
    public Jeu get_monJeu() {
        return _monJeu;
    }

    public Joueur get_monJoueur() {
        return _monJoueur;

    }

/**
 * Cree une nouvelle partie
 */
    public void nouvellePartie(){
        _monJeu.nouvellePartie();
        _monJoueur.nouvellePartie();

    }

    public boolean isFini() {
        if (_monJeu.isMotTrouve())
            return true;

        if (_monJoueur.isPendu())
            return true;
        return false;

    }

/**
 * 
 * @param lettre
 * @return l'enumeration
 */
public ResultatJoue joue(String lettre) {
        
    if (!_monJoueur.lettreDejaUtilisee(lettre)) {
            _monJoueur.addLettreUtilisee(lettre);
            if (_monJeu.chercheLettre(lettre)) {
                return ResultatJoue.LettreTrouvee;
            } else {
                _monJoueur.retireUneVie();
                return ResultatJoue.JoueurPerd;
             }
        }  
            
     return ResultatJoue.LettreUtilisee;
}
}