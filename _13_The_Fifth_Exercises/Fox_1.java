package _13_The_Fifth_Exercises;

import java.util.Scanner;

/**
 * Created on 03-May-17.
 */
public class Fox_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row=2*n+3;

        //TOP 1
        int topCleft=1;
        int topCright=1;

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=topCleft ; j++) {
                System.out.print("*");
            }
            topCleft++;

            System.out.print("\\");

            for (int j = 1; j <=row-(i*2+2) ; j++) {
                System.out.print("-");
            }

            System.out.print("/");

            for (int j = 1; j <=topCright ; j++) {
                System.out.print("*");
            }
            topCright++;
            System.out.println();
        }
        //BODY 1
        int bodyCleft=n/2;
        int bodyCright=n/2;
        int bodyCmidd=n;

        for (int i = 1; i <=n/3 ; i++) {

            System.out.print("|");

            for (int j = 1; j <=bodyCleft ; j++) {
                System.out.print("*");
            }
            bodyCleft++;

            System.out.print("\\");

            for (int j = 1; j <=bodyCmidd ; j++) {
                System.out.print("*");
            }
            bodyCmidd-=2;

            System.out.print("/");

            for (int j = 1; j <=bodyCright ; j++) {
                System.out.print("*");
            }
            bodyCright++;
            System.out.print("|");
            System.out.println();
        }

        //BOTTOM
        int bottomCleft=1;
        int bottomCright=1;

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=bottomCleft ; j++) {
                System.out.print("-");
            }
            bottomCleft++;

            System.out.print("\\");

            for (int j = 1; j <=row-(i*2+2) ; j++) {
                System.out.print("*");
            }
            System.out.print("/");

            for (int j = 1; j <=bottomCright ; j++) {
                System.out.print("-");
            }
            bottomCright++;
            System.out.println();
        }


    }
}
