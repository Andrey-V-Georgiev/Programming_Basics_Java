package _06_18_December_2016;

        import java.util.Scanner;

/**
 * Created by Ordna on 16-Apr-17.
 */
public class _6_LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char s=scanner.next().charAt(0);
        char f=scanner.next().charAt(0);
        char x=scanner.next().charAt(0);
        int counter=0;
        for (char i = s; i <=f; i++) {
            if(i==x){
                continue;
            }
            for (char j = s; j <=f; j++) {
                if(j==x){
                    continue;
                }
                for (char k = s; k <=f; k++) {
                    if(k==x){
                        continue;
                    }
                    counter++;

                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(k);
                    System.out.print(' ');
                }
            }
        }
        System.out.println(counter);
    }
}
