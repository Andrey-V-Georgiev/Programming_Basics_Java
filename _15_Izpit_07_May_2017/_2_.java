package _15_Izpit_07_May_2017;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 05-May-17.
 */
public class _2_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceExcursion = Double.parseDouble(scanner.nextLine());

        double numPuz = Double.parseDouble(scanner.nextLine());
        double numKukli = Double.parseDouble(scanner.nextLine());
        double numBears = Double.parseDouble(scanner.nextLine());
        double numMinions = Double.parseDouble(scanner.nextLine());
        double numTrucks = Double.parseDouble(scanner.nextLine());

        double numSum=numBears+numKukli+numMinions+numPuz+numTrucks;

        double pricePuz =  2.6;
        double priceKukli =    3;
        double priceBears =   4.1;
        double priceMinions =   8.2;
        double priceTrucks =      2;

        double moneyPuz=pricePuz*numPuz;
        double moneyKukli=priceKukli*numKukli;
        double moneyBears=priceBears*numBears;
        double moneyMinions=priceMinions*numMinions;
        double moneyTrucks=numTrucks*priceTrucks;

        double moneySum=moneyBears+moneyKukli+moneyMinions+moneyPuz+moneyTrucks;
        double naem=moneySum*0.1;
         moneySum=moneySum-naem;

        if(numSum>=50){
            moneySum=moneySum*0.75;
        }
        double diff1= priceExcursion-moneySum;
        double diff2=Math.abs(diff1);
        DecimalFormat df = new DecimalFormat("0.00");



       if(diff1<=0){
           System.out.print("Yes! "+df.format(diff2)+" lv left.");
       }else{
           System.out.print("Not enough money! "+df.format(diff2)+" lv needed.");
       }


    }
}
