package _14_The_Sixth_Exercises;

import java.util.Scanner;

/**
 * Created on 05-May-17.
 */
public class LettersCombinations_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char z = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);
        int sum = 0;

        for (char i = a; i <= z ; i++) {
            if(i==c){
                continue;
            }
            for (char j = a; j <=z ; j++) {
                if(j==c){
                    continue;
                }
                for (char k = a; k <=z ; k++) {
                    if(k==c){
                        continue;
                    }

                    System.out.printf("%c%c%c ",i,j,k);
                    sum++;
                }
            }
        }
        System.out.print(sum);

    }
}

