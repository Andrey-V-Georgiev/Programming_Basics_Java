package _12_The_Fourth_Exercises;

import java.util.Scanner;

/**
 * Created on 30-Apr-17.
 */
public class Hospital_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int docs=7;
        int treated=0;
        int untreated=0;

        for (int i = 1; i <=n ; i++) {
            int curr= Integer.parseInt(scanner.nextLine());

            if(i%3==0){
                    if(treated<untreated){
                        docs++;
                    }
            }
            int diff1=docs-curr;
            int diff2=Math.abs(diff1);
            if(diff1<0){
                untreated=untreated+diff2;
                treated=treated+docs;
            }else{
                treated=treated+curr;
            }

        }
        System.out.printf("Treated patients: %d.%n",treated);
        System.out.printf("Untreated patients: %d.",untreated);

    }
}
