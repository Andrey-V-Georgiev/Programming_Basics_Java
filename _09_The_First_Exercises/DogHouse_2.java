package _09_The_First_Exercises;

        import java.util.Scanner;

/**
 * Created on 24-Apr-17.
 */
public class DogHouse_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = Double.parseDouble(scanner.nextLine());
        double B= Double.parseDouble(scanner.nextLine());

        double sides=A*A;
        double roof=A*A;
        double triangle=((B-(A/2))*A/2)/2;
        double back=triangle+(A/2)*(A/2);
        double front=triangle+((A/2)*(A/2)-((A/5)*(A/5)));

        double red=roof/5;
        double green=(back+front+sides)/3;
        System.out.printf("%.2f%n",green);
        System.out.printf("%.2f%n",red);


    }
}
