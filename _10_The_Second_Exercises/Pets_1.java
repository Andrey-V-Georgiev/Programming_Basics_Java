package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 27-Apr-17.
 */
public class Pets_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numDays = Double.parseDouble(scanner.nextLine());
        double foodLeft = Double.parseDouble(scanner.nextLine());
        double foodDogConsum = Double.parseDouble(scanner.nextLine());
        double foodDogKg=foodDogConsum*numDays;
        double foodCatConsum = Double.parseDouble(scanner.nextLine());
        double foodCatKg=foodCatConsum*numDays;
        double foodTurtleConsum = Double.parseDouble(scanner.nextLine())/1000;
        double foodTurtleKg=foodTurtleConsum*numDays;

        double foodSum= foodDogKg+foodCatKg+foodTurtleKg;
        double diff1=foodLeft-foodSum;
        double diff2=Math.abs(diff1);
        if(  diff1>=0){
            System.out.print((int)Math.floor(diff2)+" kilos of food left.");
        }else{
            System.out.print((int)Math.ceil(diff2)+" more kilos of food are needed.");
        }

    }
}
