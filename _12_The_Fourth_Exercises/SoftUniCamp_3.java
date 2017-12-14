package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 02-May-17.
 */
public class SoftUniCamp_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double pCar = 0;
        double pVan = 0;
        double pMinivan = 0;
        double pBus = 0;
        double pTrain = 0;
        double pSum = 0;

        for (int i = 1; i <= n; i++) {
            double curr = Double.parseDouble(scanner.nextLine());
            pSum = pSum + curr;

            if (curr < 6) {
                pCar = pCar + curr;
            } else if (curr >= 6 && curr < 13) {
                pVan = pVan + curr;

            } else if (curr >= 13 && curr < 26) {
                pMinivan = pMinivan + curr;
            } else if (curr >= 26 && curr < 41) {
                pBus = pBus + curr;
            } else if (curr >= 41) {
                pTrain = pTrain + curr;

            }


        }
        double percentCar=pCar/pSum*100;
        double percentVan=pVan/pSum*100;
        double percentMinivan=pMinivan/pSum*100;
        double percentBus=pBus/pSum*100;
        double percentTrain=pTrain/pSum*100;

        System.out.printf("%.2f%%%n",percentCar);
        System.out.printf("%.2f%%%n",percentVan);
        System.out.printf("%.2f%%%n",percentMinivan);
        System.out.printf("%.2f%%%n",percentBus);
        System.out.printf("%.2f%%%n",percentTrain);

    }
}
