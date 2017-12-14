package _11_The_Thurd_Exercises;

import java.util.Scanner;

/**
 * Created on 29-Apr-17.
 */
public class Vacation_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numAdult = Double.parseDouble(scanner.nextLine());
        double numStudents = Double.parseDouble(scanner.nextLine());
        double numAll = numAdult + numStudents;
        double numNights = Double.parseDouble(scanner.nextLine());
        double priceNights = 82.99 * numNights;
        String typeTransport = scanner.nextLine();
        double priceAdult = 0;
        double priceStudents = 0;
        double priceAll = (priceAdult + priceStudents) * 2;

        switch (typeTransport) {
            case "train":
                priceAdult = numAdult * 24.99;
                priceStudents = numStudents * 14.99;
                priceAll = (priceAdult + priceStudents) * 2;
                if (numAll > 50) {
                    priceAll = priceAll / 2;
                }
                break;
            case "bus":
                priceAdult = numAdult * 32.5;
                priceStudents = numStudents * 28.5;
                priceAll = (priceAdult + priceStudents) * 2;
                break;
            case "boat":
                priceAdult = numAdult * 42.99;
                priceStudents = numStudents * 39.99;
                priceAll = (priceAdult + priceStudents) * 2;
                break;
            case "airplane":
                priceAdult = numAdult * 70;
                priceStudents = numStudents * 50;
                priceAll = (priceAdult + priceStudents) * 2;
                break;

        }
        double priceTotal = (priceNights + priceAll) * 1.1;
        System.out.printf("%.2f", priceTotal);


    }
}
