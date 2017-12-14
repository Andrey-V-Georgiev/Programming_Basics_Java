package _07_18_March_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Ordna on 16-Apr-17.
 */
public class _2_WorkHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jobHours= Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int workingHours= workers * days * 8;
        int diff1= jobHours - workingHours;
        int diff2= Math.abs(jobHours - workingHours);
        int penalties= diff2 * days;
        DecimalFormat df = new DecimalFormat("0");


        if(diff1<=0){
            System.out.printf( df.format(diff2)+" hours left");
        }else{
            System.out.printf(df.format(diff2)+" overtime%n");
            System.out.printf("Penalties: "+df.format(penalties));
        }

    }
}
