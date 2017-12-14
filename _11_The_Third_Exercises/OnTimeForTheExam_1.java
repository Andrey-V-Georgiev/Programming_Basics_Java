package _11_The_Thurd_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 28-Apr-17.
 */
public class OnTimeForTheExam_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double examHours = Double.parseDouble(scanner.nextLine());
        double examMinutes = Double.parseDouble(scanner.nextLine());
        double arrivingHours = Double.parseDouble(scanner.nextLine());
        double arrivingMinutes = Double.parseDouble(scanner.nextLine());

        double examTime=(examHours*60)+examMinutes;
        double arrivingTime=(arrivingHours*60)+arrivingMinutes;

        int diff1InMinutes=(int)(examTime-arrivingTime);
        int diff2InMinutes= Math.abs(diff1InMinutes);
        int diffHours= diff2InMinutes/60;
        int diffMinutes= diff2InMinutes%60;
        DecimalFormat df = new DecimalFormat("00");


        if(diff1InMinutes>=0&&diff1InMinutes<60){
            if(diff1InMinutes>=0&&diff1InMinutes<=30){
                System.out.println("On time");
                System.out.println(diffMinutes+" minutes before the start");
            }else {
                System.out.println("Early");
                System.out.println(diffMinutes + " minutes before the start");
            }

        }else if(diff1InMinutes>=60){
            System.out.println("Early");
            System.out.println(diffHours+":"+df.format(diffMinutes)+" hours before the start");
        }else if(diff1InMinutes<0&&diff1InMinutes>-60){
            System.out.println("Late");
            System.out.println(diffMinutes+" minutes after the start");
        }else if(diff1InMinutes<=-60){
            System.out.println("Late");
            System.out.println(diffHours+":"+df.format(diffMinutes)+" hours after the start");
        }

    }
}
