package _11_The_Thurd_Exercises;

import java.util.Scanner;

/**
 * Created on 29-Apr-17.
 */
public class BikeRace_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numJuniors = Double.parseDouble(scanner.nextLine());
        double numSeniors = Double.parseDouble(scanner.nextLine());
        double numAll = numJuniors + numSeniors;
        String route = scanner.nextLine();
        double priceJuniors = 0;
        double priceSeniors = 0;
        double priceAll = priceJuniors + priceSeniors;

        switch (route) {
            case "trail":
                priceJuniors = 5.5 * numJuniors;
                priceSeniors = 7 * numSeniors;
                priceAll = priceJuniors + priceSeniors;
                break;
            case "cross-country":
                priceJuniors = 8 * numJuniors;
                priceSeniors = 9.5 * numSeniors;
                priceAll = priceJuniors + priceSeniors;
                if (numAll >= 50) {
                    priceAll = priceAll * 0.75;
                }
                break;
            case "downhill":
                priceJuniors = 12.25 * numJuniors;
                priceSeniors = 13.75 * numSeniors;
                priceAll = priceJuniors + priceSeniors;
                break;
            case "road":
                priceJuniors = 20 * numJuniors;
                priceSeniors = 21.5 * numSeniors;
                priceAll = priceJuniors + priceSeniors;
                break;
        }
        priceAll = priceAll * 0.95;
        System.out.printf("%.2f",priceAll);

    }
}
