package _07_18_March_2017;

import java.util.Scanner;

/**
 * Created by Ordna on 22-Apr-17.
 */
public class _6_SumOfTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  start = Integer.parseInt(scanner.nextLine());
        int  finish = Integer.parseInt(scanner.nextLine());
        int  magicNum = Integer.parseInt(scanner.nextLine());
        int counter=0;

        for (int i = start; i <=finish ; i++) {
            for (int j = start; j <=finish ; j++) {
                counter++;
                if(magicNum==i+j){
                    System.out.printf("Combination N:%d (%d + %d = %d)",counter,i,j,magicNum);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d",counter,magicNum);


    }
}
