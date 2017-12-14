package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 30-Apr-17.
 */
public class Grades_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double rate1 = 0;
        double rate2 = 0;
        double rate3 = 0;
        double rate4 = 0;
        double rateSum = 0;

        for (int i = 1; i <= n; i++) {
            double curr = Double.parseDouble(scanner.nextLine());

            rateSum = rateSum + curr;
            if (curr > 1.99 && curr < 3.00) {
                rate1++;
            } else if (curr > 2.99 && curr < 4.00) {
                rate2++;
            } else if (curr > 3.99 && curr < 5.00) {
                rate3++;

            }else if (curr > 4.99) {
                rate4++;
            }

        }
        double percent1=rate1/n*100;
        double percent2=rate2/n*100;
        double percent3=rate3/n*100;
        double percent4=rate4/n*100;
        double averageRate=rateSum/n;

        System.out.printf("Top students: %.2f%%%n",percent4);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",percent3);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",percent2);
        System.out.printf("Fail: %.2f%%%n",percent1);
        System.out.printf("Average: %.2f",averageRate);

    }
}
