package _13_The_Fifth_Exercises;

import java.util.Scanner;

/**
 * Created on 04-May-17.
 */
public class Axe_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row=5*n;

        //Top
        int c1top=0;
        int c2top=row-(3*n+2);

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=3*n ; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 0; j <c1top ; j++) {
                System.out.print("-");
            }
            c1top++;
            System.out.print("*");
            for (int j = 1; j <=c2top ; j++) {
                System.out.print("-");
            }
            c2top--;
            System.out.println();

        }
        //Body 1
        int c1body=n/2;
        int c2body=3*n;

        for (int i = 1; i <=c1body ; i++) {
            for (int j = 1; j <=c2body ; j++) {
                System.out.print("*");
            }
            System.out.print("*");
            for (int j = 1; j <=n-1 ; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 1; j <=n-1 ; j++) {
                System.out.print("-");
            }
            System.out.println();

        }
        //Body 2
        int c3body=n/2;
        int c4body=3*n;
        int c5body=n-1;
        int c6body=n-1;

        for (int i = 1; i <=c3body ; i++) {
            for (int j = 1; j <=c4body ; j++) {
                System.out.print("-");
            }
            c4body--;
            System.out.print("*");
            for (int j = 1; j <=c5body ; j++) {

            if(i==c3body){
                System.out.print("*");
            }else{System.out.print("-");}
            }
            c5body+=2;
            System.out.print("*");
            for (int j = 1; j <=c6body; j++) {
                System.out.print("-");
            }
            c6body--;
            System.out.println();

        }


    }
}
