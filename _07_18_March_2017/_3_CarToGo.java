package _07_18_March_2017;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Ordna on 17-Apr-17.
 */
public class _3_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String clasS ="";
        String typeVehicle ="";
        double priceRent = 0;

        //Conditions
        //if (budget >= 10.00 && budget <= 10000.00) {
            if (budget <= 100) {
                clasS ="Economy class";
                if (season.equals("Summer")) {
                    typeVehicle ="Cabrio";
                    priceRent = (budget / 100) * 35;
                } else if (season.equals("Winter")) {
                    typeVehicle ="Jeep";
                    priceRent = (budget / 100) * 65;
                }

            } else if (budget > 100 && budget <= 500) {
                clasS ="Compact class";
                if (season.equals("Summer")) {
                    typeVehicle ="Cabrio";
                    priceRent = (budget / 100) * 45;
                } else if (season.equals("Winter")) {
                    typeVehicle ="Jeep";
                    priceRent = (budget / 100) * 80;
                }
            } else if (budget > 500) {
                clasS = "Luxury class";
                typeVehicle ="Jeep";
                priceRent = (budget / 100) * 90;
            }


            //Output


            DecimalFormat df = new DecimalFormat("0.000");
            System.out.println(clasS);
            double temp1=Double.valueOf(df.format(priceRent));

            System.out.printf("%s - %.2f",typeVehicle,temp1);
        }
    }
//}


