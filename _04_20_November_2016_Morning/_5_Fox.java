package _04_20_November_2016_Morning;

import java.util.Scanner;

/**
 * Created by Ordna on 14-Apr-17.
 */
public class _5_Fox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int rowLength = 2 * n + 3;
        int middCounterUpPart = (n * 2) - 1;
        int middCountMiddPart = n;
        int middCounterDownPart=(n * 2) - 1;
        int sideMiddPart = (rowLength - 4 - middCountMiddPart) / 2;

        //upPart
        for (int i = 1; i <= n; i++) {

            //leftSideUp
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.print("\\");

            //midPartUp
            {

                for (int j = 1; j <= middCounterUpPart; j++) {
                    System.out.print("-");
                }
                middCounterUpPart -= 2;
            }

            System.out.print("/");

            //rightPartUp
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        //middlePart
        for (int i = 1; i <=(int) n/3; i++) {
            //leftMiddMidd
            System.out.print("|");
            for (int j = 1; j <= sideMiddPart; j++) {
                System.out.print("*");
            }

            System.out.print("\\");

            //middlePartMiddle
            for (int j = 1; j <= middCountMiddPart; j++) {
                System.out.print("*");
            }
            middCountMiddPart -= 2;

            System.out.print("/");
            //rightMiddMidd
            for (int j = 1; j <= sideMiddPart; j++) {
                System.out.print("*");
            }
            System.out.print("|");
            sideMiddPart++;
            System.out.println();

        }

        //DownPart
        for (int i = 1; i <= n; i++) {

            //leftSideDown
            for (int j = 1; j <= i; j++) {
                System.out.print("-");
            }

            System.out.print("\\");

            //midPartDown
            {

                for (int j = 1; j <= middCounterDownPart; j++) {
                    System.out.print("*");
                }
                middCounterDownPart -= 2;
            }

            System.out.print("/");

            //rightPartDown
            for (int j = 1; j <= i; j++) {
                System.out.print("-");
            }

            System.out.println();

        }


    }
}
