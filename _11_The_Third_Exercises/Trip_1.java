package _11_The_Thurd_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class Trip_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;
        DecimalFormat df = new DecimalFormat("0.00");

        if (budget <= 100) {
            System.out.println("Somewhere in Bulgaria");
            if (season.equals("summer")) {
                price = budget * 0.3;
                System.out.println("Camp - " + df.format(price));
            } else if (season.equals("winter")) {
                price = budget * 0.7;
                System.out.println("Hotel - " + df.format(price));
            }
        } else if (budget > 100 && budget <= 1000) {
            System.out.println("Somewhere in Balkans");
            if (season.equals("summer")) {
                price = budget * 0.4;
                System.out.println("Camp - " + df.format(price));
            } else if (season.equals("winter")) {
                price = budget * 0.8;
                System.out.println("Hotel - " + df.format(price));
            }
        } else if (budget > 1000) {
            System.out.println("Somewhere in Europe");
            price = budget * 0.9;
            System.out.println("Hotel - " + df.format(price));
        }
    }


}

