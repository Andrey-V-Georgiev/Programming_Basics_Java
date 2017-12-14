package _14_The_Sixth_Exercises;

import java.util.Scanner;

/**
 * Created on 05-May-17.
 */
public class Digits_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int d1=(n/100)%10;
        int d2=(n/10)%10;
        int d3=(n/1)%10;

        int row=d1+d2;
        int col=d1+d3;

        for (int i = 1; i <=row ; i++) {
            System.out.println();
            for (int j = 1; j <=col ; j++) {
                if(n%5==0){
                    n=n-d1;
                }else if(n%3==0){
                    n=n-d2;
                }else{
                    n=n+d3;
                }
                System.out.print(n+" ");
            }

        }


    }
}
