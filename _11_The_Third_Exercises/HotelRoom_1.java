package _11_The_Thurd_Exercises;

import java.util.Scanner;


public class HotelRoom_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();


        double nights = Double.parseDouble(scanner.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;
        if (season.equals("May") || season.equals("October")) {
            studioPrice = nights * 50;
            apartmentPrice = nights * 65;
            if (nights > 14) {
                apartmentPrice = apartmentPrice * 0.9;
            }
            if (nights > 7 && nights <= 14) {
                studioPrice = studioPrice * 0.95;
            } else if (nights > 14) {
                studioPrice = studioPrice * 0.7;
            }
        } else if (season.equals("June") || season.equals("September")) {
            studioPrice = nights * 75.2;
            apartmentPrice = nights * 68.7;
            if (nights > 14) {
                apartmentPrice = apartmentPrice * 0.9;
            }
            if (nights > 14) {
                studioPrice = studioPrice * 0.8;
            }
        } else if (season.equals("July") || season.equals("August")) {
            studioPrice = nights * 76;
            apartmentPrice = nights * 77;
            if (nights > 14) {
                apartmentPrice = apartmentPrice * 0.9;
            }
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);

    }
}
