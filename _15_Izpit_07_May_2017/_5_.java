package _15_Izpit_07_May_2017;

import java.util.Scanner;

/**
 * Created on 05-May-17.
 */
public class _5_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row= (2*n)-1;
        int hight=(n/2)+4;

        //top 1
        System.out.print("@");

        for (int i = 1; i <=n-2 ; i++) {
            System.out.print(" ");
        }

        System.out.print("@");

        for (int i = 1; i <=n-2 ; i++) {
            System.out.print(" ");
        }

        System.out.print("@");
        System.out.println();

        //top 2
        int c1T=1;
        int c2T=n-3;
        int c3T=1;
        int c4T=n-3;
        int c5T=1;
        int c6T=1;
        int c7T=1;
        int c8T=1;
        int c9T=1;

//main for
        for (int i = 1; i <=hight-5 ; i++) {

            System.out.print("*");

            for (int j = 1; j <c1T ; j++) {
                System.out.print(".");
            }
            c1T++;
            System.out.print("*");

            for (int j =1; j <=c2T ; j++) {
                System.out.print(" ");
            }
            c2T-=2;
            System.out.print("*");

            if(i>1&&i<n/2) {
                for (int j = 1; j <= c3T; j++) {
                    System.out.print(".");
                }
                c3T += 2;
                System.out.print("*");
            }
            for (int j =1; j <=c4T ; j++) {
                System.out.print(" ");
            }
            c4T-=2;
            System.out.print("*");
            for (int j = 1; j <c5T ; j++) {
                System.out.print(".");
            }
            c5T++;
            System.out.print("*");

            System.out.println();
        }

        //body 1

        System.out.print("*");

        for (int i = 1; i <=(n-2)/2 ; i++) {
            System.out.print(".");
        }
        System.out.print("*");
        for (int i = 1; i <=row-4-(n-2) ; i++) {
            System.out.print(".");
        }
        System.out.print("*");
        for (int i = 1; i <=(n-2)/2 ; i++) {
            System.out.print(".");
        }
        System.out.print("*");
        System.out.println();

        //body 2
        System.out.print("*");
        for (int i = 1; i <=n/2 ; i++) {
            System.out.print(".");
        }
        for (int i = 1; i <=(n/2)-2 ; i++) {
            System.out.print("*");
        }
        System.out.print(".");
        for (int i = 1; i <=(n/2)-2 ; i++) {
            System.out.print("*");
        }
        for (int i = 1; i <=n/2 ; i++) {
            System.out.print(".");
        }
        System.out.print("*");
        System.out.println();
        for (int i = 1; i <=row ; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <=row ; i++) {
            System.out.print("*");
        }


    }
}
