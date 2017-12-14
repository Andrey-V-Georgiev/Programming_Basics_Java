package _13_The_Fifth_Exercises;

import java.util.Scanner;

/**
 * Created on 04-May-17.
 */
public class Fox_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int row=2*n+3;
        int side1top=1;
        int side2top=1;
        int midd1top=row-4;

        //top
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=side1top ; j++) {
                System.out.print("*");
            }
            side1top++;

            System.out.print("\\");

            for (int j = 1; j <=midd1top ; j++) {
                System.out.print("-");
            }
            midd1top-=2;
            System.out.print("/");

            for (int j = 1; j <=side2top ; j++) {
                System.out.print("*");
            }
            side2top++;
            System.out.println();

        }

        //body
        int side1body=n/2;
        int side2body=n/2;
        int midd1body=row-4-((n/2)*2);
        int h1body=n/3;

        for (int i = 1; i <=h1body ; i++) {
            System.out.print("|");
            for (int j = 1; j <=side1body ; j++) {
                System.out.print("*");
            }
            side1body++;

            System.out.print("\\");
            for (int j = 1; j <=midd1body ; j++) {
                System.out.print("*");
            }
            midd1body-=2;
            System.out.print("/");
            for (int j = 1; j <=side2body ; j++) {
                System.out.print("*");
            }
            side2body++;
            System.out.print("|");
            System.out.println();
            
        }

        // /bottom

        int side1bott=1;
        int side2bott=1;
        int midd1bott=row-4;


        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=side1bott ; j++) {
                System.out.print("-");
            }
            side1bott++;

            System.out.print("\\");

            for (int j = 1; j <=midd1bott ; j++) {
                System.out.print("*");
            }
            midd1bott-=2;
            System.out.print("/");

            for (int j = 1; j <=side2bott ; j++) {
                System.out.print("-");
            }
            side2bott++;
            System.out.println();

        }



    }
}
