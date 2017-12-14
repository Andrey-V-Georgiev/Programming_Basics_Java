package _13_The_Fifth_Exercises;

import java.util.Scanner;

/**
 * Created on 04-May-17.
 */
public class DrawFort_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row = 2 * n;
        //TOP
        int count1 = n / 2;
        int count2 = n / 2;
        int count3 = n / 2;
        int count4 = n / 2;
        int midd= row-(4+((n/2)*2));

        //TOP
        System.out.print("/");
        for (int i = 1; i <= count1; i++) {
            System.out.print("^");
        }
        System.out.print("\\");
        for (int i = 1; i <= midd; i++) {
            System.out.print("_");
        }
        System.out.print("/");
        for (int i = 1; i <= count1; i++) {
            System.out.print("^");
        }
        System.out.print("\\");
        System.out.println();

        //BODY 1
        for (int i = 1; i <= n - 3; i++) {
            System.out.print("|");
            for (int j = 1; j <= row - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
        //BODY 2
        System.out.print("|");
        for (int i = 1; i <=n/2+1 ; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <=midd; i++) {
            System.out.print("_");
        }
        for (int i = 1; i <=n/2+1 ; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();

        //BOTTOM
        System.out.print("\\");
        for (int i = 1; i <=n/2 ; i++) {
            System.out.print("_");
        }
        System.out.print("/");
        for (int i = 1; i <=midd ; i++) {
            System.out.print(" ");
        }
        System.out.print("\\");
        for (int i = 1; i <=n/2 ; i++) {
            System.out.print("_");
        }
        System.out.print("/");

    }
}
