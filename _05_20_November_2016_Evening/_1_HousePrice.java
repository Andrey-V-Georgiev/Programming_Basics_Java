package _05_20_November_2016_Evening;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Ordna on 15-Apr-17.
 */
public class _1_HousePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double smallestRoomArea= Double.parseDouble(scanner.nextLine());
        double middleRoomArea=smallestRoomArea+(smallestRoomArea*0.1);
        double biggestRoomArea=middleRoomArea+(middleRoomArea*0.1);
        double bathroomArea=smallestRoomArea/2;
        double kitchenArea= Double.parseDouble(scanner.nextLine());
        double sum1Area=smallestRoomArea+middleRoomArea+biggestRoomArea+bathroomArea+kitchenArea;
        double sum2Area=sum1Area+(sum1Area*0.05);

        double priceSqMeter= Double.parseDouble(scanner.nextLine());
        double priceTotal=priceSqMeter*sum2Area;

        System.out.print(df.format(priceTotal));
    }
}
