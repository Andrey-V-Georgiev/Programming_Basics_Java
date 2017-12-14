import java.util.Scanner;

public class _04_VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar = scanner.nextLine().charAt(0);
        String output = "";

        if (Character.isDigit(inputChar)) {
            output= "digit";
        } else {
            switch (inputChar) {
                case 'a':
                    output = "vowel";
                    break;
                case 'e':
                    output = "vowel";
                    break;
                case 'i':
                    output = "vowel";
                    break;
                case 'o':
                    output = "vowel";
                    break;
                case 'u':
                    output = "vowel";
                    break;
                default:
                    output= "other";
                    break;
            }
        }
        System.out.println(output);
    }
}
