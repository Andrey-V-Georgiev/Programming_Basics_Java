package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 02-May-17.
 */
public class GameOfIntervals_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double points = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        double p6 = 0;


        for (int i = 1; i <= n; i++) {
            double curr = Double.parseDouble(scanner.nextLine());

            if (curr >= 0 && curr < 10) {
                p1++;
                points=points+(curr*0.20);
            } else if (curr >= 10 && curr < 20) {
                p2++;
                points=points+(curr*0.30);
            } else if (curr >= 20 && curr < 30) {
                p3++;
                points=points+(curr*0.40);
            } else if (curr >= 30 && curr < 40) {
                p4++;
                points=points+50;
            } else if (curr >= 40 && curr < 51) {
                p5++;
                points=points+100;
            } else if (curr < 0 || curr > 50) {
                p6++;
                points=points/2;
            }

        }
        double percent1 = p1 / n * 100;
        double percent2 = p2 / n * 100;
        double percent3 = p3 / n * 100;
        double percent4 = p4 / n * 100;
        double percent5 = p5 / n * 100;
        double percent6 = p6 / n * 100;

        System.out.printf("%.2f%n",points);
        System.out.printf("From 0 to 9: %.2f%%%n",percent1);
        System.out.printf("From 10 to 19: %.2f%%%n",percent2);
        System.out.printf("From 20 to 29: %.2f%%%n",percent3);
        System.out.printf("From 30 to 39: %.2f%%%n",percent4);
        System.out.printf("From 40 to 50: %.2f%%%n",percent5);
        System.out.printf("Invalid numbers: %.2f%%%n",percent6);

    }
}
