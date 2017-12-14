package _10_The_Second_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class PoolPipes_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v= Double.parseDouble(scanner.nextLine());
        double p1= Double.parseDouble(scanner.nextLine());
        double p2= Double.parseDouble(scanner.nextLine());
        double h= Double.parseDouble(scanner.nextLine());

        double p1V=h*p1;
        double p2V=h*p2;
        double p1_p2V=p1V+p2V;
        double p1Percent=p1V/p1_p2V*100;
        double p2Percent=p2V/p1_p2V*100;
        double p1_p2Percent=p1_p2V/v*100;

        double overflow1=v-p1_p2V;
        double overflow2=Math.abs(overflow1);
        DecimalFormat df = new DecimalFormat("0.##");
        if(overflow1>=0){
            System.out.print("The pool is "+(int)p1_p2Percent+"% full. Pipe 1: "+(int)p1Percent+"%. Pipe 2: "+(int)p2Percent+"%.");
        }else{
            System.out.print("For "+df.format(h)+" hours the pool overflows with "+df.format(overflow2)+" liters.");
        }



    }
}
