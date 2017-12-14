import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _11_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr= Arrays.stream(
                scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < arr.length; i++) {
            int leftSum=0;
            int rightSum=0;

            for (int j = 0; j < i; j++) {
                leftSum+=arr[j];
            }
            for (int j = i+1; j < arr.length ; j++) {
                rightSum+=arr[j];
            }
            if(leftSum==rightSum){
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}
