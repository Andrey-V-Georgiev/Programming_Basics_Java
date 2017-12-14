package _03_24_April_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 13-Apr-17.
 */
public class _2_SleepyTomCat {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int holyDays = Integer.parseInt(scanner.nextLine());
        int workingDays = 365 - holyDays;

        int workingDays_Play_Hours = workingDays * 63;
        int holyDays_Play_Hours = holyDays * 127;
        int total_Play_hours = workingDays_Play_Hours + holyDays_Play_Hours;

        int difference = 30000 - total_Play_hours;
        int hoursDiff = Math.abs(difference)/60;
        int minutesDiff = Math.abs(difference)%60;

        if(difference<0){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",hoursDiff,minutesDiff);
        }else{
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",hoursDiff,minutesDiff);
        }


    }

}
