package _06_18_December_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 16-Apr-17.
 */
public class _5_ChristmasHat {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int rowW = 4 * n + 1;
        int rowH = 2 * n + 5;
        int b1=(rowW - 5)/2;
        int b2=1;
        int b3=1;
        int b4=(rowW - 5)/2;

        //First Part
        for (int i = 1; i <=n*2-1 ; i++) {
            System.out.print(".");
        }
        System.out.print("/|\\");
        for (int i = 1; i <=n*2-1 ; i++) {
            System.out.print(".");
        }
        System.out.println();
        //Second Part
        for (int i = 1; i <=n*2-1 ; i++) {
            System.out.print(".");
        }
        System.out.print("\\|/");
        for (int i = 1; i <=n*2-1 ; i++) {
            System.out.print(".");
        }
        System.out.println();
        //Third Part
        int a1=n*2-1;
        for (int i = 1; i <= a1; i++) {
            System.out.print(".");
        }a1--;
        System.out.print("***");

        int a2=n*2-1;
        for (int i = 1; i <= a2; i++) {
            System.out.print(".");
        }a2--;
        System.out.println();

        //Fourth Part
        for (int i = 1; i <=rowH-6 ; i++) {
            //Left 1

            for (int j = 1; j <= b1; j++) {
                System.out.print(".");
            }
            b1--;

            System.out.print("*");

            //Left 2

            for (int j = 1; j <=b2 ; j++) {
                System.out.print("-");
            }
            b2++;

            System.out.print("*");

            //Right 1

            for (int j = 1; j <=b3 ; j++) {
                System.out.print("-");
            }
            b3++;

            System.out.print("*");

            //Right 2

            for (int j = 1; j <= b4; j++) {
                System.out.print(".");
            }
            b4--;
            System.out.println();

        }
        //Fifth Part
        for (int i = 1; i <=4 * n + 1 ; i++) {
            System.out.print("*");
        }
        System.out.println();
        //Sixth Part
        for (int i = 1; i <=(4 * n + 1)/2 ; i++) {
            System.out.print("*.");
        }
        System.out.println("*");
        //Seventh Part
        for (int i = 1; i <=4 * n + 1 ; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
