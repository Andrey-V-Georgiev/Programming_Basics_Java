package _11_The_Thurd_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created on 29-Apr-17.
 */
public class CarToGo_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season=scanner.nextLine();
        String clasS ="";
        String type="";
        double price=0;

        if(budget<=100){
           if(season.equals("Summer")){
              clasS ="Economy class";
              type="Cabrio";
               price=budget*0.35 ;
           }else if(season.equals("Winter")){
                clasS ="Economy class";
                type="Jeep";
               price=budget*0.65;
           }
        }else if(budget>100&&budget<=500){
            if(season.equals("Summer")){
                clasS ="Compact class";
                type="Cabrio";
                price=budget*0.45;
            }else if(season.equals("Winter")){
                 clasS ="Compact class";
                 type="Jeep";
                price=budget*0.8;
            }
        }else if(budget>500){

                clasS ="Luxury class";
                type="Jeep";
                price=budget*0.9;

        }
        DecimalFormat df = new DecimalFormat("0.000");
        double p=Double.parseDouble(df.format(price));

        System.out.println(clasS);
        System.out.printf("%s - %.2f",type,p);
    }
}
