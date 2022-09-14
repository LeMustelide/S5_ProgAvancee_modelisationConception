import java.util.HashSet;
import java.util.Set;

public class Porte {
    private Set<Clef> clefs = new HashSet<>();
    private boolean ouvert = false;

    public void ajouterClef(Clef clef){
        clefs.add(clef);
    }

    public boolean canOpen(Clef clef){
        return this.clefs.contains(clef);
    }

    public boolean action(Clef clef){
        boolean valid = false;
        if(canOpen(clef)){
            this.ouvert = !this.ouvert;
            valid = true;
        }
        return valid;
    }
}
