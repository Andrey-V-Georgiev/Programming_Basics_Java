package _07_18_March_2017;

import java.util.Scanner;

/**
 * Created by Ordna on 16-Apr-17.
 */
public class _1_DogHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double roofSides = (a * (a / 2)) * 2;
        double sidesHouse = (a * (a / 2)) * 2;

        double backSquare = (a / 2) * (a / 2);
        double triangle = ((a / 2)*(b-(a/2)))/2;
        double backSide = triangle + backSquare;

        double frontSide = backSide - ((a / 5) * (a / 5));


        double redArea = roofSides;
        double greenArea = sidesHouse + backSide + frontSide;
        double redPaint = redArea / 5;
        double greenPaint = greenArea / 3;


        System.out.printf("%.2f%n",greenPaint);
        System.out.printf("%.2f",redPaint);
    }
}
