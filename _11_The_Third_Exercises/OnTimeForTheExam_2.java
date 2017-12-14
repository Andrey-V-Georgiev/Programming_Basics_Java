package _11_The_Thurd_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 29-Apr-17.
 */
public class OnTimeForTheExam_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double examHour = Double.parseDouble(scanner.nextLine());
        double examMinute = Double.parseDouble(scanner.nextLine());
        double arrivingHour = Double.parseDouble(scanner.nextLine());
        double arrivingMinute = Double.parseDouble(scanner.nextLine());
        double examTimeMin=(examHour*60)+examMinute;
        double arrivingTimeMin=(arrivingHour*60)+arrivingMinute;
        double diff1=examTimeMin-arrivingTimeMin;
        double diff2=Math.abs(diff1);
        int diff3=(int)diff2;
        int diffHour=diff3/60;
        int diffMinute=diff3%60;
        DecimalFormat df = new DecimalFormat("00");
        if(diff1<0&&diff1>-60){
            System.out.println("Late");
            System.out.println(diffMinute+" minutes after the start");//zakysnenie pod chas
        }else if(diff1<=-60){
            System.out.println("Late");
            System.out.println(diffHour+":"+df.format(diffMinute)+" hours after the start");//zakusnenie nad chas
        }else if(diff1>-1&&diff1<=30){
            System.out.println("On time");
            System.out.println(diffMinute+" minutes before the start");
        }else if(diff1>30&&diff1<60){
            System.out.println("Early");
            System.out.println(diffMinute+" minutes before the start");//po malko ot 4as
        }else if(diff1>=60){
            System.out.println("Early");
            System.out.println(diffHour+":"+df.format(diffMinute)+" hours before the start");//po rano s chas inpoveche
        }




    }
}
