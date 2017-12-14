package _11_The_Thurd_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 29-Apr-17.
 */
    public class Trip_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season=scanner.nextLine();
        String place="";
        String campHotel="";
        double price=0;

       if(budget<=100){
           if(season.equals("summer")) {
               place = "Bulgaria";
               campHotel = "Camp";
               price =budget*0.3;
           }else if(season.equals("winter")){
               place = "Bulgaria";
               campHotel = "Hotel";
               price =budget*0.7;
           }
       }else if(budget>100&&budget<=1000){
           if(season.equals("summer")) {
               place = "Balkans";
               campHotel = "Camp";
               price =budget*0.4;
           }else if(season.equals("winter")){
               place = "Balkans";
               campHotel = "Hotel";
               price =budget*0.8;
           }
       }else if(budget>1000){
            place="Europe";
            campHotel="Hotel";
            price=budget*0.9;
       }

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Somewhere in "+place);
        System.out.println(campHotel+" - "+df.format(price));



    }
}
