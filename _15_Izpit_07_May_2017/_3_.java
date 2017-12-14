package _15_Izpit_07_May_2017;

import java.util.Scanner;

/**
 * Created on 05-May-17.
 */
public class _3_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String season = scanner.nextLine();
        String genderGroup = scanner.nextLine();
        double numStudents = Double.parseDouble(scanner.nextLine());
        double numNights = Double.parseDouble(scanner.nextLine());

        String sport = "";
        double priceNights = 0;

        if (genderGroup.equals("boys")) {

            if (season.equals("Winter")) {
                priceNights = numNights * numStudents * 9.6;
                sport ="Judo";

            } else if (season.equals("Spring")) {
                priceNights = numNights * numStudents * 7.2;
                sport ="Tennis";

            } else if (season.equals("Summer")) {
                priceNights = numNights * numStudents * 15;
                sport ="Football";

            }


        } else if (genderGroup.equals("girls")) {

            if (season.equals("Winter")) {
                priceNights = numNights * numStudents * 9.6;
                sport ="Gymnastics";

            } else if (season.equals("Spring")) {
                priceNights = numNights * numStudents * 7.2;
                sport ="Athletics";

            } else if (season.equals("Summer")) {
                priceNights = numNights * numStudents * 15;
                sport ="Volleyball";

            }

        } else if (genderGroup.equals("mixed")) {

            if (season.equals("Winter")) {
                priceNights = numNights * numStudents * 10;
                sport ="Ski";

            } else if (season.equals("Spring")) {
                priceNights = numNights * numStudents * 9.5;
                sport ="Cycling";

            } else if (season.equals("Summer")) {
                priceNights = numNights * numStudents * 20;
                sport ="Swimming";

            }

        }
        if(numStudents>=50){
            priceNights=priceNights/2;
        }else if(numStudents>=20&&numStudents<50){
            priceNights=priceNights*0.85;
        }else if(numStudents>=10&&numStudents<20){
            priceNights=priceNights*0.95;
        }

        System.out.printf("%s %.2f lv.",sport,priceNights);


    }
}
