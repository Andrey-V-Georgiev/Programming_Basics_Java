package _09_The_First_Exercises;

import java.util.Scanner;

/**
 * Created on 24-Apr-17.
 */
public class Distance_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v1 = Double.parseDouble(scanner.nextLine());
        double t1 = Double.parseDouble(scanner.nextLine());
        double s1 = v1 * (t1 / 60);
        double t2 = Double.parseDouble(scanner.nextLine());
        double v2=(v1 * 1.1);
        double s2=v2 * (t2 / 60);
        double t3 = Double.parseDouble(scanner.nextLine());
        double s3=(v2*0.95)*(t3/60);
        double sT=s1+s2+s3;
        System.out.printf("%.2f",sT);
    }
}
