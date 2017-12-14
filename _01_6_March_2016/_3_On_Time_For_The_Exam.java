package _01_6_March_2016;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Ordna on 13-Apr-17.
 */
public class _3_On_Time_For_The_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        DecimalFormat df2 = new DecimalFormat("00");
        int examHoursInput = Integer.parseInt(scanner.nextLine()) * 60;
        int examMinutesInput = Integer.parseInt(scanner.nextLine());
        int examTotalSum = examHoursInput + examMinutesInput;

        int arrivalHoursInput = Integer.parseInt(scanner.nextLine()) * 60;
        int arrivalMinutesInput = Integer.parseInt(scanner.nextLine());
        int arrivalTotalSum = arrivalHoursInput + arrivalMinutesInput;

        int examHoursOutput = (examHoursInput + examMinutesInput) / 60;
        int examMinutesOutput = (examHoursInput + examMinutesInput) % 60;

        int arrivalHoursOutput = (arrivalHoursInput + arrivalMinutesInput) / 60;
        int arrivalMinutesOutput = (arrivalHoursInput + arrivalMinutesInput) % 60;

        int timeDifference = examTotalSum - arrivalTotalSum;
        int hoursDifference = Math.abs(timeDifference / 60);
        int minutesDifference = Math.abs(timeDifference % 60);

        if (timeDifference < 0) {
            System.out.println("Late");
            if (Math.abs(timeDifference) > 59) {
                System.out.print( hoursDifference+":"+df2.format(minutesDifference)+" hours after the start");
            } else {
                System.out.print(df.format(minutesDifference)+" minutes after the start");
            }
        } else if (timeDifference > -1 && timeDifference <= 30) {
            if (timeDifference == 0) {
                System.out.println("On time");
            } else {
                System.out.println("On time");
                System.out.print(df.format(minutesDifference)+" minutes before the start");
            }
        } else if (timeDifference > 30) {
            if (timeDifference > 30 && timeDifference < 60) {
                System.out.println("Early");
                System.out.print(df.format(minutesDifference)+" minutes before the start");
            } else if (timeDifference >= 60) {
                System.out.println("Early");
                System.out.print(hoursDifference+":"+df2.format(minutesDifference)+" hours before the start");
            }


        }
    }
}
