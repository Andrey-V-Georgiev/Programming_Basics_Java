package _06_18_December_2016;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Ordna on 16-Apr-17.
 */
public class _4_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityStudents = Double.parseDouble(scanner.nextLine());

        double studentsI = 0;
        double studentsII = 0;
        double studentsIII = 0;
        double studentsIIII = 0;
        double sum = 0;

        for (int i = 0; i < quantityStudents; i++) {
            double currentEval = Double.parseDouble(scanner.nextLine());
            sum = sum + currentEval;
            if (currentEval >= 2.0 && currentEval <= 2.99) {
                studentsIIII++;
            } else if (currentEval >= 3.0 && currentEval <= 3.99) {
                studentsIII++;
            } else if (currentEval >= 4.0 && currentEval <= 4.99) {
                studentsII++;
            } else if (currentEval >= 5.0) {
                studentsI++;
            }
        }
        double percentI = (studentsI / quantityStudents) * 100;
        double percentII = (studentsII / quantityStudents) * 100;
        double percentIII = (studentsIII / quantityStudents) * 100;
        double percentIIII = (studentsIIII / quantityStudents) * 100;
        double averageEval = sum / quantityStudents;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Top students: "+ df.format(percentI)+"%");
        System.out.println("Between 4.00 and 4.99: "+ df.format(percentII)+"%");
        System.out.println("Between 3.00 and 3.99: "+ df.format(percentIII)+"%");
        System.out.println("Fail: "+ df.format(percentIIII)+"%");
        System.out.println("Average: "+ df.format(averageEval));

        //System.out.printf("Top students: %.2f%%%\nBetween 4.00 and 4.99: %.2f%%%\n Between 3.00 and 3.99: %.2f%%%\n Fail: %.2f%%%\nAverage: %.2f%"
         //       , percentI, percentII, percentIII, percentIIII, averageEval);
    }
}

