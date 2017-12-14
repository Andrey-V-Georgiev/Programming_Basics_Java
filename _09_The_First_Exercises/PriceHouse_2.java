package _09_The_First_Exercises;

import java.util.Scanner;

/**
 * Created on 24-Apr-17.
 */
public class PriceHouse_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double room1 = Double.parseDouble(scanner.nextLine());
        double room2=room1*1.1;
        double room3=room2*1.1;
        double kitchen = Double.parseDouble(scanner.nextLine());
        double bathroom=room1/2;
        double areaTogether=(room1+room2+room3+kitchen+bathroom)*1.05;
        double priceSqM = Double.parseDouble(scanner.nextLine());
        double money=priceSqM*areaTogether;
        System.out.printf("%.2f",money);







    }
}
