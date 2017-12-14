package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 01-May-17.
 */
public class Division_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 1; i <= n; i++) {
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
        double percent1=p1/n*100;
        double percent2=p2/n*100;
        double percent3=p3/n*100;

        System.out.printf("%.2f%%%n",percent1);
        System.out.printf("%.2f%%%n",percent2);
        System.out.printf("%.2f%%%n",percent3);

    }
}
