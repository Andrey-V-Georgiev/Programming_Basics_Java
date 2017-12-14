package _01_6_March_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 13-Apr-17.
 */
public class _2_Transport_Price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double taxiPrimaryTariff = 0.70 ;
        double taxiDayTariff = 0.79 ;
        double taxiNightTariff = 0.90;

        double bustariff = 0.09;
        double trainTariff = 0.06;

        double price = 0;

        if(n<20){
            if(dayOrNight.equals("day")){
                price = taxiPrimaryTariff + (n*taxiDayTariff);
            }else{
                price = taxiPrimaryTariff + (n*taxiNightTariff);
            }
        }else if (n>= 20&&n<100){
            price = n * bustariff;
        }else  if (n>=100){
            price = n * trainTariff;
        }

        System.out.printf("%.2f",price);


    }
}
