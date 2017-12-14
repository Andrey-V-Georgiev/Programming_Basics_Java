package _11_The_Thurd_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 29-Apr-17.
 */
public class HotelRoom_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double nights = Double.parseDouble(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;

        if (season.equals("May") || season.equals("October")) {
             priceStudio = nights*50 ;
             priceApartment = nights*65;
            if (nights > 7 && nights < 15) {
                priceStudio = priceStudio * 0.95;
            }
            if (nights > 14) {
                priceStudio = priceStudio * 0.7;
            }
            if (nights > 14) {
                priceApartment = priceApartment * 0.9;
            }
        } else if (season.equals("June") || season.equals("September")) {
             priceStudio = nights*75.2;
             priceApartment = nights*68.7;
            if (nights > 14) {
                priceStudio = priceStudio * 0.8;
            }
            if (nights > 14) {
                priceApartment = priceApartment * 0.9;
            }
        } else if (season.equals("July") || season.equals("August")) {
            priceStudio = nights*76;
            priceApartment = nights*77;
            if (nights > 14) {
                priceApartment = priceApartment * 0.9;
            }
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Apartment: " + df.format(priceApartment) + " lv.");
        System.out.println("Studio: " + df.format(priceStudio) + " lv.");

    }
}
