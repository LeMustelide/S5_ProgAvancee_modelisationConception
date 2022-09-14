import java.util.HashSet;
import java.util.Set;

public class Habitant {

    private String nom;
    private Set<Clef> clefs = new HashSet<>();
    private Set<iTelephone> telephones;

    public Habitant(String nom){
        this.nom = nom;
    }

    public void ajouterTelehone(iTelephone telephone){
        telephones.add(telephone);
    }

    public void ajouterClef(Clef clef){
        clefs.add(clef);
    }

    public boolean ouvrir(Porte porte){
        boolean valid = false;
        for(Clef clef: clefs){
            clef.ouvrir(porte);
            valid = true;
        }
        return valid;
    }

    public boolean fermer(Porte porte){
        boolean valid = false;
        for(Clef clef: clefs){
            clef.fermer(porte);
            valid = true;
        }
        return valid;
    }

    public String getNom() {
        return nom;
    }
}
