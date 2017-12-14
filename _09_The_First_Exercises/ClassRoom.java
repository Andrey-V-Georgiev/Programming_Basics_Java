package _09_The_First_Exercises;

import java.util.Scanner;

/**
 * Created on 23-Apr-17.
 */
public class ClassRoom {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        double width=Double.parseDouble(scanner.nextLine())*100;
        double hight=Double.parseDouble(scanner.nextLine())*100;

        int hightCapacity= ((int)hight-100)/70;
        int widthCapacity=(int)width/120;
        int totalCapacity=(hightCapacity*widthCapacity)-3;
        System.out.println((int)totalCapacity);

    }
}
