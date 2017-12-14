package _13_The_Fifth_Exercises;

import java.util.Scanner;

/**
 * Created on 03-May-17.
 */
public class Axe_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row = 5 * n;
        int countMidd1 = 0;
        int counterUP_R = row - (3 * n + 2);
        //UP1
        for (int i = 1; i <= n; i++) {
            //LEFT1
            for (int j = 1; j <= 3 * n; j++) {
                System.out.print("-");
            }
            System.out.print("*");

            //MIDD1

            for (int j = 0; j < countMidd1; j++) {

                System.out.print("-");


            }
            countMidd1++;
            System.out.print("*");
            for (int j = 1; j <= counterUP_R; j++) {
                System.out.print("-");
            }
            counterUP_R--;
            System.out.println();
        }

        //MIDD Part 1
        int countMIDDrows = n / 2;
        for (int i = 1; i <= countMIDDrows; i++) {

            for (int j = 1; j <= 3 * n; j++) {
                System.out.print("*");
            }
            System.out.print("*");

            for (int j = 1; j <= n - 1; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 1; j <= n - 1; j++) {
                System.out.print("-");
            }

            System.out.println();
        }

        //PART DOWN 1
        int countDown1 = 3 * n;
        int countDown2 = n - 1;
        int countDown3 = n - 1;

        for (int i = 1; i <=n/2 ; i++) {

            for (int j = 1; j <= countDown1; j++) {
                System.out.print("-");
            }
            countDown1--;
            System.out.print("*");

            for (int j = 1; j <= countDown2; j++) {
                if(i==n/2){
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }
            }
            countDown2 += 2;
            System.out.print("*");

            for (int j = 1; j <= countDown3; j++) {
                System.out.print("-");
            }
            countDown3--;
            System.out.println();

        }
    }
}


