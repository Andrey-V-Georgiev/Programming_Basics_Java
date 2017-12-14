package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 27-Apr-17.
 */
public class ChangeTiles_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneySaved = Double.parseDouble(scanner.nextLine());
        double floorWidth = Double.parseDouble(scanner.nextLine());
        double floorLength = Double.parseDouble(scanner.nextLine());
        double triangleSide = Double.parseDouble(scanner.nextLine());
        double triangleHight = Double.parseDouble(scanner.nextLine());
        double moneyOneTile = Double.parseDouble(scanner.nextLine());
        double moneyBuilder = Double.parseDouble(scanner.nextLine());

        double floorArea=floorLength*floorWidth;
        double triangleArea=(triangleHight*triangleSide)/2;
        double numTiles=Math.ceil(floorArea/triangleArea)+5;
        double moneySum=(numTiles*moneyOneTile)+moneyBuilder;
        double diff1=moneySaved-moneySum;
        double diff2=Math.abs(diff1);

        if(diff1>=0){
            System.out.printf("%.2f lv left.",diff2);
        }else{
            System.out.printf("You'll need %.2f lv more.",diff2);
        }

    }
}
