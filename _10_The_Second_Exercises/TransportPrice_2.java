package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class TransportPrice_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n= Double.parseDouble(scanner.nextLine());
        String dayNight=scanner.nextLine();
        double tariff=0;


        if(n<20){
                if(dayNight.equals("day")){
                    tariff=0.79*n+0.7;
                }else if(dayNight.equals("night")){
                    tariff=0.90*n+0.70;
                }
        }else if(n>=20&&n<100){
                tariff=0.09*n;
        }else if(n>=100){
            tariff=0.06*n;
        }

        System.out.printf("%.2f",tariff);
    }
}
