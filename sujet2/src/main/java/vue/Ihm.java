package vue;
import modèle.Joueur;
import modèle.Plateau;

import java.util.Scanner;

public class Ihm {
    public String nom(int num){
        boolean valid = false;
        String nom;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrez le nom du joueur "+num+" : ");
            nom = sc.nextLine();
            if(nom.length() >= 3){
                valid = true;
            }
        }while (!valid);
        return nom;
    }

    public int[] coup(Joueur j){
        boolean valid = false;
        String coup;
        int l = 0, c = 0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println(j.getNom()+" joue (l c) : ");
            coup = sc.nextLine();
            if(coup.split(" ").length==2){
                try{
                    l = Integer.parseInt(coup.split(" ")[0]);
                    c = Integer.parseInt(coup.split(" ")[1]);
                    valid = true;
                }catch (NumberFormatException e){
                    valid = false;
                }
            }
            if(!valid){
                System.out.println("Coup invalide ! ");
            }
        }while (!valid);
        return new int[]{l,c};
    }

    public void afficherEtat(Plateau plateau){
        for(int[] l : plateau.getPlateau()){
            for(int c : l){
                System.out.print(((c==0)?"_":(c==1)?"O":"X")+"  ");
            }
            System.out.println("");
        }
    }

    public void fin(Joueur joueur){
        System.out.println(joueur.getNom()+" a gagné la partie !");
    }

    public void erreur(String message){
        System.out.println(message);
    }
}
