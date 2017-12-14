package _04_20_November_2016_Morning;

import java.util.Scanner;

/**
 * Created by Ordna on 14-Apr-17.
 */
public class _3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldP = Integer.parseInt(scanner.nextLine());
        int youngP = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        String string = scanner.nextLine();

        double transportEx = 0;
        double hotelEx = nights * 82.99;
        double sumP = oldP + youngP;


        switch (string) {

            case "train":
                if (sumP>=50){
                    transportEx = oldP * 24.99 + youngP * 14.99;
                }else {
                    transportEx = (oldP * 24.99 + youngP * 14.99)*2;
                }

                break;
            case "bus":
                transportEx = (oldP * 32.50 + youngP * 28.50)*2;

                break;
            case "boat":
                transportEx = (oldP * 42.99 + youngP * 39.99)*2;

                break;
            case "airplane":
                transportEx = (oldP * 70.00 + youngP * 50.00)*2;

                break;

        }

        double commission = (transportEx + hotelEx) * 0.1;
        double sumMoney = transportEx + hotelEx + commission;
        System.out.printf("%.2f",sumMoney);

    }
}
