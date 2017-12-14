package _14_The_Sixth_Exercises;

import java.util.Scanner;

/**
 * Created on 06-May-17.
 */
public class MaxCombination_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int finish= Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        int counter=0;

        for (int i = start; i <=finish ; i++) {
            for (int j = start; j <=finish ; j++) {
                counter++;
                System.out.printf("<%d-%d>",i,j);
                if(counter==max){
                    return;
                }

            }
        }



    }

}
