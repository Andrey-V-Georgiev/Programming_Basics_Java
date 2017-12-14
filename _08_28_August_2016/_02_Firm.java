package _08_28_August_2016;

import java.util.Scanner;

/**
 * Created on 22-Apr-17.
 */
public class _02_Firm {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double neededHours= Double.parseDouble(scanner.nextLine());
        double days= Double.parseDouble(scanner.nextLine());
        double extraPeople= Double.parseDouble(scanner.nextLine());

        double hours=(days-(days*0.1))*8;
        double extraHours=extraPeople*2*days;
        double all=hours+extraHours;
        double diff1=neededHours-all;
        double diff2= Math.abs(diff1);
        diff2=Math.floor(diff2);

        if(diff1<0){
            System.out.printf("Yes!%d hours left.",(int)diff2);
        }else{
            System.out.printf("Not enough time!%d hours needed.",(int)diff2);
        }
    }
}
