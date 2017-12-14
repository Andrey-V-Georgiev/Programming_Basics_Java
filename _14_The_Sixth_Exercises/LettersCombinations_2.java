package _14_The_Sixth_Exercises;

import java.util.Scanner;

/**
 * Created on 05-May-17.
 */
public class LettersCombinations_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a =scanner.nextLine().charAt(0);
        char z =scanner.nextLine().charAt(0);
        char x =scanner.nextLine().charAt(0);
        int sum=0;

        for (char i = a; i <= z ; i++) {
            if(x==i){
                continue;
            }
            for (char j = a; j <= z ; j++) {
                if(x==j){
                    continue;
                }
                for (char k = a; k <= z ; k++) {
                    if(x==k){
                        continue;
                    }
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(k);
                    System.out.print(" ");
                    sum++;
                }

            }
        }
        System.out.print(sum);
    }
}
