package _09_The_First_Exercises;

import java.util.Scanner;

/**
 * Created on 24-Apr-17.
 */
public class Fish_Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceSkumriqKG = Double.parseDouble(scanner.nextLine());
        double priceCacaKG = Double.parseDouble(scanner.nextLine());
        double pricePalamudKG=priceSkumriqKG*1.6;
        double weightPalamud = Double.parseDouble(scanner.nextLine());
        double weightSafrid = Double.parseDouble(scanner.nextLine());
        double priceSafridKG=priceCacaKG*1.8;
        double weightMidi = Double.parseDouble(scanner.nextLine());
        double priceMidi=7.5;

        double moneyPalamud=weightPalamud*pricePalamudKG;
        double moneySafrid=weightSafrid*priceSafridKG;
        double moneyMidi=priceMidi*weightMidi;
        double allMoney=moneyMidi+moneyPalamud+moneySafrid;
        System.out.printf("%.2f",allMoney);



    }
}
