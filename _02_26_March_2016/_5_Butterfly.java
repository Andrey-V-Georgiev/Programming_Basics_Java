package _02_26_March_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 13-Apr-17.
 */
public class _5_Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String upperMid="\\ /";
        String lowerMid="/ \\";

        //up
        for (int i = 1; i <=n-2 ; i++) {
            for (int j = 1; j <=n-2 ; j++) {
                if(!(i%2==0)){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }

            }
            System.out.print(upperMid);

            for (int j = 1; j <=n-2 ; j++) {
                if(!(i%2==0)){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }

            }
            System.out.println();

        }
        //mid
        for (int i = 0; i <n-1 ; i++) {
            System.out.print(" ");
        }
        System.out.print("@");

        for (int i = 0; i <n-1 ; i++) {
            System.out.print(" ");
        }
        System.out.println();

        //low
        for (int i = 1; i <=n-2 ; i++) {
            for (int j = 1; j <=n-2 ; j++) {
                if(!(i%2==0)){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }

            }
            System.out.print(lowerMid);

            for (int j = 1; j <=n-2 ; j++) {
                if(!(i%2==0)){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }

            }
            System.out.println();

        }

    }
}
