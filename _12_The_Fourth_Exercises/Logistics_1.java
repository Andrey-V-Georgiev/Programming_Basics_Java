package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 30-Apr-17.
 */
public class Logistics_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());

        double busT = 0;
        double truckT = 0;
        double trainT = 0;

        double priceSum = 0;
        double tonsSum = 0;



        for (int i = 1; i <= n; i++) {

            double currT = Double.parseDouble(scanner.nextLine());

            if (currT > -1 && currT <= 3) {
                busT = busT + currT;
                priceSum = priceSum + (currT * 200);
                tonsSum += currT;
            } else if (currT > 3 && currT <= 11) {
                truckT = truckT + currT;
                priceSum = priceSum + (currT * 175);
                tonsSum += currT;
            } else if (currT > 11) {
                trainT = trainT + currT;
                priceSum = priceSum + (currT * 120);
                tonsSum += currT;
            }
        }

        double averagePrice = priceSum / tonsSum;
        double busPercent =busT/tonsSum*100;
        double truckPercent = truckT/tonsSum*100;
        double trainPercent = trainT/tonsSum*100;


        System.out.printf("%.2f%n",averagePrice);
        System.out.printf("%.2f%%%n",busPercent);
        System.out.printf("%.2f%%%n",truckPercent);
        System.out.printf("%.2f%%%n",trainPercent);

    }
}
