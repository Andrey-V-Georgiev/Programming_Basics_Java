package _15_Izpit_07_May_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 05-May-17.
 */
public class _4_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacityStadion = Double.parseDouble(scanner.nextLine());
        double numAllFens = Double.parseDouble(scanner.nextLine());

        double numA = 0;
        double numB = 0;
        double numV = 0;
        double numG = 0;

        double percentA = 0;
        double percentB = 0;
        double percentV = 0;
        double percentG = 0;
        double percentAll = 0;


        for (int i = 1; i <= numAllFens; i++) {
            String currSector = scanner.nextLine();

            if (currSector.equals("A")) {
                numA++;
            } else if (currSector.equals("B")) {
                numB++;
            } else if (currSector.equals("V")) {
                numV++;
            } else if (currSector.equals("G")) {
                numG++;
            }

        }

        DecimalFormat df = new DecimalFormat("0.00");
         percentA = numA/numAllFens*100;
         percentB = numB/numAllFens*100;
         percentV = numV/numAllFens*100;
         percentG = numG/numAllFens*100;
         percentAll = numAllFens/capacityStadion*100;

        System.out.println(df.format(percentA)+"%");
        System.out.println(df.format(percentB)+"%");
        System.out.println(df.format(percentV)+"%");
        System.out.println(df.format(percentG)+"%");
        System.out.println(df.format(percentAll)+"%");


    }
}
