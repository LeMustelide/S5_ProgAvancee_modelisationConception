public class Telecomande implements Clef{

    @Override
    public boolean ouvrir(Porte porte) {
        return porte.action(this);
    }

    @Override
    public boolean fermer(Porte porte) {
        return porte.action(this);
    }
}
