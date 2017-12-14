package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class WorkingHours_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededHours = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());
        double workingDays = Double.parseDouble(scanner.nextLine());

        double workingHours=workers*workingDays*8;
        double diff1=neededHours-workingHours;
        double diff2=Math.abs(diff1);
        double penalties=diff2*workingDays;
        if(diff1<0){
            System.out.printf("%d hours left",(int)diff2);
        }else{
            System.out.printf("%d overtime%n",(int)diff2);
            System.out.printf("Penalties: %d",(int)penalties);
        }



    }
}
