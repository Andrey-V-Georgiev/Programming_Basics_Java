package _12_The_Fourth_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 29-Apr-17.
 */
public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 0; i < n; i++) {
            int currN = Integer.parseInt(scanner.nextLine());
            if (currN < 200) {
                p1++;
            } else if (currN>199&&currN<400) {
                p2++;
            } else if (currN>399&&currN<600) {
                p3++;
            } else if (currN>599&&currN<800) {
                p4++;
            } else if (currN>799) {
                p5++;
            }

        }
        double p1Percent=p1/n*100;
        double p2Percent=p2/n*100;
        double p3Percent=p3/n*100;
        double p4Percent=p4/n*100;
        double p5Percent=p5/n*100;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(p1Percent)+"%");
        System.out.println(df.format(p2Percent)+"%");
        System.out.println(df.format(p3Percent)+"%");
        System.out.println(df.format(p4Percent)+"%");
        System.out.println(df.format(p5Percent)+"%");

    }
}
