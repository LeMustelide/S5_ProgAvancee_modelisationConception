package modèle;

public class Joueur {
    private String nom;
    private int id;

    public Joueur(String nom, int id){
        this.nom = nom;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public int getId(){
        return id;
    }
}
