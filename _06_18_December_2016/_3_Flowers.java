package _06_18_December_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 15-Apr-17.
 */
public class _3_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quantityHriz = Double.parseDouble(scanner.nextLine());
        double quantityRozi = Double.parseDouble(scanner.nextLine());
        double quantityLaleta = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double quantityAll = quantityHriz + quantityRozi + quantityLaleta;

        double priceHriz = 0;
        double priceRozi = 0;
        double priceLaleta = 0;
        double priceTotal = priceHriz + priceRozi + priceLaleta;
        if (holiday.equals("Y")) {
            priceTotal = priceTotal * 1.15;
        }

        if (season.equals("Spring") || season.equals("Summer")) {
            priceHriz = quantityHriz * 2.00;
            priceRozi = quantityRozi * 4.10;
            priceLaleta = quantityLaleta * 2.50;
            priceTotal = priceHriz + priceRozi + priceLaleta;

            if (holiday.equals("Y")) {
                priceTotal = priceTotal * 1.15;
            }
            if (quantityLaleta > 7) {
                priceTotal = priceTotal-(priceTotal*0.05);
            }
            if (quantityAll > 20) {
                priceTotal = priceTotal-(priceTotal*0.2);
            }


        } else if (season.equals("Winter") || season.equals("Autumn")) {
            priceHriz = quantityHriz * 3.75;
            priceRozi = quantityRozi * 4.50;
            priceLaleta = quantityLaleta * 4.15;
            priceTotal = priceHriz + priceRozi + priceLaleta;

            if (holiday.equals("Y")) {
                priceTotal = priceTotal * 1.15;
            }
            if (quantityRozi >= 10) {
                if(season.equals("Autumn")){
                    priceTotal = priceTotal;
                }else{
                    priceTotal = priceTotal-(priceTotal*0.1);
                }
            }
            if (quantityAll > 20) {
                priceTotal = priceTotal-(priceTotal*0.2);
            }


        }


        priceTotal = priceTotal + 2;
        System.out.printf("%.2f", priceTotal);

    }
}
