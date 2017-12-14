package _13_The_Fifth_Exercises;

import java.util.Scanner;

/**
 * Created on 04-May-17.
 */
public class Rocket_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row=3*n;
        int side1top=(row-2)/2;
        int side2top=(row-2)/2;
        int mid1top=0;

        //TOP
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=side1top ; j++) {
                System.out.print(".");
            }
            side1top--;

            System.out.print("/");

            for (int j = 0; j <mid1top ; j++) {
                System.out.print(" ");
            }
            mid1top+=2;

            System.out.print("\\");

            for (int j = 1; j <=side2top ; j++) {
                System.out.print(".");
            }
            side2top--;
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

        //BODY
        for (int i = 1; i <=n*2 ; i++) {
            for (int j = 1; j <=n/2 ; j++) {
                System.out.print(".");
            }
            System.out.print("|");

            int midd1body= row-(n+2);
            for (int j = 1; j <=midd1body ; j++) {
                System.out.print("\\");
            }
            System.out.print("|");
            for (int j = 1; j <=n/2 ; j++) {
                System.out.print(".");
            }
            System.out.println();
        }

        //BOTTOM

        int side1bottom=n/2;
        int side2bottom=n/2;
        int mid1bott=row-(n+2);

        for (int i = 1; i <=n/2 ; i++) {
            for (int j = 1; j <= side1bottom; j++) {
                System.out.print(".");
            }
            side1bottom--;
            System.out.print("/");

            for (int j = 0; j <mid1bott ; j++) {
                System.out.print("*");
            }
            mid1bott+=2;
            System.out.print("\\");
            for (int j = 1; j <=side2bottom ; j++) {
                System.out.print(".");
            }
            side2bottom--;
            System.out.println();

        }


    }
}
