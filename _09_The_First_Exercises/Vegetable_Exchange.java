package _09_The_First_Exercises;

import java.util.Scanner;

/**
 * Created on 23-Apr-17.
 */
public class Vegetable_Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price_kg_Veg= Double.parseDouble(scanner.nextLine());
        double price_kg_Fru= Double.parseDouble(scanner.nextLine());
        double all_kg_Veg= Double.parseDouble(scanner.nextLine());
        double all_kg_Fru= Double.parseDouble(scanner.nextLine());
        double money_Veg=price_kg_Veg*all_kg_Veg/1.94;
        double money_Fru=price_kg_Fru*all_kg_Fru/1.94;

        double total_money_Euro=money_Fru+money_Veg;
        System.out.printf("%.13f",total_money_Euro);

    }
}
