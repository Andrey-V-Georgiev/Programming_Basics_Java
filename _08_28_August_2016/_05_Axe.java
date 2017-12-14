package _08_28_August_2016;

import java.util.Scanner;

/**
 * Created on 22-Apr-17.
 */
public class _05_Axe {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int c1=1;
        int row=5*n;
        int upperRightC=row-(3*n+2)+1;
        int c2=3*n+1;
        int c3=n-3;
        int c4 =n;
        //First part
        for (int i = 1; i <=n ; i++) {
            //Left side
            for (int j = 1; j <=3*n ; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            //Middle part

            for (int j = 1; j <c1 ; j++) {
                System.out.print("-");
            }
            c1++;
            System.out.print("*");
            //Right part
            upperRightC--;
            for (int j = 1; j <=upperRightC ; j++) {
                System.out.print("-");
            }

            System.out.println();

        }
        //Second part
        for (int i = 0; i <n/2 ; i++) {
            //Left part
            for (int j = 0; j <3*n+1 ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <n-1 ; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 0; j <n-1 ; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        //Third part
        for (int i = 0; i <=n/2-1 ; i++) {
            //Left part
            c2--;
            for (int j = 0; j <c2 ; j++) {

                System.out.print("-");
            }
            System.out.print("*");
            //Middle part
            c3+=2;
            for (int j = 0; j <c3 ; j++) {
                if(i==n/2-1){
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }
            }
           System.out.print("*");
            //Right side
            c4--;
            for (int j = 0; j <c4 ; j++) {
                System.out.print("-");
            }
            System.out.println();
        }


    }
}
