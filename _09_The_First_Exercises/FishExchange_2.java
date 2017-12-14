package _09_The_First_Exercises;

import java.util.Scanner;

/**
 * Created on 24-Apr-17.
 */
public class FishExchange_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceSkumriq = Double.parseDouble(scanner.nextLine());

        double priceCaca = Double.parseDouble(scanner.nextLine());

        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double priceKgPalamud=priceSkumriq*1.6;
        double moneyPalamud=priceKgPalamud*kgPalamud;
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        double priceKgSafrid=priceCaca*1.8;
        double moneySafrid=kgSafrid*priceKgSafrid;
        double kgMidi = Double.parseDouble(scanner.nextLine());
        double priceKgMidi=7.50;
        double moneymidi=kgMidi*priceKgMidi;
        double allMoney=moneyPalamud+moneySafrid+moneymidi;
        System.out.printf("%.2f",allMoney);
    }
}
