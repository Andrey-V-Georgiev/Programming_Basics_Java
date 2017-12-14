package _13_The_Fifth_Exercises;

import java.util.Scanner;

/**
 * Created on 04-May-17.
 */
public class ChristmasHat_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row = 4 * n + 1;

        //TOP
        int side1top = 2 * n - 1;
        int side2top = 2 * n - 1;

//top 1.1
        for (int j = 1; j <= side1top; j++) {
            System.out.print(".");
        }
        System.out.print("/|\\");
        for (int j = 1; j <= side1top; j++) {
            System.out.print(".");
        }
        System.out.println();


//top 1.2
        for (int j = 1; j <= side1top; j++) {
            System.out.print(".");
        }
        System.out.print("\\|/");
        for (int j = 1; j <= side1top; j++) {
            System.out.print(".");
        }
        System.out.println();

        //BODY
        int side1body = 2 * n - 1;
        int side2body = 2 * n - 1;
        int mid1body = 1;
        int mid2body = 1;

        for (int i = 1; i <= 2 * n; i++) {


            for (int j = 1; j <= side1body; j++) {
                System.out.print(".");
            }
            side1body--;

            System.out.print("*");

            //midd left
            for (int j = 1; j <mid1body; j++) {
                System.out.print("-");
            }
            mid1body++;

            System.out.print("*");

            //midd right
            for (int j = 1; j < mid2body; j++) {
                System.out.print("-");
            }
            mid2body++;

            System.out.print("*");


            for (int j = 1; j <= side2body; j++) {
                System.out.print(".");
            }
            side2body--;

            System.out.println();
        }

        //BOTTOM

        for (int i = 1; i <=row ; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <=2*n ; i++) {
            System.out.print("*.");
        }
        System.out.print("*");
        System.out.println();

        for (int i = 1; i <=row ; i++) {
            System.out.print("*");
        }

    }
}
