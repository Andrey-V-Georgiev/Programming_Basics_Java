package _14_The_Sixth_Exercises;

import java.util.Scanner;

/**
 * Created on 05-May-17.
 */
public class SumOfTwoNumbers_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = Integer.parseInt(scanner.nextLine());
        int f = Integer.parseInt(scanner.nextLine());
        int mN = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = s; i <=f ; i++) {
            for (int j = s; j <=f ; j++) {
                counter++;
                if(i+j==mN){
                    System.out.printf("Combination N:%d (%d + %d = %d)",counter,i,j,mN);
                return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d",counter,mN);
    }
}
