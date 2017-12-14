package _01_6_March_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 13-Apr-17.
 */
public class _1_Class_Room {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double widthRoom = Double.parseDouble(scanner.nextLine())*100;
        double heightRoom = Double.parseDouble(scanner.nextLine())*100;

        int theTable = 2; //places
        int theDoor = 1;  //places

        int workPlaceWidth =80+40 ;
        int workPlaceHeight = 70;
        int corridorHeight = 100;

        int capacityWidth = (int)widthRoom / workPlaceWidth;
        int capacityHeight = ((int)heightRoom - corridorHeight) / workPlaceHeight;
        int capacityRoom = (capacityHeight * capacityWidth)-(theDoor + theTable);

        System.out.println(capacityRoom);


    }
}
