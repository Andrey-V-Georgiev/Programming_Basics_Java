package _04_20_November_2016_Morning;

import java.util.Scanner;

/**
 * Created by Ordna on 15-Apr-17.
 */
public class _6_Battles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokFirstP = Integer.parseInt(scanner.nextLine());
        int pokSecondP = Integer.parseInt(scanner.nextLine());
        int pokMaxV = Integer.parseInt(scanner.nextLine());
        String repeatSnapshoot=" ";
        int battleCounter=1;

        for (int i = 1; i <=pokFirstP ; i++) {
            for (int j = 1; j <=pokSecondP ; j++) {
                System.out.printf("(%d <-> %d) ",i,j);
                battleCounter++;
                if(pokMaxV<battleCounter){
                    return;
                }
            }

        }

    }

}
