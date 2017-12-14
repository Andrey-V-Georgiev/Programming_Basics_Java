package _10_The_Second_Exercises;

import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class Firm_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededHours= Double.parseDouble(scanner.nextLine());
        double days= Double.parseDouble(scanner.nextLine());
        double workers= Double.parseDouble(scanner.nextLine());

        double hours=(days-(days*0.1))*8;
        double extraHours=workers*2*days;
        double hoursAll=hours+extraHours;
        double diff1=neededHours-hoursAll;
        double diff2=Math.abs(diff1);
        int diff3=(int)Math.ceil(diff2);
        if(diff1<=0){
            System.out.printf("Yes!%d hours left.",diff3);
        }else{
            System.out.printf("Not enough time!%d hours needed.",diff3);
        }

    }
}
