package _10_The_Second_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 24-Apr-17.
 */
public class PoolPipes_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = Double.parseDouble(scanner.nextLine());
        double p1 = Double.parseDouble(scanner.nextLine());
        double p2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double vP1 = h * p1;
        double vP2 = h * p2;
        double vAll = vP1 + vP2;
        double vP1percent = vP1 / vAll * 100;
        double vP2percent = vP2 / vAll * 100;
        double vAllpercent = vAll / v * 100;

        double overflow = v - vAll;
        double overflowABS = Math.abs(overflow);
        DecimalFormat df = new DecimalFormat("0.##");

        if (overflow < 0) {
            System.out.printf("For " + df.format(h) + " hours the pool overflows with " + df.format(overflowABS) + " liters.");
        } else if (overflow >= 0) {
            System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.", (int) vAllpercent, (int) vP1percent, (int) vP2percent);
        }


    }
}
