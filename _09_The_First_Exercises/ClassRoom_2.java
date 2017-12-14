package _09_The_First_Exercises;

import java.util.Scanner;

/**
 * Created on 24-Apr-17.
 */
public class ClassRoom_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine())*100;
        double hight= Double.parseDouble(scanner.nextLine())*100;

        int numHight=((int)hight-100)/70;
        int numWidth=(int)width/120;
        int allWP=(numHight*numWidth)-3;

        System.out.println(allWP);

    }
}
