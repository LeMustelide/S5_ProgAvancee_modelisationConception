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

    public boolean conditionVictoire(){
        boolean valid = false;
        for(int[] l :this.plateau){
            if(l[1]==){

            }
        }
        return valid;
    }
}
