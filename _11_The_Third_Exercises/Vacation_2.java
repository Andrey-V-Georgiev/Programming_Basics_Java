package _11_The_Thurd_Exercises;

import java.util.Scanner;

/**
 * Created on 29-Apr-17.
 */
public class Vacation_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nAdults = Double.parseDouble(scanner.nextLine());
        double nStudents = Double.parseDouble(scanner.nextLine());
        double nAll=nAdults+nStudents;
        double nights = Double.parseDouble(scanner.nextLine());
        String type=scanner.nextLine();

        double priceHotel=82.99*nights;
        double pAdults=0;
        double pStudents=0;
        double pAll=pAdults+pStudents;

        switch (type){
            case "train":
                pAdults=nAdults*24.99;
                pStudents=nStudents*14.99;
                pAll=pAdults+pStudents;
                if(nAll>=50){
                    pAll=pAll*0.5;
                }
                break;
            case "bus":
                 pAdults=nAdults*32.5;
                 pStudents=nStudents*28.5;
                 pAll=pAdults+pStudents;
                break;
            case "boat":
                pAdults=nAdults*42.99;
                pStudents=nStudents*39.99;
                pAll=pAdults+pStudents;
                break;
            case "airplane":
                 pAdults=nAdults*70;
                 pStudents=nStudents*50;
                 pAll=pAdults+pStudents;
                break;
        }

        double money=((pAll*2)+priceHotel)*1.1;
        System.out.printf("%.2f",money);

    }
}
