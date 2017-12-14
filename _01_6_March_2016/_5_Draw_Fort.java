package _01_6_March_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 13-Apr-17.
 */
public class _5_Draw_Fort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sideColumn = n / 2;
        int middleColumn = (2 * n) - 4 - (2 * (n / 2));
        int middleBody = 2 * n - 2;
        //Upper part
        System.out.print("/");
        for (int i = 0; i < sideColumn; i++) {
            System.out.print("^");
        }
        System.out.print("\\");
        for (int i = 0; i < middleColumn; i++) {
            System.out.print("_");
        }
        System.out.print("/");
        for (int i = 0; i < sideColumn; i++) {
            System.out.print("^");
        }
        System.out.println("\\");

        //Middle Part

        for (int i = 0; i < n - 3; i++) {
            System.out.print("|");
            for (int j = 0; j < middleBody; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        //Pre-lower Part
        System.out.print("|");
        for (int i = 0; i < sideColumn+1; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < middleColumn; i++) {
            System.out.print("_");
        }
        for (int i = 0; i < sideColumn+1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");

        //Lower Part
        System.out.print("\\");
        for (int i = 0; i < sideColumn; i++) {
            System.out.print("_");
        }
        System.out.print("/");
        for (int i = 0; i < middleColumn; i++) {
            System.out.print(" ");
        }
        System.out.print("\\");
        for (int i = 0; i < sideColumn; i++) {
            System.out.print("_");
        }
        System.out.print("/");
    }
}
