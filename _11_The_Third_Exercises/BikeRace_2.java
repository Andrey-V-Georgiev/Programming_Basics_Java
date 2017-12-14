package _11_The_Thurd_Exercises;

import java.util.Scanner;

/**
 * Created on 29-Apr-17.
 */
public class BikeRace_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nJ = Double.parseDouble(scanner.nextLine());
        double nS = Double.parseDouble(scanner.nextLine());
        double nA=nJ+nS;
        String type = scanner.nextLine();

        double pJ = 0;
        double pS = 0;
        double pA = pJ + pS;

        switch (type) {
            case "trail":
                pJ = nJ * 5.5;
                pS = nS * 7;
                pA = pJ + pS;
                break;
            case "cross-country":
                pJ = nJ * 8;
                pS = nS * 9.5;
                pA = pJ + pS;
                if(nA>=50){
                    pA=pA*0.75;
                }
                break;
            case "downhill":
                pJ = nJ * 12.25;
                pS = nS * 13.75;
                pA = pJ + pS;
                break;
            case "road":
                pJ = nJ * 20;
                pS = nS * 21.50;
                pA = pJ + pS;
                break;
        }

        pA=pA*0.95;
        System.out.printf("%.2f",pA);

    }
}
