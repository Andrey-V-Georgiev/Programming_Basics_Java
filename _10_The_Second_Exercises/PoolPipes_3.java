package _10_The_Second_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class PoolPipes_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = Double.parseDouble(scanner.nextLine());
        double p1 = Double.parseDouble(scanner.nextLine());
        double p2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double p1V=p1*h;
        double p2V=p2*h;
        double p1p2V=p1V+p2V;
        double p1Percent=p1V/p1p2V*100;
        double p2Percent=p2V/p1p2V*100;
        double p1p2Percent=p1p2V/v*100;
        double diff1=v-p1p2V;
        double diff2=Math.abs(diff1);
        DecimalFormat df = new DecimalFormat("0.##");
        if(diff1>=0){
            System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.",(int)p1p2Percent,(int)p1Percent,(int)p2Percent);
        }else{
            System.out.printf("For "+df.format(h)+" hours the pool overflows with "+df.format(diff2)+" liters.");
        }


    }
}
