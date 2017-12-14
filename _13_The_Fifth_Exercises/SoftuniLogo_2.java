package _13_The_Fifth_Exercises;

import java.util.Scanner;

/**
 * Created on 04-May-17.
 */
public class SoftuniLogo_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row = 12 * n - 5;

        int side1top = (row - 1) / 2;
        int side2top = (row - 1) / 2;
        int mid1top = 1;

        //TOP
        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= side1top; j++) {
                System.out.print(".");
            }
            side1top -= 3;

            for (int j = 1; j <= mid1top; j++) {
                System.out.print("#");
            }
            mid1top += 6;

            for (int j = 1; j <= side2top; j++) {
                System.out.print(".");
            }
            side2top -= 3;
            System.out.println();

        }

        //BODY

        int side1body = 2;
        int side2body = 3;
        int midd1body = row - 6;

        for (int i = 1; i <= n - 2; i++) {
            System.out.print("|");
            for (int j = 1; j <= side1body; j++) {
                System.out.print(".");
            }
            side1body += 3;

            for (int j = 1; j <= midd1body; j++) {
                System.out.print("#");
            }
            midd1body -= 6;
            for (int j = 1; j <= side2body; j++) {
                System.out.print(".");
            }
            side2body += 3;
            System.out.println();

        }

        //BOTTOM
        int midd1bottom = row - ((n - 1) * 6);
        int side1bottom = ((row - midd1bottom) / 2) - 1;
        int side2bottom = (row - midd1bottom) / 2;

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print("@");
            } else {
                System.out.print("|");
            }

            for (int j = 1; j <= side1bottom; j++) {
                System.out.print(".");
            }
            for (int j = 1; j <= midd1bottom; j++) {
                System.out.print("#");
            }
            for (int j = 1; j <= side2bottom; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
