package _09_The_First_Exercises;

import java.util.Scanner;

/**
 * Created on 23-Apr-17.
 */
public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v1= Double.parseDouble(scanner.nextLine());
        double v2=v1+(v1*0.1);
        double v3=v2-(v2*0.05);

        double t1= Double.parseDouble(scanner.nextLine());
        double t2= Double.parseDouble(scanner.nextLine());
        double t3= Double.parseDouble(scanner.nextLine());

        double s1=v1*(t1/60);
        double s2=v2*(t2/60);
        double s3=v3*(t3/60);


        double sT=s1+s2+s3;
        System.out.printf("%.2f",sT);
    }
}
