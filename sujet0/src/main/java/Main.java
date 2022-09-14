public class Main {
    public static void main(String[] arg){
        Habitant habitant1 = new Habitant("habitant 1");
        Habitant habitant2 = new Habitant("habitant 2");
        Clef telecomande1 = new Telecomande();
        iTelephone telephone1 = new TelephoneIntelligent();
        Porte porte1 = new Porte();

        porte1.ajouterClef(telecomande1);
        habitant1.ajouterClef(telecomande1);
        System.out.println(habitant1.getNom()+":"+habitant1.ouvrir(porte1));
        System.out.println(habitant2.getNom()+":"+habitant2.ouvrir(porte1));

        habitant2.ajouterClef((Clef) telephone1);
        porte1.ajouterClef((Clef) telephone1);
        System.out.println(habitant2.getNom()+":"+habitant2.ouvrir(porte1));

    }
}
