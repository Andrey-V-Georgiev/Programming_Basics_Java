package _11_The_Thurd_Exercises;

import java.util.Scanner;

/**
 * Created on 29-Apr-17.
 */
public class Flowers_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nH = Double.parseDouble(scanner.nextLine());
        double nR = Double.parseDouble(scanner.nextLine());
        double nL = Double.parseDouble(scanner.nextLine());
        double nA = nH+nR+nL;
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double pH = 0;
        double pR = 0;
        double pL = 0;
        double pA=pH+pR+pL;

        if(season.equals("Summer")||season.equals("Spring")){
             pH =nH*2;
             pR =nR*4.1;
             pL =nL*2.5;
             pA=pH+pR+pL;
            if(holiday.equals("Y")){
                pA=pA*1.15;
            }
            if(season.equals("Spring")&&nL>7){
                pA=pA*0.95;
            }
            if(nA>20){
                pA=pA*0.8;
            }
        }else if(season.equals("Autumn")||season.equals("Winter")){
             pH =nH*3.75;
             pR =nR*4.5;
             pL =nL*4.15;
             pA=pH+pR+pL;
            if(holiday.equals("Y")){
                pA=pA*1.15;
            }
            if(season.equals("Winter")&&nR>=10){
                pA=pA*0.9;
            }
            if(nA>20){
                pA=pA*0.8;
            }
        }
        System.out.printf("%.2f",pA+2);

    }
}
