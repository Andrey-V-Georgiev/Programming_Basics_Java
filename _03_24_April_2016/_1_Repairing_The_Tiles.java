package _03_24_April_2016;

import java.text.DecimalFormat;
import java.util.Scanner;


public class _1_Repairing_The_Tiles_Нерешена {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        DecimalFormat df1 = new DecimalFormat(".###########");
        DecimalFormat df2 = new DecimalFormat(".############");

        //вход за страна на площадката
        double ground_Side = Double.parseDouble(scanner.nextLine());
        double ground_Area = ground_Side * ground_Side;

        //вход за ширина и дължина на плочката
        double tile_Width = Double.parseDouble(scanner.nextLine());
        double tile_Length = Double.parseDouble(scanner.nextLine());
        double one_Tile_Area = tile_Width * tile_Length;

        //вход за ширина и дължина на пейката
        double bench_Width = Double.parseDouble(scanner.nextLine());
        double bench_Length = Double.parseDouble(scanner.nextLine());
        double bench_Area = bench_Width * bench_Length;

        //брой на нужните плочки
        double repairing_Area = ground_Area - bench_Area;
        double number_Tiles = repairing_Area / one_Tile_Area;

        //време за поправка
        double time_Per_Tile = 0.2;
        double time_All_Tiles = number_Tiles * time_Per_Tile;

        System.out.println(df1.format(number_Tiles));
        System.out.println(df2.format(time_All_Tiles));



    }

}
