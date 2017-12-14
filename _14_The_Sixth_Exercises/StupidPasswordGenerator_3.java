package _14_The_Sixth_Exercises;

import java.util.Scanner;

/**
 * Created on 06-May-17.
 */
public class StupidPasswordGenerator_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        String s1 = "";
        String s2 = "";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= l; k++) {
                    switch (k) {
                        case 1:
                            s1 = "a";
                            break;
                        case 2:
                            s1 = "b";
                            break;
                        case 3:
                            s1 = "c";
                            break;
                        case 4:
                            s1 = "d";
                            break;
                        case 5:
                            s1 = "e";
                            break;
                        case 6:
                            s1 = "f";
                            break;
                        case 7:
                            s1 = "g";
                            break;
                        case 8:
                            s1 = "h";
                            break;
                        case 9:
                            s1 = "i";
                            break;
                    }
                    for (int m = 1; m <= l; m++) {
                        switch (m) {
                            case 1:
                                s2 = "a";
                                break;
                            case 2:
                                s2 = "b";
                                break;
                            case 3:
                                s2 = "c";
                                break;
                            case 4:
                                s2 = "d";
                                break;
                            case 5:
                                s2 = "e";
                                break;
                            case 6:
                                s2 = "f";
                                break;
                            case 7:
                                s2 = "g";
                                break;
                            case 8:
                                s2 = "h";
                                break;
                            case 9:
                                s2 = "i";
                                break;
                        }
                        int p5 = Math.max(i, j) + 1;
                        for (int o = p5; o <= n; o++) {

                           //System.out.print(i);
                           //System.out.print(j);
                           //System.out.print(s1);
                           //System.out.print(s2);
                           //System.out.print(o);

                            System.out.printf("%d%d%s%s%d ",i,j,s1,s2,o);
                        }
                    }
                }
            }
        }


    }
}
