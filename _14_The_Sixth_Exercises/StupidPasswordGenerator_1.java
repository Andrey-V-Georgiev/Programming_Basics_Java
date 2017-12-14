package _14_The_Sixth_Exercises;

import java.util.Scanner;

/**
 * Created on 04-May-17.
 */
public class StupidPasswordGenerator_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        int p1 = 1;
        int p2 = 1;
        int p3=1;
        int p4=1;
        String s3 = "";
        String s4 = "";
        int p5=1;


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=n; j++) {

                for (int k = 1; k <=l; k++) {

                    switch (k){
                        case 1: s3="a";break;
                        case 2: s3="b";break;
                        case 3: s3="c";break;
                        case 4: s3="d";break;
                        case 5: s3="e";break;
                        case 6: s3="f";break;
                        case 7: s3="g";break;
                        case 8: s3="h";break;
                        case 9: s3="i";break;
                    }

                    for (int m = 1; m <=l; m++) {

                        switch (m){
                            case 1: s4="a";break;
                            case 2: s4="b";break;
                            case 3: s4="c";break;
                            case 4: s4="d";break;
                            case 5: s4="e";break;
                            case 6: s4="f";break;
                            case 7: s4="g";break;
                            case 8: s4="h";break;
                            case 9: s4="i";break;
                        }

                        int diff=i-j;
                        if(diff<0){
                            p5=j+1;
                        }else{
                            p5=i+1;
                        }


                        //p5=Math.max(i,j)+1;

                        for (int o = p5; o <=n; o++) {


                                System.out.printf("%d%d%s%s%d ", i, j, s3, s4, o);


                        }
                    }
                }
            }
        }
    }
}
