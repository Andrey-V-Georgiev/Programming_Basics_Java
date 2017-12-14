package _01_6_March_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 13-Apr-17.
 */
public class _4_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double c1=0;
        double c2=0;
        double c3=0;
        double c4=0;
        double c5=0;

        double c1Output=0;
        double c2Output=0;
        double c3Output=0;
        double c4Output=0;
        double c5Output=0;

        for (int i = 0; i <n ; i++) {
            double currentNum= Double.parseDouble(scanner.nextLine());
            if(currentNum<200){
                c1++;
            }else if(currentNum>=200&&currentNum<400){
                c2++;
            }else  if(currentNum>=400&&currentNum<600){
                c3++;
            }else if(currentNum>=600&&currentNum<800){
                c4++;
            }else if(currentNum>=800){
                c5++;
            }
            c1Output=c1/n*100;
            c2Output=c2/n*100;
            c3Output=c3/n*100;
            c4Output=c4/n*100;
            c5Output=c5/n*100;

        }



        System.out.printf("%f%n%f%n%f%n%f%n%f%n",c1Output,c2Output,c3Output,c4Output,c5Output);

    }
}
