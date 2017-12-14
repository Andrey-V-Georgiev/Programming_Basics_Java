package _08_28_August_2016;

import java.util.Scanner;

/**
 * Created on 22-Apr-17.
 */
public class _04_Hospital {
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);
        int period= Integer.parseInt(scanner.nextLine());
        int treated=0;
        int untreated=0;
        int treatedSum=0;
        int untreatedSum=0;
        int diff1=0;
        int doctors= 7;


        for (int i = 1; i <=period ; i++) {
            int qnIncPatients= Integer.parseInt(scanner.nextLine());
            if(i%3==0){
                if(untreatedSum>treatedSum){
                    doctors++;
                }
            }
            diff1=doctors-qnIncPatients;
            if(diff1<0){
                untreated=Math.abs(diff1);
                untreatedSum+=untreated;
                treated=doctors;
                treatedSum+=treated;
            }else{
                untreated=0;
                untreatedSum+=untreated;
                treated=qnIncPatients;
                treatedSum+=treated;
            }

        }


        System.out.printf("Treated patients: %d.%n",treatedSum);
        System.out.printf("Untreated patients: %d.",untreatedSum);


    }
}
