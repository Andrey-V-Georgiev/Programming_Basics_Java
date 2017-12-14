import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _03_ReverseCharacters {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            arr.add(scanner.nextLine());
        }

        Collections.reverse(arr);
        System.out.println(String.join("",arr));
    }
}
