package vue;

import java.util.Scanner;

public class Vue {
    public String mode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Nouvelle partie   2 : Rejoindre une partie");
        return sc.nextLine();
    }
}
