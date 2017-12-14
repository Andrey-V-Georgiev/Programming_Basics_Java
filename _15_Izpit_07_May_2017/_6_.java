package _15_Izpit_07_May_2017;

import java.util.Scanner;

/**
 * Created on 05-May-17.
 */
public class _6_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int special = Integer.parseInt(scanner.nextLine());
        int control = Integer.parseInt(scanner.nextLine());


        for (int i = m; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                for (int k = l; k >= 1; k--) {

                    String curr = Integer.toString(i) + Integer.toString(j) + Integer.toString(k);
                    int curr2 = Integer.parseInt(curr);
                    int lastN = curr2 % 10;

                    if (curr2 % 3 == 0) {
                        special = special + 5;
                    } else if (lastN == 5) {
                        special = special - 2;
                    } else if (curr2 % 2 == 0) {
                        special = special * 2;
                    }
                    if (special >= control) {
                        System.out.printf("Yes! Control number was reached! Current special number is %d.", special);
                        return;
                    }

                }
            }
        }

        System.out.printf("No! %d is the last reached special number.",special);


    }
}
