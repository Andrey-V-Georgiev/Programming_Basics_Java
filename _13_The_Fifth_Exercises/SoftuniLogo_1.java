package _13_The_Fifth_Exercises;

import java.util.Scanner;

/**
 * Created on 03-May-17.
 */
public class SoftuniLogo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row=12*n-5;

        //UP 1
        int uL= (row-1)/2;
        int uM= 1;
        int uR=  (row-1)/2;

        for (int i = 1; i <= 2 * n; i++) {

            for (int j = 1; j <=uL ; j++) {
                System.out.print(".");
            }
            uL-=3;
            for (int j = 1; j <=uM ; j++) {
                System.out.print("#");
            }
            uM+=6;
            for (int j = 1; j <=uR ; j++) {
                System.out.print(".");
            }
            uR-=3;
            System.out.println();
        }

        //BODY 1
        int b_1L=2;
        int b_1R=3;
        int b_1M=row-6;

        for (int i = 1; i <=n-2 ; i++) {
            System.out.print("|");
            for (int j = 1; j <=b_1L ; j++) {
                System.out.print(".");
            }
            b_1L+=3;
            for (int j = 1; j <=b_1M ; j++) {
                System.out.print("#");
            }
            b_1M-=6;

            for (int j = 1; j <=b_1R ; j++) {
                System.out.print(".");
            }
            b_1R+=3;
            System.out.println();
        }
        //BODY 2
        int mid=6*n+1;
        int side1=((row-mid)/2)-1;
        int side2=(row-mid)/2;
        for (int i = 1; i <=n-1 ; i++) {
            System.out.print("|");
            for (int j = 1; j <=side1; j++) {
                System.out.print(".");
            }
            for (int j = 1; j <=mid ; j++) {
                System.out.print("#");
            }
            for (int j = 1; j <=side2; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
        System.out.print("@");
        for (int j = 1; j <=side1; j++) {
            System.out.print(".");
        }
        for (int j = 1; j <=mid ; j++) {
            System.out.print("#");
        }
        for (int j = 1; j <=side2; j++) {
            System.out.print(".");
        }



    }
}
