package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class ChangeTiles_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneySaved = Double.parseDouble(scanner.nextLine());
        double floorWidth = Double.parseDouble(scanner.nextLine());
        double floorLength = Double.parseDouble(scanner.nextLine());
        double triangleSide = Double.parseDouble(scanner.nextLine());
        double triangleHight = Double.parseDouble(scanner.nextLine());
        double moneyPerTile = Double.parseDouble(scanner.nextLine());
        double moneyBuilder = Double.parseDouble(scanner.nextLine());

        double areaFloor=floorLength*floorWidth;
        double areaTile=(triangleHight*triangleSide)/2;
        double numTiles=Math.ceil((areaFloor/areaTile)+5);
        double moneyAllTiles=moneyBuilder+(numTiles*moneyPerTile);
        double diff1=moneySaved-moneyAllTiles;
        double diff2=Math.abs(diff1);
        //DecimalFormat df = new DecimalFormat(".00");
        if(diff1>=0){
            System.out.printf("%.2f lv left.",diff2);
        }else{
            System.out.printf("You'll need %.2f lv more.",diff2);
        }

    }
}
