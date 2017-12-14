package _13_The_Fifth_Exercises;

import java.util.Scanner;

/**
 * Created on 03-May-17.
 */
public class Rocket_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row = 3 * n;
        int c1L = (row- 2) / 2 ;
        int c1M = 0;
        int c1R = (row- 2) / 2 ;
        //TOP 1
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= c1L; j++) {
                System.out.print(".");
            }

            c1L--;

            System.out.print("/");

            for (int j = 1; j <= c1M; j++) {
                System.out.print(" ");
            }
            c1M += 2;

            System.out.print("\\");

            for (int j = 1; j <= c1R; j++) {
                System.out.print(".");
            }
            c1R--;
            System.out.println();
        }

        //TOP 2
        for (int i = 1; i <=n/2 ; i++) {
            System.out.print(".");
        }
        for (int i = 1; i <=row-n ; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <=n/2 ; i++) {
            System.out.print(".");
        }
        System.out.println();
        
        //BODY 1
        for (int i = 1; i <=2*n ; i++) {

            for (int j = 1; j <=n/2 ; j++) {
                System.out.print(".");
            }
            System.out.print("|");

            for (int j = 1; j <=row-(n+2) ; j++) {
                System.out.print("\\");
            }
            System.out.print("|");
            for (int j = 1; j <=n/2 ; j++) {
                System.out.print(".");
            }
            System.out.println();
            
        }
        //BOTTOM 1
        int cB1=n/2;
        int cBmidd=row-(n+2);
        int cB2=n/2;

        for (int i = 1; i <=n/2 ; i++) {
            for (int j = 1; j <=cB1 ; j++) {
                System.out.print(".");
            }
            cB1--;
            System.out.print("/");
            for (int j = 1; j <=cBmidd ; j++) {
                System.out.print("*");
            }
            cBmidd+=2;
            System.out.print("\\");
            for (int j = 1; j <=cB2 ; j++) {
                System.out.print(".");
            }
            cB2--;
            System.out.println();


        }

    }

}


