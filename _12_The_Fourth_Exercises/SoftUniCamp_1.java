package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 30-Apr-17.
 */
public class SoftUniCamp_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peopleCar = 0;
        double peopleVan = 0;
        double peopleMicrobus = 0;
        double peopleBus = 0;
        double peopleTrain = 0;
        double peopleSum=0;

        double numGroups = Double.parseDouble(scanner.nextLine());
        for (int i = 1; i <= numGroups; i++) {
            double currPeople =Double.parseDouble(scanner.nextLine());
            if (currPeople>-1&&currPeople<6) {
                peopleSum+=currPeople;
                peopleCar +=currPeople;
            } else if (currPeople>5&&currPeople<13) {
                peopleSum+=currPeople;
                peopleVan+=currPeople;
            } else if (currPeople>12&&currPeople<26) {
                peopleSum+=currPeople;
                peopleMicrobus +=currPeople;
            } else if (currPeople>25&&currPeople<41) {
                peopleSum+=currPeople;
                peopleBus +=currPeople;
            } else if (currPeople>40) {
                peopleSum+=currPeople;
                peopleTrain +=currPeople;

            }
        }

        double percentCar=peopleCar/peopleSum*100;
        double percentVan=peopleVan/peopleSum*100;
        double percentMicrobus=peopleMicrobus/peopleSum*100;
        double percentBus=peopleBus/peopleSum*100;
        double percentTarin=peopleTrain/peopleSum*100;

        System.out.printf("%.2f%%%n",percentCar);
        System.out.printf("%.2f%%%n",percentVan);
        System.out.printf("%.2f%%%n",percentMicrobus);
        System.out.printf("%.2f%%%n",percentBus);
        System.out.printf("%.2f%%%n",percentTarin);


    }
}
