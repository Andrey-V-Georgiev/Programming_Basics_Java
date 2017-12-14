package _09_The_First_Exercises;

import java.util.Scanner;

/**
 * Created on 23-Apr-17.
 */
public class Dog_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A= Double.parseDouble(scanner.nextLine());
        double B= Double.parseDouble(scanner.nextLine());

        double twoSides= A*(A/2)*2;
        double backSide= (A/2*A/2)+(((B-(A/2))*A/2)/2);
        double frontSide=backSide-((A/5)*(A/5));
        double roof=(A*(A/2))*2;

        double roofRedL=roof/5;
        double wallsGreenL=(twoSides+backSide+frontSide)/3;

        System.out.printf("%.2f%n",wallsGreenL);
        System.out.printf("%.2f",roofRedL);

    }
}
