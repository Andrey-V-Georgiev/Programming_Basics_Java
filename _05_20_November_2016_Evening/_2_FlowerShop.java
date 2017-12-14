package _05_20_November_2016_Evening;

import java.text.DecimalFormat;
import java.util.Scanner;


public class _2_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double countMagnolii = Double.parseDouble(scanner.nextLine());
        double countZiumbiuli = Double.parseDouble(scanner.nextLine());
        double countRozi = Double.parseDouble(scanner.nextLine());
        double countKaktusi = Double.parseDouble(scanner.nextLine());

        double presentPrice = Double.parseDouble(scanner.nextLine());

        double priceMagnolii =3.25;
        double priceZiumbiuli =4;
        double priceRozi =3.50;
        double priceKaktusi = 8;

        double profit=  priceMagnolii*countMagnolii+
                        priceZiumbiuli*countZiumbiuli+
                        priceRozi*countRozi+
                        priceKaktusi*countKaktusi;

        double profit2= profit-(profit*0.05);
        double diff1=profit2-presentPrice;
        double diff2=Math.abs(diff1);

        DecimalFormat df = new DecimalFormat("0");
        if(diff1>=0){

            System.out.println("She is left with "+df.format( Math.floor(diff2))+" leva.");
        }else{

            System.out.println("She will have to borrow "+df.format(Math.ceil(diff2) )+" leva.");
        }


    }
}
