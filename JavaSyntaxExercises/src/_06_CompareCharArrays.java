import java.util.Scanner;

public class _06_CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");
        int smallerLength = Math.min(first.length, second.length);
        for (int i = 0; i < smallerLength ; i++) {

            char firstChar = first[i].charAt(0);
            char secondChar = second[i].charAt(0);



            if(firstChar<secondChar){
                System.out.println(String.join("",first));
                System.out.println(String.join("",second));
                return;
            }
            else if(secondChar<firstChar){
                System.out.println(String.join("",second));
                System.out.println(String.join("",first));
                return;
            }
        }

        if(first.length <= second.length){
            System.out.println(String.join("",first));
            System.out.println(String.join("",second));
        }
        else if (first.length > second.length){
            System.out.println(String.join("",second));
            System.out.println(String.join("",first));

        }
    }
}
