import java.util.ArrayList;
import java.util.Scanner;

public class _10_IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine().toLowerCase();
        ArrayList<Character> arr = new ArrayList<Character>();

        for (char i = 'a'; i <= 'z'; i++) {
            arr.add(i);
        }

        for (int i = 0; i < a.length(); i++) {
           char currChar = a.charAt(i);
           int index = arr.indexOf(currChar);
            System.out.printf("%c -> %d%n",currChar,index);
        }
    }
}
