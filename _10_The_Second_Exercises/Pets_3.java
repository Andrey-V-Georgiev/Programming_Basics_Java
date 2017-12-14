package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class Pets_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numDays = Double.parseDouble(scanner.nextLine());
        double foodLeft= Double.parseDouble(scanner.nextLine());
        double foodDogPerDay = Double.parseDouble(scanner.nextLine());
        double foodDogAll=foodDogPerDay*numDays;
        double foodCatPerDay = Double.parseDouble(scanner.nextLine());
        double foodCatAll=foodCatPerDay*numDays;
        double foodTurtlePerDay = Double.parseDouble(scanner.nextLine())/1000;
        double foodTurtleAll=foodTurtlePerDay*numDays;
        double foodAll= foodCatAll+foodDogAll+foodTurtleAll;
        double diff1=foodLeft-foodAll;
        double diff2=Math.abs(diff1);
        if(diff1>=0){
            System.out.print((int)(Math.floor(diff2))+" kilos of food left.");
        }else{
            System.out.println((int)(Math.ceil(diff2))+" more kilos of food are needed.");
        }

    }
}
