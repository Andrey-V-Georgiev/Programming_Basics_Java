package _05_20_November_2016_Evening;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Ordna on 15-Apr-17.
 */
public class _3_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorsN = Integer.parseInt(scanner.nextLine());
        int seniorsN = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();

        double juniorsFee = 0;
        double seniorsFee = 0;
        double allPeopleN = juniorsN + seniorsN;
        double allMoney=0;


        if (str.equals("trail")) {

            juniorsFee = juniorsN * 5.50;
            seniorsFee = seniorsN * 7;
            allMoney = juniorsFee + seniorsFee;

        } else if (str.equals("cross-country")) {

            juniorsFee = juniorsN * 8;
            seniorsFee = seniorsN * 9.50;
            allMoney = juniorsFee + seniorsFee;

            if (allPeopleN >= 50) {
                allMoney = juniorsFee + seniorsFee;
                double fee = allMoney * 0.25;
                allMoney -= fee;
            }

        } else if (str.equals("downhill")) {

            juniorsFee = juniorsN * 12.25;
            seniorsFee = seniorsN * 13.75;
            allMoney = juniorsFee + seniorsFee;

        } else if (str.equals("road")) {

            juniorsFee = juniorsN * 20;
            seniorsFee = seniorsN * 21.50;
            allMoney = juniorsFee + seniorsFee;
        }

        double fee5percent = allMoney * 0.05;
        double finalMoney = allMoney - fee5percent;

        System.out.printf("%.2f", finalMoney);

    }
}
