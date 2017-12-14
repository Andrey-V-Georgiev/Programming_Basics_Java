package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class FlowerShop_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numMag = Double.parseDouble(scanner.nextLine());
        double priceMag=numMag*3.25;
        double numZium = Double.parseDouble(scanner.nextLine());
        double priceZium=numZium*4;
        double numRozi = Double.parseDouble(scanner.nextLine());
        double priceRozi=numRozi*3.5;
        double numKak = Double.parseDouble(scanner.nextLine());
        double priceKak=numKak*8;
        double pricePresent = Double.parseDouble(scanner.nextLine());
        double priceAll=(priceKak+priceMag+priceRozi+priceZium)*0.95;
        double diff1=pricePresent-priceAll;
        double diff2= Math.abs(diff1);

        if(diff1<=0){
            System.out.println("She is left with "+(int)(Math.floor(diff2))+" leva." );
        }else{
            System.out.println("She will have to borrow "+(int)(Math.ceil(diff2))+" leva." );
        }


    }
}
