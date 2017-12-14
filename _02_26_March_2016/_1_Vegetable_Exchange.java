package _02_26_March_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 13-Apr-17.
 */
public class _1_Vegetable_Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        double pV = a * c;
        double pF = b * d;
        double pT = (pV + pF) / 1.94;

        System.out.printf("%.13f%n",pT);

    }

}

