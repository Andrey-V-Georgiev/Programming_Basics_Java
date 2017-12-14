package _11_The_Thurd_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class CarToGo_1_87Ot100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        if (budget <= 100) {
            switch (season) {

                case "Summer":
                    System.out.println("Economy class");
                    price=budget * 0.35;
                    System.out.print("Cabrio - "+df.format(price));
                    break;
                case "Winter":
                    System.out.println("Economy class");
                    price=budget *0.65;
                    System.out.print("Jeep - "+df.format(price));
                    break;
            }
        } else if (budget > 100 && budget <= 500) {

            switch (season) {
                case "Summer":
                    System.out.println("Compact class");
                    price=budget *0.45;
                    System.out.print("Cabrio - "+df.format(price));
                    break;
                case "Winter":
                    System.out.println("Compact class");
                    price=budget *0.8;
                    System.out.printf("Jeep - "+df.format(price));
                    break;
            }

        } else if (budget > 500) {

            System.out.println("Luxury class");
            price=budget *0.9;
            System.out.printf("Jeep - "+df.format(price) );

        }


    }
}
