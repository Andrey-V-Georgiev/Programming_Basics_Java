package _13_The_Fifth_Exercises;

import java.util.Scanner;

/**
 * Created on 03-May-17.
 */
public class Butterfly_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row=2*n-1;
        //Up
        for (int i = 1; i <=n-2 ; i++) {
            //Left Side 1
            for (int j = 1; j <=n-2 ; j++) {
                if(i%2==0){
                    System.out.print("-");
                }else{
                    System.out.print("*");
                }
            }
            //Midd 1
            System.out.print("\\");
            System.out.print(" ");
            System.out.print("/");
             //Right Side 1
            for (int j = 1; j <=n-2 ; j++) {
                if(i%2==0){
                    System.out.print("-");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();

        }
        //Middle Part
        for (int i = 1; i <=n-1 ; i++) {
            System.out.print(" ");
        }
        System.out.print("@");
        for (int i = 1; i <=n-1 ; i++) {
            System.out.print(" ");
        }
        System.out.println();

        //Down PArt
        for (int i = 1; i <=n-2 ; i++) {
            //Left Side 2
            for (int j = 1; j <=n-2 ; j++) {
                if(i%2==0){
                    System.out.print("-");
                }else{
                    System.out.print("*");
                }
            }
            //Middle 2
            System.out.print("/");
            System.out.print(" ");
            System.out.print("\\");
            //Right Side 2
            for (int j = 1; j <=n-2 ; j++) {
                if(i%2==0){
                    System.out.print("-");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();

        }

    }
}
