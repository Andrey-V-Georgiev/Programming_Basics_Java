package _09_The_First_Exercises;

import java.util.Scanner;

/**
 * Created on 23-Apr-17.
 */
public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numBitcoin= Double.parseDouble(scanner.nextLine());
        double numIoans= Double.parseDouble(scanner.nextLine());
        double commissionPercent= Double.parseDouble(scanner.nextLine());

        double bitToEuro= (numBitcoin*1168)/1.95;
        double ioansToEuro=((numIoans*0.15)*1.76)/1.95;
        double allE=bitToEuro+ioansToEuro;
        double allA_Taxe=allE-(allE/100*commissionPercent);
        System.out.printf("%.12f",allA_Taxe);


    }
}
