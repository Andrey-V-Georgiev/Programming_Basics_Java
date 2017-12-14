package _11_The_Thurd_Exercises;

import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class Flowers_SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numHriz = Double.parseDouble(scanner.nextLine());
        double numRozi = Double.parseDouble(scanner.nextLine());
        double numLaleta = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double numAll = numHriz + numLaleta + numRozi;

        double priceHriz = 0;
        double priceRozi = 0;
        double priceLaleta = 0;
        double priceAll = priceHriz + priceRozi + priceLaleta;

        switch (season) {
            case "Summer":
                priceHriz = 2 * numHriz;
                priceRozi = 4.1 * numRozi;
                priceLaleta = 2.5 * numLaleta;
                priceAll = priceHriz + priceRozi + priceLaleta;
                if (holiday.equals("Y")) {
                    priceAll = priceAll * 1.15;
                }
                if (numAll > 20) {
                    priceAll = priceAll * 0.8;
                }

                break;
            case "Spring":
                priceHriz = 2 * numHriz;
                priceRozi = 4.1 * numRozi;
                priceLaleta = 2.5 * numLaleta;
                priceAll = priceHriz + priceRozi + priceLaleta;
                if (holiday.equals("Y")) {
                    priceAll = priceAll * 1.15;
                }
                if (numLaleta > 7) {
                    priceAll = priceAll * 0.95;
                }
                if (numAll > 20) {
                    priceAll = priceAll * 0.8;
                }

                break;
            case "Winter":
                priceHriz = 3.75 * numHriz;
                priceRozi = 4.5 * numRozi;
                priceLaleta = 4.15 * numLaleta;
                priceAll = priceHriz + priceRozi + priceLaleta;
                if (holiday.equals("Y")) {
                    priceAll = priceAll * 1.15;
                }
                if (numRozi >= 10) {
                    priceAll = priceAll * 0.9;
                }
                if (numAll > 20) {
                    priceAll = priceAll * 0.8;
                }

                break;
            case "Autumn":
                priceHriz = 3.75 * numHriz;
                priceRozi = 4.5 * numRozi;
                priceLaleta = 4.15 * numLaleta;
                priceAll = priceHriz + priceRozi + priceLaleta;
                if (holiday.equals("Y")) {
                    priceAll = priceAll * 1.15;
                }
                if (numAll > 20) {
                    priceAll = priceAll * 0.8;
                }

                break;
        }

        System.out.printf("%.2f", priceAll + 2);


    }
}
