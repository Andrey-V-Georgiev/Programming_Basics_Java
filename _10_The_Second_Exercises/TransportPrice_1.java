package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 24-Apr-17.
 */
public class TransportPrice_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        String dayOrNight=scanner.nextLine();
        double lowestPrice=0;


        if(n<20){
            if(dayOrNight.equals("day")){
                lowestPrice=0.70+(n*0.79);
            }else if(dayOrNight.equals("night")){
                lowestPrice=0.70+(n*0.90);
            }

        }else if(n>=20&&n<100){
            lowestPrice=n*0.09;
        }else if(n>=100){
            lowestPrice=n*0.06;
        }
        System.out.printf("%.2f",lowestPrice);






}
}
