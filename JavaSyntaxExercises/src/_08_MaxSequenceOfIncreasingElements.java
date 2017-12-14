import java.util.Arrays;
import java.util.Scanner;

public class _08_MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays
                .stream (scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int currIndex=0;
        int currLength=1;
        int maxIndex=0;
        int maxLength=1;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                currLength++;
                if(currLength>maxLength){
                    maxIndex=currIndex;
                    maxLength=currLength;
                }

            }
            else{
                currLength=1;
                currIndex=i+1;
            }
        }
        for (int i = maxIndex; i < maxIndex+maxLength ; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
