package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 02-May-17.
 */
public class Division_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        int n1=0;
        int n2=0;
        int n3=0;

        for (int i = 1; i <=n ; i++) {
            int curr= Integer.parseInt(scanner.nextLine());

            if(curr%2==0){
                n1++;
            }
            if(curr%3==0){
                n2++;
            }
            if(curr%4==0){
                n3++;
            }
        }
        double percent1=n1/n*100;
        double percent2=n2/n*100;
        double percent3=n3/n*100;

        System.out.printf("%.2f%%%n",percent1);
        System.out.printf("%.2f%%%n",percent2);
        System.out.printf("%.2f%%%n",percent3);

    }
}
