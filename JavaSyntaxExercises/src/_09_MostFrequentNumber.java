import java.util.Arrays;
import java.util.Scanner;

public class _09_MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxCount = 0;
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
                if (counter > maxCount) {
                    maxCount = counter;
                    maxIndex = i;
                }
            }

        }
        System.out.println(arr[maxIndex]);
    }
}