package _06_18_December_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 15-Apr-17.
 */
public class _1_Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v1 = Double.parseDouble(scanner.nextLine());
        double t1 = Double.parseDouble(scanner.nextLine()) / 60;
        double t2 = Double.parseDouble(scanner.nextLine()) / 60;
        double t3 = Double.parseDouble(scanner.nextLine()) / 60;

        double s1 = t1 * v1;
        double v2 = v1 + (v1 * 0.1);
        double s2 = t2 * v2;
        double v3 = v2 - (v2 * 0.05);
        double s3 = t3 * v3;
        double sT = s1 + s2 + s3;

        System.out.printf("%.2f",sT);
    }
}
