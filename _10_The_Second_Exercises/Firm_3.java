package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class Firm_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededHours = Double.parseDouble(scanner.nextLine());
        double days = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());

        double hours= (days*0.9)*8;
        double extraHours=workers*days*2;
        double hoursAll=hours+extraHours;
        double diff1=neededHours-hoursAll;
        double diff2=Math.abs(diff1);
        double diff3=Math.ceil(diff2);
       // DecimalFormat df = new DecimalFormat("0");
        if(diff1<=0){
            System.out.println("Yes!"+(int)diff3+" hours left.");
        }else{
            System.out.println("Not enough time!"+(int)diff3 +" hours needed.");
        }


    }
}
