package _12_The_Fourth_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 02-May-17.
 */
public class Game_Of_Intervals_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());

        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double n5 = 0;
        double n6 = 0;
        double points = 0;

        for (int i = 1; i <= n; i++) {
            double curr = Double.parseDouble(scanner.nextLine());
            if (curr>-1&&curr<10) {
                n1++;
                points=points+(curr*0.2);
            } else if (curr>9&&curr<20) {
                n2++;
                points=points+(curr*0.3);
            } else if (curr>19&&curr<30) {
                n3++;
                points=points+(curr*0.4);
            } else if (curr>29&&curr<40) {
                n4++;
                points=points+50;
            } else if (curr>39&&curr<51) {
                n5++;
                points=points+100;
            } else if (curr<0||curr>50) {
                n6++;
                points=points/2;
            }
        }

        double percent1 = n1 / n * 100;
        double percent2 = n2 / n * 100;
        double percent3 = n3 / n * 100;
        double percent4 = n4 / n * 100;
        double percent5 = n5 / n * 100;
        double percent6 = n6 / n * 100;

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(points));
        System.out.println("From 0 to 9: "+df.format(percent1)+"%");
        System.out.println("From 10 to 19: "+df.format(percent2)+"%");
        System.out.println("From 20 to 29: "+df.format(percent3)+"%");
        System.out.println("From 30 to 39: "+df.format(percent4)+"%");
        System.out.println("From 40 to 50: "+df.format(percent5)+"%");
        System.out.println("Invalid numbers: "+df.format(percent6)+"%");



    }
}
