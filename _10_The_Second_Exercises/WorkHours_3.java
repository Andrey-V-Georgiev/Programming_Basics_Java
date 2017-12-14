package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class WorkHours_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededHours = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());
        double days = Double.parseDouble(scanner.nextLine());
        double hours=workers*days*8;
        double diff1=neededHours-hours;
        double diff2=Math.abs(diff1);
        double penalties=days*diff2;
        if(diff1<=0){
            System.out.println((int)diff2+" hours left");
        }else{
            System.out.println((int)diff2+" overtime");
            System.out.println("Penalties: "+(int)penalties);
        }
    }
}
