package _14_The_Sixth_Exercises;

import java.util.Scanner;

/**
 * Created on 05-May-17.
 */
public class MagicNumbers_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                for (int k = 1; k <=n ; k++) {
                    for (int l = 1; l <=n ; l++) {
                        for (int m = 1; m <=n ; m++) {
                            for (int o = 1; o <=n ; o++) {
                                int nS=i*j*k*l*m*o;
                                if(nS==n){
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
