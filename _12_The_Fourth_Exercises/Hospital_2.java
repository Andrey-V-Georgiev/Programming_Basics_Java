package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 01-May-17.
 */
public class Hospital_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int treated=0;
        int untreated=0;
        int doctors=7;

        for (int i = 1; i <=n ; i++) {
            int curr= Integer.parseInt(scanner.nextLine());
            if(i%3==0){
                if(treated<untreated) {
                    doctors++;
                }
            }
            double diff1=doctors-curr;
            double diff2=Math.abs(diff1);
            if(diff1<0){
                treated=treated+doctors;
                untreated=untreated+(int)diff2;
            }else{
                treated=treated+curr;
            }
        }

        System.out.printf("Treated patients: %d.%n",treated);
        System.out.printf("Untreated patients: %d.",untreated);


    }
}
