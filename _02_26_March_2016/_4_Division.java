package _02_26_March_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 13-Apr-17.
 */
public class _4_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1=0;
        double p2=0;
        double p3=0;
        for (int i = 0; i <n ; i++) {
            int currNum= Integer.parseInt(scanner.nextLine());
            if(currNum%2==0){
                p1++;
            }
            if(currNum%3==0){
                p2++;
            }
            if(currNum%4==0){
                p3++;
            }
        }
        double percent_p1=(p1/n)*100.0;
        double percent_p2=(p2/n)*100.0;
        double percent_p3=(p3/n)*100.0;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n",percent_p1,percent_p2,percent_p3);
    }
}
