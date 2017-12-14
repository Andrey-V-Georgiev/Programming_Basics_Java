package _05_20_November_2016_Evening;

import java.util.Scanner;

/**
 * Created by Ordna on 15-Apr-17.
 */
public class _6_MaxCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S = Integer.parseInt(scanner.nextLine());
        int F = Integer.parseInt(scanner.nextLine());
        int MAX= Integer.parseInt(scanner.nextLine());
        int firstN =1;
        int secondN =1;
        int printCount = 0;
        for (int i = S; i <= F; i++) {

            for (int j = S; j <= F; j++) {

                if (printCount < MAX) {
                    System.out.print("<"+i+"-"+j+">");
                    printCount++;

                }

            }

        }
    }
}
