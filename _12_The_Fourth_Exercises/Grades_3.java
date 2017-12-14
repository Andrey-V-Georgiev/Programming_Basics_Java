package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 02-May-17.
 */
public class Grades_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double pSum = 0;


        for (int i = 1; i <= n; i++) {
            double curr = Double.parseDouble(scanner.nextLine());
            pSum = pSum + curr;
            if (curr >= 2.00 && curr < 3.00) {
                p1++;
            }else if(curr >= 3.00 && curr < 4.00){
                p2++;
            }else if(curr >= 4.00 && curr < 5.00){
                p3++;
            }else if(curr>=5.00){
                p4++;
            }


        }
        double pAverage = pSum / n;
        double percent1 = p1 / n * 100;
        double percent2 = p2 / n * 100;
        double percent3 = p3 / n * 100;
        double percent4 = p4 / n * 100;


        System.out.printf("Top students: %.2f%%%n", percent4);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percent3);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percent2);
        System.out.printf("Fail: %.2f%%%n", percent1);
        System.out.printf("Average: %.2f", pAverage);

    }
}
