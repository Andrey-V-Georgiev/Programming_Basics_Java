package _13_The_Fifth_Exercises;

import java.util.Scanner;

/**
 * Created on 04-May-17.
 */
public class Butterfly_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row = 2 * n - 1;

        //Top
        for (int i = 1; i <= n - 2; i++) {

            //Left Top
            for (int j = 1; j <= n - 2; j++) {
                if (i % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }

            //MIddle Top
            System.out.print("\\ /");

            //Right Top
            for (int j = 1; j <= n - 2; j++) {
                if (i % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        //Middle
        for (int i = 1; i <=n-1 ; i++) {
            System.out.print(" ");
        }
        System.out.print("@");
        for (int i = 1; i <=n-1 ; i++) {
            System.out.print(" ");
        }
        System.out.println();

        //Bottom

        for (int i = 1; i <= n - 2; i++) {

            //Left Bottom
            for (int j = 1; j <= n - 2; j++) {
                if (i % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }

            //MIddle Bottom
            System.out.print("/ \\");

            //Right Bottom
            for (int j = 1; j <= n - 2; j++) {
                if (i % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }



    }
}
