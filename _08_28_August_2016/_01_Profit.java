package _08_28_August_2016;

import java.util.Scanner;

/**
 * Created on 22-Apr-17.
 */
public class _01_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double daysPerMonth= Double.parseDouble(scanner.nextLine());
        double dollarsPerDay= Double.parseDouble(scanner.nextLine());
        double exchangeRate= Double.parseDouble(scanner.nextLine());

        double monthSalary= daysPerMonth * dollarsPerDay;
        double anualSalary= monthSalary * 12 + monthSalary * 2.5;
        double taxes= anualSalary * 0.25;
        double anualSalaryAfterTaxes = anualSalary - taxes;
        double annualIncomBGN=anualSalaryAfterTaxes*exchangeRate;
        double averageBGNperDay=annualIncomBGN/365;
        System.out.printf("%.2f",averageBGNperDay);


    }
}
