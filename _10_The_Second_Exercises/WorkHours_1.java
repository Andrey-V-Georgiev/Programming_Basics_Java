package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 27-Apr-17.
 */
public class WorkHours_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hoursNeed = Double.parseDouble(scanner.nextLine());
        double workersNum = Double.parseDouble(scanner.nextLine());
        double workingDays = Double.parseDouble(scanner.nextLine());
        double workingHours= workingDays*workersNum*8;
        double diff1=hoursNeed-workingHours;
        double diff2=Math.abs(diff1);
        double penalties=workingDays*diff2;
        if(diff1<=0){
            System.out.printf("%d hours left",(int)diff2);
        }else{
            System.out.printf("%d overtime%n",(int)diff2);
            System.out.printf("Penalties: %d",(int)penalties);
        }
    }
}
