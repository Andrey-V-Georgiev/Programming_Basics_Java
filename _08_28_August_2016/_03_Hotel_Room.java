package _08_28_August_2016;

import java.util.Scanner;

/**
 * Created on 22-Apr-17.
 */
public class _03_Hotel_Room {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        String season= scanner.nextLine();
        int nights=Integer.parseInt(scanner.nextLine());
        double apartmentPrice=0;
        double studioPrice=0;

        if(season.equals("May")||season.equals("October")){
            studioPrice=50*nights;
            apartmentPrice=65*nights;
        }else if(season.equals("June")||season.equals("September")){
            studioPrice=75.20* nights;
            apartmentPrice=68.70*nights;
        }else if(season.equals("July")||season.equals("August")){
            studioPrice=76* nights;
            apartmentPrice=77*nights;
        }
        if(nights>14){
            apartmentPrice=apartmentPrice-(apartmentPrice*0.1);
        }
        if(nights>7&&nights<=14&&season.equals("May")||nights>7&&nights<=14&&season.equals("October")){
            studioPrice=studioPrice-(studioPrice*0.05);
        }else if(nights>14&&season.equals("May")||nights>14&&season.equals("October")){
            studioPrice=studioPrice-(studioPrice*0.3);

        }else if(nights>14&&season.equals("June")||nights>14&&season.equals("September")){
            studioPrice=studioPrice-(studioPrice*0.2);

        }

        System.out.printf("Apartment: %.2f lv.%n",apartmentPrice);
        System.out.printf("Studio: %.2f lv.",studioPrice);


    }
}
