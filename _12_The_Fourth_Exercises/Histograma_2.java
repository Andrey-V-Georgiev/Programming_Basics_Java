package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 01-May-17.
 */
public class Histograma_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double p1=0;
        double p2=0;
        double p3=0;
        double p4=0;
        double p5=0;




        for (int i = 1; i <=n ; i++) {

            double curr= Double.parseDouble(scanner.nextLine());
            if(curr>-1&&curr<200){
                p1++;

            }else if(curr>199&&curr<400){
                p2++;

            }else if(curr>399&&curr<600){
                p3++;

            }else if(curr>599&&curr<800){
                p4++;

            }else if(curr>799){
                p5++;

            }

        }

        double percent1 = p1/n*100;
        double percent2 = p2/n*100;
        double percent3 = p3/n*100;
        double percent4 = p4/n*100;
        double percent5 = p5/n*100;

        System.out.printf("%.2f%%%n",percent1);
        System.out.printf("%.2f%%%n",percent2);
        System.out.printf("%.2f%%%n",percent3);
        System.out.printf("%.2f%%%n",percent4);
        System.out.printf("%.2f%%%n",percent5);

    }

}
