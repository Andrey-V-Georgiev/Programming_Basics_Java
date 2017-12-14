import java.util.Scanner;

public class _02_BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        switch(input){
            case "True":
                System.out.println("Yes");
                break;
            case "False":
                System.out.println("No");
                break;
                default:
                    System.out.println();
                    break;

        }

    }
}
