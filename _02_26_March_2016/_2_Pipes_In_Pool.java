package _02_26_March_2016;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Ordna on 13-Apr-17.
 */
public class _2_Pipes_In_Pool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");

        double v= Double.parseDouble(scanner.nextLine());
        double p1= Double.parseDouble(scanner.nextLine());
        double p2= Double.parseDouble(scanner.nextLine());
        double h= Double.parseDouble(scanner.nextLine());

        double p1_Volume=h*p1;
        double p2_Volume=h*p2;
        double total_Volume=p1_Volume+p2_Volume;

        double p1_Percent=p1_Volume/total_Volume*100;
        double p2_Percent=p2_Volume/total_Volume*100;
        double total_Percent=total_Volume/v*100;

        double overflow_Volume=Math.abs(v-total_Volume);

        if(v>=total_Volume){
            System.out.println("The pool is "+(int)total_Percent+"% full. Pipe 1: "+(int)p1_Percent+"%. Pipe 2: "+(int)p2_Percent+"%.");
        }else if(v<total_Volume){
            System.out.println("For "+df.format(h)+" hours the pool overflows with "+df.format(overflow_Volume)+" liters.");
        }

    }
}
