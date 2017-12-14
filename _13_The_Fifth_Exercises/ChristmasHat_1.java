package _13_The_Fifth_Exercises;

import java.util.Scanner;

/**
 * Created on 03-May-17.
 */
public class ChristmasHat_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row = 4 * n + 1;
        //UP1
        for (int i = 1; i <= n * 2 - 1; i++) {
            System.out.print(".");
        }
        System.out.print( "/|\\");
        for (int i = 1; i <= n * 2 - 1; i++) {
            System.out.print(".");
        }
        System.out.println();
        //UP2
        for (int i = 1; i <= n * 2 - 1; i++) {
            System.out.print(".");
        }
        System.out.print("\\|/");
        for (int i = 1; i <= n * 2 - 1; i++) {
            System.out.print(".");
        }
        System.out.println();
       //UP3
        for (int i = 1; i <= n * 2 - 1; i++) {
            System.out.print(".");
        }
        System.out.print("***");
        for (int i = 1; i <= n * 2 - 1; i++) {
            System.out.print(".");
        }
        System.out.println();
        //BODY1
        int countB1=1;
        int countB2=1;
        int countBleft=n * 2 - 2;
        int countBright=n * 2 - 2;
        for (int i = 1; i <=n*2-1 ; i++) {


            for (int j = 1; j <=countBleft ; j++) {
                System.out.print(".");
            }
            countBleft--;
            System.out.print("*");

            for (int j = 0; j <countB1 ; j++) {
                System.out.print("-");
            }
            countB1++;
            System.out.print("*");
            for (int j = 0; j <countB2 ; j++) {
                System.out.print("-");
            }
            countB2++;
            System.out.print("*");
            for (int j = 1; j <=countBright; j++) {
                System.out.print(".");
            }
            countBright--;
            System.out.println();

        }
        //BOTTOM1
        for (int i = 1; i <=row ; i++) {
            System.out.print("*");
        }
        System.out.println();
        //BOTTOM2
        for (int i = 1; i <n*2+1 ; i++) {
            System.out.print("*.");
        }
        System.out.print("*");
        System.out.println();

        //BOTTOM3
        for (int i = 1; i <=row ; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
