package _05_20_November_2016_Evening;

import java.util.Scanner;

/**
 * Created by Ordna on 15-Apr-17.
 */
public class _5_Rocket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double width = 3 * n;
        double counter1_1 = (width - 2) / 2;
        double counter2_1 = width - (((width - 2) / 2) * 2 + 2);
        double counter3_1 = (width - 2) / 2;
        double counter1_4 =n / 2;
        double counter2_4 =n*2-2;
        double counter3_4 =n / 2;

        //FIRST PART
        for (int i = 1; i <= n; i++) {

            //Left

            for (int j = 1; j <= counter1_1; j++) {
                System.out.print(".");
            }
            counter1_1 -= 1;
            System.out.print("/");

            //Middle

            for (int j = 0; j < counter2_1; j++) {
                System.out.print(" ");
            }
            counter2_1 += 2;

            System.out.print("\\");

            //Right

            for (int j = 1; j <= counter3_1; j++) {
                System.out.print(".");
            }
            counter3_1 -= 1;
            System.out.println();

        }

        //SECOND PART
        //leftPart
        for (int i = 0; i < n / 2; i++) {
            System.out.print(".");
        }
        //middPart
        for (int i = 0; i < 2 * n; i++) {
            System.out.print("*");
        }
        //rightPart
        for (int i = 0; i < n / 2; i++) {
            System.out.print(".");
        }
        System.out.println();

        //THIRT PART
        for (int i = 0; i < n * 2; i++) {

            //leftPart
            for (int j = 0; j < n / 2; j++) {
                System.out.print(".");
            }
            System.out.print("|");
            //middPart
            for (int j = 0; j < (n * 2) - 2; j++) {
                System.out.print("\\");
            }
            System.out.print("|");
            //rightPart
            for (int j = 0; j < n / 2; j++) {
                System.out.print(".");
            }
            System.out.println();

        }
        //FOURTH PART
        for (int i = 0; i < n / 2; i++) {

            //leftPart
            for (int j = 0; j <counter1_4; j++) {
                System.out.print(".");
            }
            counter1_4--;
            System.out.print("/");
            //middPart
            for (int j = 0; j < counter2_4; j++) {
                System.out.print("*");
            }
            counter2_4+=2;
            System.out.print("\\");
            //rightPart
            for (int j = 0; j <counter3_4; j++) {
                System.out.print(".");
            }
            counter3_4--;
            System.out.println();

        }
    }

}

