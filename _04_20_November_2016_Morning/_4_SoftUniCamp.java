package _04_20_November_2016_Morning;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Ordna on 14-Apr-17.
 */
public class _4_SoftUniCamp {
    public static void main(String[] arge) {
        Scanner scanner = new Scanner(System.in);
        int groupsNum = Integer.parseInt(scanner.nextLine());
        int carP = 0;
        int vanP = 0;
        int mbusP = 0;
        int busP = 0;
        int trainP = 0;
        int allP = 0;

        for (int i = 0; i < groupsNum; i++) {

            int groupPersons = Integer.parseInt(scanner.nextLine());
            allP += groupPersons;
            if (groupPersons <=5) {
                carP += groupPersons;
            } else if (groupPersons > 5 && groupPersons <= 12) {
                vanP += groupPersons;
            } else if (groupPersons > 12 && groupPersons <= 25) {
                mbusP += groupPersons;
            } else if (groupPersons > 25 && groupPersons <= 40) {
                busP += groupPersons;
            } else if (groupPersons > 40) {
                trainP += groupPersons;
            }
        }

        double percentCar =(double) carP / allP * 100;
        double percentVan = (double)vanP / allP * 100;
        double percentMbus =(double) mbusP / allP * 100;
        double percentBus =(double) busP / allP * 100;
        double percentTrain = (double)trainP / allP * 100;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(df.format(percentCar) + "%");
        System.out.println(df.format(percentVan) + "%");
        System.out.println(df.format(percentMbus) + "%");
        System.out.println(df.format(percentBus) + "%");
        System.out.println(df.format(percentTrain) + "%");
    }

}


