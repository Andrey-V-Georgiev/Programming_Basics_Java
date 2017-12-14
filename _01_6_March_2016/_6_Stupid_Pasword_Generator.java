package _01_6_March_2016;

import java.util.Scanner;

/**
 * Created by Ordna on 13-Apr-17.
 */
public class _6_Stupid_Pasword_Generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        String p3Str = " ";
        String p4Str = " ";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= l; k++) {
                    switch (k) {
                        case 1:
                            p3Str = "a";
                            break;
                        case 2:
                            p3Str = "b";
                            break;
                        case 3:
                            p3Str = "c";
                            break;
                        case 4:
                            p3Str = "d";
                            break;
                        case 5:
                            p3Str = "e";
                            break;
                        case 6:
                            p3Str = "f";
                            break;
                        case 7:
                            p3Str = "g";
                            break;
                        case 8:
                            p3Str = "h";
                            break;
                        case 9:
                            p3Str = "i";
                            break;

                    }

                    for (int m = 1; m <= l; m++) {
                        switch (m) {
                            case 1:
                                p4Str = "a";
                                break;
                            case 2:
                                p4Str = "b";
                                break;
                            case 3:
                                p4Str = "c";
                                break;
                            case 4:
                                p4Str = "d";
                                break;
                            case 5:
                                p4Str = "e";
                                break;
                            case 6:
                                p4Str = "f";
                                break;
                            case 7:
                                p4Str = "g";
                                break;
                            case 8:
                                p4Str = "h";
                                break;
                            case 9:
                                p4Str = "i";
                                break;

                        }
                        int p5 = Math.max(i, j) + 1;
                        for (int o = p5; o <= n; o++) {
                            System.out.printf("%d%d%s%s%d ", i, j, p3Str, p4Str, o);

                        }

                    }
                }
            }
        }


    }
}
