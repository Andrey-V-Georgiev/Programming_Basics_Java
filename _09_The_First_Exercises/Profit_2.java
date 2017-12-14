package _09_The_First_Exercises;

import java.util.Scanner;

/**
 * Created on 24-Apr-17.
 */
public class Profit_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double workingDaysmonth = Double.parseDouble(scanner.nextLine());
        double incomPerDayUSD = Double.parseDouble(scanner.nextLine());
        double usdRate = Double.parseDouble(scanner.nextLine());

        double monthlySallaryBGN = workingDaysmonth * incomPerDayUSD * usdRate;
        double annualIncomBGN = monthlySallaryBGN * 12 + monthlySallaryBGN * 2.5;
        double afterTaxesPerDay=(annualIncomBGN*0.75)/365;
        System.out.printf("%.2f",afterTaxesPerDay);

    }

}
