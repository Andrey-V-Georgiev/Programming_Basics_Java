package _06_18_December_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 15-Apr-17.
 */
public class _2_ChangeTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneySaved = Double.parseDouble(scanner.nextLine());
        double floorWidth = Double.parseDouble(scanner.nextLine());
        double floorLength = Double.parseDouble(scanner.nextLine());
        double tileSide = Double.parseDouble(scanner.nextLine());
        double tileHight = Double.parseDouble(scanner.nextLine());
        double moneyPerTile = Double.parseDouble(scanner.nextLine());
        double moneyBuilder = Double.parseDouble(scanner.nextLine());

        double floorArea = floorLength*floorWidth;
        double tileArea =(tileHight*tileSide)/2;
        double tilesQuantity=floorArea/tileArea;
        double tilesQuantity2=Math.ceil(tilesQuantity)+5;
        double moneyAllTiles=(tilesQuantity2*moneyPerTile)+moneyBuilder;

        double diff1 = moneySaved-moneyAllTiles;
        double diff2 = Math.abs(diff1);
        if(diff1>=0){
            System.out.printf("%.2f lv left.",diff2);
        }else{
            System.out.printf("You'll need %.2f lv more.",diff2);
        }

    }
}
