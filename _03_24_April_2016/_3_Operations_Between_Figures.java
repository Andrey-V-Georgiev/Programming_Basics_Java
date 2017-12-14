package _03_24_April_2016;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Ordna on 13-Apr-17.
 */
public class _3_Operations_Between_Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df1 = new DecimalFormat("#");
        DecimalFormat df2 = new DecimalFormat("#.##");

        double n1 = Double.parseDouble(scanner.nextLine());;
        double n2 = Double.parseDouble(scanner.nextLine());;
        String symbol = scanner.nextLine();
        double resultValue = 0;

        if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*")) {
            switch (symbol) {
                case "+":
                    resultValue = n1 + n2;
                    break;
                case "-":
                    resultValue = n1 - n2;
                    break;
                case "*":
                    resultValue = n1 * n2;
                    break;
            }
            if(resultValue%2==0){
                System.out.print(df1.format(n1)+" "+symbol+" "+df1.format(n2)+" "+"="+" "+df1.format(resultValue)+" "+"- even");
            }else{
                System.out.print(df1.format(n1)+" "+symbol+" "+df1.format(n2)+" "+"="+" "+df1.format(resultValue)+" "+"- odd");
            }

        } else if (symbol.equals("/") || symbol.equals("%")) {
            switch (symbol) {
                case "/":
                    resultValue = n1 / n2;
                    break;

                case "%":
                    resultValue = n1 % n2;
                    break;
            }
            if(n2==0){
                System.out.print("Cannot divide "+df2.format(n1)+" by zero");
            }else{
                System.out.print(df2.format(n1)+" "+symbol+" "+df2.format(n2)+" "+"="+" "+df2.format(resultValue));
            }
        }


    }


}


