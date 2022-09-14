public class TelephoneIntelligent extends Telephone implements Clef, iTelephone{
    @Override
    public boolean ouvrir(Porte porte) {
        return porte.action(this);
    }

    @Override
    public boolean fermer(Porte porte) {
        return porte.action(this);
    }
}
