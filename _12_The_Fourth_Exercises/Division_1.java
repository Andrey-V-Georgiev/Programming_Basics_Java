package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 30-Apr-17.
 */
public class Division_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        ;

        for (int i = 0; i < n; i++) {
            int curr = Integer.parseInt(scanner.nextLine());
            if (curr % 2 == 0) {
                p1++;
            }
            if (curr % 3 == 0) {
                p2++;
            }
            if (curr % 4 == 0) {
                p3++;
            }

        }
        double p1Percent = p1/n*100;
        double p2Percent = p2/n*100;
        double p3Percent = p3/n*100;



        System.out.printf("%.2f%s%n",p1Percent,"%");
        System.out.printf("%.2f%s%n",p2Percent,"%");
        System.out.printf("%.2f%s%n",p3Percent,"%");

    }
}
