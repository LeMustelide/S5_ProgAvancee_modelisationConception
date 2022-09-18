package modèle;

import java.util.HashSet;
import java.util.Set;

public class Partie {
    Set<String> joueurs = new HashSet<>();
    Set<String> joueursAutorise = new HashSet<>();

    public Partie(){}

    public Partie(String createur, String invite){
        this.joueurs.add(createur);
        this.joueursAutorise.add(invite);
    }

    public void ajouterJoueur(String joueur){
        this.joueurs.add(joueur);
    }

    public void inviterJoueur(String joueur){
        this.joueursAutorise.add(joueur);
    }

    public boolean joueurExistant(String joueur){
        boolean valid = false;
        for (String j : this.joueurs){
            if (joueur.equals(j)){
                valid = true;
            }
        }
        return valid;
    }

    public boolean joueurAutorise(String joueur){
        boolean valid = false;
        for (String j : this.joueurs){
            if (joueur.equals(j)){
                valid = true;
            }
        }
        return valid;
    }
}
