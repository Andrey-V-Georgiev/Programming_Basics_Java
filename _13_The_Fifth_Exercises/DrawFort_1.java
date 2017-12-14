package _13_The_Fifth_Exercises;

import java.util.Scanner;

/**
 * Created on 03-May-17.
 */
public class DrawFort_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int rowAll=2*n;
        //Up
        System.out.print("/");
        int colR1=n/2;
        for (int i = 1; i <=colR1 ; i++) {
            System.out.print("^");
        }
        System.out.print("\\");
        int colMid1=rowAll-4-(2*colR1);
        for (int i = 1; i <=colMid1 ; i++) {
            System.out.print("_");
        }
        System.out.print("/");
        for (int i = 1; i <=colR1 ; i++) {
            System.out.print("^");
        }
        System.out.print("\\");
        System.out.println();

        //Midd1

        for (int i = 1; i <=n-3 ; i++) {
            System.out.print("|");
            for (int j = 1; j <=rowAll-2 ; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
        //Midd2
        System.out.print("|");
        int colR2=n/2+1;
        for (int i = 1; i <=colR2 ; i++) {
            System.out.print(" ");
        }
        int colMid2=rowAll-4-(2*colR1);
        for (int i = 1; i <=colMid2 ; i++) {
            System.out.print("_");
        }
        for (int i = 1; i <=colR2 ; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();

        //Down
        System.out.print("\\");
        int colR3=n/2;
        for (int i = 1; i <=colR3 ; i++) {
            System.out.print("_");
        }
        System.out.print("/");
        for (int i = 1; i <=colMid2 ; i++) {
            System.out.print(" ");
        }
        System.out.print("\\");
        for (int i = 1; i <=colR3 ; i++) {
            System.out.print("_");
        }
        System.out.print("/");

    }
}
