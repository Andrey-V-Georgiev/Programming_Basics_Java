package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class TransportPrice_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        String dayNight=scanner.nextLine();
        double price=0;

        if(n<20){
            if(dayNight.equals("day")) {
                price = n*0.79+0.7;
            }else if(dayNight.equals("night")){
                price=n*0.9+0.7;
            }
        }else if(n>=20&&n<100){
            price=n*0.09;
        }else if(n>=100){
        price = n*0.06;
        }
        System.out.printf("%.2f",price);

    }
}
