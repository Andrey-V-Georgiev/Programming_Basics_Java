package _09_The_First_Exercises;

import java.util.Scanner;

/**
 * Created on 23-Apr-17.
 */
public class Profit {
    public static void main ( String[]args){
        Scanner scanner = new Scanner (System.in);
        double workDaysPerMonth= Double.parseDouble(scanner.nextLine());
        double moneyPerDayUSD= Double.parseDouble(scanner.nextLine());
        double currRate= Double.parseDouble(scanner.nextLine());

        double monthSalaryUsd=workDaysPerMonth*moneyPerDayUSD;
        double anualIncomUSD=monthSalaryUsd*12+monthSalaryUsd*2.5;
        double salaryUSD_afterTaxes=anualIncomUSD-(anualIncomUSD*0.25);
        double annualSalaryBGN=salaryUSD_afterTaxes*currRate;
        double moneyPerDayBGN=annualSalaryBGN/365;

        System.out.printf("%.2f",moneyPerDayBGN);
    }
}
