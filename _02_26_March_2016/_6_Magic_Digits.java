package _02_26_March_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 13-Apr-17.
 */
public class _6_Magic_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());




        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=9 ; j++) {
                for (int k = 1; k <=9 ; k++) {
                    for (int l = 1; l <=9 ; l++) {
                        for (int m = 1; m <=9; m++) {
                            for (int o = 1; o <=9 ; o++) {
                                int sum = i*j*k*l*m*o;
                                if(n==sum){
                                    System.out.printf("%d%d%d%d%d%d ",i,j,k,l,m,o);
                                }
                            }

                        }

                    }

                }

            }

        }
    }
}
