package modèle;

public class Plateau {
    private int[][] plateau = new int[3][3];

    public void modifier(int l, int c, int i){
        plateau[l][c] = i;
    }

    public boolean coupValide(int l, int c){
        return plateau.length > l && plateau[l].length > c && plateau[l][c] == 0;
    }

    public int[][] getPlateau(){
        return plateau;
    }

    public boolean conditionVictoire(Joueur joueur){
        int count = 0;
        boolean valid = false;
        //check line
        for(int[] l :this.plateau){
            if(l[0] == joueur.getId() && l[1] == joueur.getId() && l[2] == joueur.getId()){
                valid = true;
            }
        }
        //check collone
        if(!valid){
            for(int i = 0; i < this.plateau[0].length ; i++){
                count = 0;
                for(int[] l :this.plateau){
                    if(l[i]== joueur.getId()){
                        count += 1;
                    }
                    if(count == 3){
                        valid = true;
                    }
                }
            }
        }
        //check diag
        if(!valid){
            count = 0;
            int i = 0;
            for(int[] l :this.plateau){
                if(l[i]== joueur.getId()){
                    count += 1;
                }
                if(count == 3){
                    valid = true;
                }
                i++;
            }
        }
        //check anti diag
        if(!valid){
            count = 0;
            int i = 2;
            for(int[] l :this.plateau){
                if(l[i]== joueur.getId()){
                    count += 1;
                }
                if(count == 3){
                    valid = true;
                }
                i--;
            }
        }
        return valid;
    }
}
