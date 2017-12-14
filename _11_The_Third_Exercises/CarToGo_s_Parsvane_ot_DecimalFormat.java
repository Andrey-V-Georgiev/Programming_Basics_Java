package _11_The_Thurd_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 29-Apr-17.
 */
public class CarToGo_s_Parsvane_ot_DecimalFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String typeClass = "";
        String typeVehicle = "";
        double price = 0;

        if (budget <= 100) {

            if (season.equals("Summer")) {
                typeClass = "Economy class";
                typeVehicle = "Cabrio - ";
                price = budget * 0.35;

            } else if (season.equals("Winter")) {
                typeClass = "Economy class";
                typeVehicle = "Jeep - ";
                price = budget * 0.65;
            }

        } else if (budget > 100 && budget <= 500) {

            if (season.equals("Summer")) {
                typeClass = "Compact class";
                typeVehicle = "Cabrio - ";
                price = budget * 0.45;

            } else if (season.equals("Winter")) {
                typeClass = "Compact class";
                typeVehicle = "Jeep - ";
                price = budget * 0.80;
            }

        } else if (budget > 500) {
            typeClass = "Luxury class";
            typeVehicle = "Jeep - ";
            price = budget * 0.90;
        }

        DecimalFormat df = new DecimalFormat("0.000");
        price=Double.parseDouble(df.format(price));

        System.out.println(typeClass);
        System.out.printf("%s%.2f",typeVehicle,price);

    }
}
