package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 02-May-17.
 */
public class Logistics_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());

        double tonsSum = 0;
        double tonsVan = 0;
        double tonsTruck = 0;
        double tonsTrain = 0;

        for (int i = 1; i <= n; i++) {
            double currTons = Double.parseDouble(scanner.nextLine());
            tonsSum += currTons;
            if (currTons <=3) {
                tonsVan = tonsVan + currTons;
            } else if (currTons >=4 && currTons <12) {
                tonsTruck = tonsTruck + currTons;
            } else if (currTons >=12) {
                tonsTrain = tonsTrain + currTons;
            }

        }
        double priceVan=tonsVan*200;
        double priceTruck=tonsTruck*175;
        double priceTrain=tonsTrain*120;

        double priceAll = priceVan+priceTruck+priceTrain;
        double priceAverage = priceAll / tonsSum;

        double percentVan = tonsVan / tonsSum * 100;
        double percentTruck=tonsTruck/tonsSum*100;
        double percentTrain=tonsTrain/tonsSum*100;

        System.out.printf("%.2f%n",priceAverage);
        System.out.printf("%.2f%%%n", percentVan);
        System.out.printf("%.2f%%%n",percentTruck);
        System.out.printf("%.2f%%%n",percentTrain);
    }
}
