package _11_The_Thurd_Exercises;

import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class Flowers_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numHriz = Double.parseDouble(scanner.nextLine());
        double numRozi = Double.parseDouble(scanner.nextLine());
        double numLaleta = Double.parseDouble(scanner.nextLine());
        double numAll = numHriz + numRozi + numLaleta;
        String season = scanner.nextLine();
        String holidayOrNot = scanner.nextLine();
        double priceHriz = 0;
        double priceRozi = 0;
        double priceLaleta = 0;
        double priceAll = 0;
        if (holidayOrNot.equals("Y")) {
            priceAll = priceAll * 1.15;
        }
        if (season.equals("Spring") || season.equals("Summer")) {
            priceHriz = numHriz * 2.0;
            priceRozi = numRozi * 4.1;
            priceLaleta = numLaleta * 2.5;
            priceAll = priceHriz + priceRozi + priceLaleta;
            if (holidayOrNot.equals("Y")) {
                priceAll = priceAll * 1.15;
            }
            if (numLaleta >= 7 && season.equals("Spring")) {
                priceAll = priceAll * 0.95;
            }
            if (numAll >= 20) {
                priceAll = priceAll * 0.8;
            }
        } else if (season.equals("Winter") || season.equals("Autumn")) {
            priceHriz = numHriz * 3.75;
            priceRozi = numRozi * 4.5;
            priceLaleta = numLaleta * 4.15;
            priceAll = priceHriz + priceRozi + priceLaleta;
            if (holidayOrNot.equals("Y")) {
                priceAll = priceAll * 1.15;
            }
            if (numRozi >= 10 && season.equals("Winter")) {
                priceAll = priceAll * 0.90;
            }
            if (numAll >= 20) {
                priceAll = priceAll * 0.8;
            }
        }
        System.out.printf("%.2f", priceAll + 2);
    }
}
