package _04_20_November_2016_Morning;

import java.text.DecimalFormat;
import java.util.Scanner;


public class _1_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double scumriqPrice = Double.parseDouble(scanner.nextLine());
        double scumriqWeight =0;
        double scumriqValue =0;

        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double cacaWeight =0;
        double cacaValue =0;

        double palamudWeight = Double.parseDouble(scanner.nextLine());
        double palamudPrice = scumriqPrice + scumriqPrice*0.60;
        double palamudValue =palamudPrice * palamudWeight;

        double safridWeight = Double.parseDouble(scanner.nextLine());
        double safridPrice = cacaPrice + cacaPrice*0.80;
        double safridValue = safridPrice * safridWeight;

        double midiWeight = Double.parseDouble(scanner.nextLine());
        double midiPrice =7.50;
        double midiValue = midiWeight * midiPrice;

        DecimalFormat df = new DecimalFormat("#.00");
        double bill = midiValue+safridValue+palamudValue;
        System.out.printf(df.format(bill));

    }
}
