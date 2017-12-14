package _07_18_March_2017;

import java.util.Scanner;

/**
 * Created by Ordna on 18-Apr-17.
 */
public class _4_Game_Of_Intervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numIterations = Double.parseDouble(scanner.nextLine());
        double digit1 = 0;
        double digit2 = 0;
        double digit3 = 0;
        double digit4 = 0;
        double digit5 = 0;
        double digit6 = 0;

        double sum=0;


        for (int i = 1; i <= numIterations; i++) {
            double currInterval = Double.parseDouble(scanner.nextLine());

            if (currInterval >= 0 && currInterval <= 9) {
                digit1++;
                sum = sum+(currInterval/100)*20;
            } else if (currInterval >= 10 && currInterval <= 19) {
                digit2++;
                sum =sum+ (currInterval/100)*30;
            } else if (currInterval >= 20 && currInterval <= 29) {
                digit3++;
                sum =sum+ (currInterval/100)*40;
            } else if (currInterval >= 30 && currInterval <= 39) {
                digit4++;
                sum+=50;
            } else if (currInterval >= 40 && currInterval <= 50) {
                digit5++;
                sum+=100;
            } else if (currInterval < 0 || currInterval > 50) {
                digit6++;
                sum/=2;
            }
        }
        double percent1 =digit1 /numIterations*100;
        double percent2 =digit2 /numIterations*100;
        double percent3 =digit3 /numIterations*100;
        double percent4 =digit4 /numIterations*100;
        double percent5 =digit5 /numIterations*100;
        double percent6 =digit6 /numIterations*100;



        System.out.printf("%.2f%n",sum);
        System.out.printf("From 0 to 9: %.2f%%%n",percent1);
        System.out.printf("From 10 to 19: %.2f%%%n",percent2);
        System.out.printf("From 20 to 29: %.2f%%%n",percent3);
        System.out.printf("From 30 to 39: %.2f%%%n",percent4);
        System.out.printf("From 40 to 50: %.2f%%%n",percent5);
        System.out.printf("Invalid numbers: %.2f%%%n",percent6);

    }
}
