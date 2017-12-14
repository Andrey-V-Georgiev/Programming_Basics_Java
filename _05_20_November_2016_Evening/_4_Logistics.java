package _05_20_November_2016_Evening;

import java.util.Scanner;

/**
 * Created by Ordna on 15-Apr-17.
 */
public class _4_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLoads = Integer.parseInt(scanner.nextLine());
        double weightTogether = 0;
        double weightCar = 0;
        double weightTruck = 0;
        double weightTrain = 0;


        for (int i = 1; i <= numLoads; i++) {
            int weightT = Integer.parseInt(scanner.nextLine());
            weightTogether += weightT;

            if (weightT <= 3) {
                weightCar += weightT;
            } else if (weightT > 3 && weightT <= 11) {
                weightTruck += weightT;
            } else {
                weightTrain += weightT;
            }

        }
        double percentCar = weightCar/weightTogether*100;
        double percentTruck = weightTruck/weightTogether*100;
        double percentTrain = weightTrain/weightTogether*100;

        double priceCar = weightCar * 200;
        double priceTruck = weightTruck * 175;
        double priceTrain = weightTrain * 120;

        double averagePrice =(priceCar+priceTruck+priceTrain)/weightTogether;

        System.out.printf("%.2f%n%.2f%%%n%.2f%%%n%.2f%%%n",averagePrice,percentCar,percentTruck,percentTrain);

    }
}
