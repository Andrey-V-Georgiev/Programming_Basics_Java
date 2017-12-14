package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 27-Apr-17.
 */
public class Firm_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededHours = Double.parseDouble(scanner.nextLine());
        double days = Double.parseDouble(scanner.nextLine());
        double numWorkers = Double.parseDouble(scanner.nextLine());

        double hoursClean = (days - (days * 0.1)) * 8;
        double extraHours = (numWorkers * 2) * days;
        double allHours = hoursClean + extraHours;
        double diff1 = neededHours - allHours;
        double diff2 = Math.abs(diff1);
        double diff3=Math.ceil(diff2);

        if (diff1 <= 0) {
            System.out.print("Yes!" +(int) diff3 + " hours left.");
        } else {
            System.out.print("Not enough time!" +(int) diff3 + " hours needed.");
        }

    }
}

