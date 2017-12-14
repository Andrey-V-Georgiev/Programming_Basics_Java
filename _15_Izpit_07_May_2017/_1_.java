package _15_Izpit_07_May_2017;

import java.util.Scanner;

/**
 * Created on 05-May-17.
 */
public class _1_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceWis = Double.parseDouble(scanner.nextLine());
        double litersBeer = Double.parseDouble(scanner.nextLine());
        double litersWine = Double.parseDouble(scanner.nextLine());
        double litersRakiq = Double.parseDouble(scanner.nextLine());
        double litersWis = Double.parseDouble(scanner.nextLine());

        double priceRakiq = priceWis / 2;
        double priceWine = priceRakiq * 0.6;
        double priceBeer = priceRakiq * 0.2;

        double moneyBeer = litersBeer * priceBeer;
        double moneyWine = litersWine * priceWine;
        double moneyRakiq = litersRakiq * priceRakiq;
        double moneyWis = litersWis * priceWis;

        double sum= moneyBeer+moneyRakiq+moneyWine+moneyWis;

        System.out.printf("%.2f",sum);


    }
}
