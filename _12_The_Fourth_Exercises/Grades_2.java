package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 02-May-17.
 */
public class Grades_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double r1 = 0;
        double r2 = 0;
        double r3 = 0;
        double r4 = 0;
        double rSum =0;


        for (int i = 1; i <= n; i++) {
            double curr = Double.parseDouble(scanner.nextLine());
            rSum+=curr;

            if (curr >= 2.00 && curr < 3.00) {
                r1++;
            } else if (curr >= 3.00 && curr < 4.00) {
                r2++;
            } else if (curr >= 4.00 && curr < 5.00) {
                r3++;
            } else if (curr >= 5.00) {
                r4++;
            }
        }
        double percent1=r1/n*100;
        double percent2=r2/n*100;
        double percent3=r3/n*100;
        double percent4=r4/n*100;


        double rAverage =rSum/n;

        System.out.printf("Top students: %.2f%%%n",percent4);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",percent3);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",percent2);
        System.out.printf("Fail: %.2f%%%n",percent1);
        System.out.printf("Average: %.2f",rAverage);
    }
}
