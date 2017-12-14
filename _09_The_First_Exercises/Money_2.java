package _09_The_First_Exercises;

import java.util.Scanner;

/**
 * Created on 24-Apr-17.
 */
public class Money_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numBitcoin = Double.parseDouble(scanner.nextLine());
        double bitcointoEur=numBitcoin*1168/1.95;
        double numIoan = Double.parseDouble(scanner.nextLine());
        double ioanToEuro=numIoan*0.15*1.76/1.95;
        double euroAll=(ioanToEuro+bitcointoEur);
        double commission= Double.parseDouble(scanner.nextLine());
        double euroAllAfterTaxes=euroAll-(euroAll/100*commission);
        System.out.print((int)euroAllAfterTaxes);
    }
}
