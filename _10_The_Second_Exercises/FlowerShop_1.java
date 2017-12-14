package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 27-Apr-17.
 */
public class FlowerShop_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numMag = Double.parseDouble(scanner.nextLine());
        double numZium = Double.parseDouble(scanner.nextLine());
        double numRose = Double.parseDouble(scanner.nextLine());
        double numKak = Double.parseDouble(scanner.nextLine());
        double pricePresent = Double.parseDouble(scanner.nextLine());

        double moneyMag=numMag*3.25;
        double moneyZium=numZium*4;
        double moneyRose=numRose*3.5;
        double moneyKak=numKak*8;

        double moneyAll_1=(moneyMag+moneyZium+moneyRose+moneyKak);
        double moneyAll_2= moneyAll_1-(moneyAll_1*0.05);
        double diff1=moneyAll_2- pricePresent;
        double diff2=Math.abs(diff1);

        if(diff1>=0){
            System.out.print("She is left with "+(int)Math.floor(diff2)+" leva.");
        }else{
            System.out.printf("She will have to borrow "+(int)Math.ceil(diff2)+" leva.");
        }


    }
}
