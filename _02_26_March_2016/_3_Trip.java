package _02_26_March_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 13-Apr-17.
 */
public class _3_Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum= Double.parseDouble(scanner.nextLine());
        String season=scanner.nextLine();

        if(sum>1000){
            System.out.println("Somewhere in Europe");
            double percent_Europe=sum/100*90;
            System.out.printf("Hotel - %.2f",percent_Europe);
        }else if(sum<=1000&&sum>100){
            System.out.println("Somewhere in Balkans");
            if(season.equals("summer")){
                double summer_B_Camp=sum/100*40;
                System.out.printf("Camp - %.2f",summer_B_Camp);
            }else  if(season.equals("winter")){
                double winter_B_Hotel=sum/100*80;
                System.out.printf("Hotel - %.2f",winter_B_Hotel);
            }
        }else if(sum<=100){
            System.out.println("Somewhere in Bulgaria");
            if(season.equals("summer")){
                double summer_BG_Camp=sum/100*30;
                System.out.printf("Camp - %.2f",summer_BG_Camp);
            }else if(season.equals("winter")){
                double winter_BG_Hotel=sum/100*70;
                System.out.printf("Hotel - %.2f",winter_BG_Hotel);
            }
        }
    }
}
