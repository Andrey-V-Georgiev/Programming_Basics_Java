package _04_20_November_2016_Morning;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Ordna on 14-Apr-17.
 */
public class _2_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double  dayCount = Double.parseDouble(scanner.nextLine());
        double  foodDepotKG = Double.parseDouble(scanner.nextLine());
        double  foodDog = Double.parseDouble(scanner.nextLine());
        double  foodCat = Double.parseDouble(scanner.nextLine());
        double  foodTurtle = Double.parseDouble(scanner.nextLine())/1000;

        double foodConsumption = dayCount * (foodDog+foodCat+foodTurtle);
        double difference = foodDepotKG - foodConsumption;
        double diff1=Math.abs(difference);


        if(foodDepotKG>=foodConsumption){

            System.out.println( (int)Math.floor(diff1)+" kilos of food left.");
        }else{
            System.out.println((int)Math.ceil(diff1)+" more kilos of food are needed.");
        }

    }
}
