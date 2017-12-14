package _14_The_Sixth_Exercises;

import java.util.Scanner;

/**
 * Created on 06-May-17.
 */
public class Battles_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numFirst = Integer.parseInt(scanner.nextLine());
        int numSecond= Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        int counter=0;


        for (int i = 1; i <=numFirst ; i++) {
            for (int j = 1; j <=numSecond ; j++) {
                counter++;
                System.out.printf("(%d <-> %d) ",i,j);
                if(counter==max){
                    return;
                }
            }
        }

    }
}
