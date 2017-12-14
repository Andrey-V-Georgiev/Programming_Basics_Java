package _09_The_First_Exercises;

import java.util.Scanner;

/**
 * Created on 24-Apr-17.
 */
public class VegetableExchange_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceKG_Veg = Double.parseDouble(scanner.nextLine());
        double priceKG_Fru = Double.parseDouble(scanner.nextLine());
        double kg_Veg = Double.parseDouble(scanner.nextLine());
        double kg_Fru = Double.parseDouble(scanner.nextLine());

        double  moneyVeg=kg_Veg*priceKG_Veg/1.94;
        double  moneyFru=priceKG_Fru*kg_Fru/1.94;
        double  moneyAll=moneyFru+moneyVeg;
        System.out.printf("%.13f",moneyAll);




    }
}
