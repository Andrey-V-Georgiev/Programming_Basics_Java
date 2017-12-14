package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 02-May-17.
 */
public class Logistics_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double tonsSum = 0;
        double tonsBus = 0;
        double tonsLorry = 0;
        double tonsTrain = 0;

        for (int i = 1; i <= n; i++) {
            double currT = Double.parseDouble(scanner.nextLine());
            tonsSum = tonsSum + currT;

            if (currT >= 0 && currT < 4) {
                tonsBus = tonsBus + currT;

            } else if (currT >= 4 && currT < 12) {
                tonsLorry = tonsLorry + currT;

            } else if (currT >= 12) {
                tonsTrain=tonsTrain+currT;

            }
        }
        double moneyBus= tonsBus*200;
        double moneyLorry= tonsLorry*175;
        double moneyTrain= tonsTrain*120;
        double moneyAverage= (moneyBus+moneyLorry+moneyTrain)/tonsSum;

        double percentBus = tonsBus / tonsSum * 100;
        double percentLorry = tonsLorry / tonsSum * 100;
        double percentTrain = tonsTrain / tonsSum * 100;

        System.out.printf("%.2f%n",moneyAverage);
        System.out.printf("%.2f%%%n",percentBus);
        System.out.printf("%.2f%%%n",percentLorry);
        System.out.printf("%.2f%%%n",percentTrain);


    }

}
