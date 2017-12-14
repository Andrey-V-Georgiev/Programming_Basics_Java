package _07_18_March_2017;

import java.util.Scanner;

/**
 * Created by Ordna on 18-Apr-17.
 */
public class _5_SoftuniLogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Integer.parseInt(scanner.nextLine());
        double row = 12 * n - 5;
        double c1 =(row -1)/ 2;
        double c2 = 1;
        double c3 = (row -1)/ 2;
        double c4 =2;
        double c5 = row-6;
        double c6 = 3;
        double c7 = ((n-1)*3)-1;
        double c8 = (n-1)*3 ;
        double c9 = 1;

        //First Part
        for (int i = 1; i <= 2 * n; i++) {
            //Left Side

            for (int j = 1; j <= c1; j++) {
                System.out.print(".");
            }
            c1-=3;
            //Midd Part

            for (int j = 1; j <= c2; j++) {
                System.out.print("#");
            }
            c2 = c2 + 6;
            //Right Part

            for (int j = 1; j <= c3; j++) {
                System.out.print(".");
            }
            c3-=3;
            System.out.println();
        }
        //Second Part
        for (int i = 1; i <=n-2; i++) {
            System.out.print("|");
            //Left Side
            for (int j =1; j <=c4 ; j++) {
                System.out.print(".");
            }
            c4+=3;
            //Midd Part
            for (int j = 1; j <= c5; j++) {
                System.out.print("#");
            }
            c5-=6;
            //Right Part
            for (int j =1; j <=c6 ; j++) {
                System.out.print(".");
            }
            c6+=3;
            System.out.println();

        }
        //Third Part
        for (int i = 1; i <=n-1 ; i++) {
            //Left Part
            System.out.print("|");
            for (int j = 0; j < c7; j++) {
                System.out.print(".");
            }
            for (int j = 0; j <row-(c7+c8)-1 ; j++) {
                System.out.print("#");
            }
            for (int j = 0; j < c8; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
        //Forth Part
        //Left Part
        System.out.print("@");
        for (int j = 0; j < c7; j++) {
            System.out.print(".");
        }
        for (int j = 0; j <row-(c7+c8)-1 ; j++) {
            System.out.print("#");
        }
        for (int j = 0; j < c8; j++) {
            System.out.print(".");
        }


    }
}

