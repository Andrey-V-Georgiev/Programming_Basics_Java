package _08_28_August_2016;

import java.util.Scanner;

/**
 * Created on 22-Apr-17.
 */
public class _06_Digits {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int d1= (n/100)%10;
        int d2= (n/10)%10;
        int d3= (n)%10;
        int currNum= n;
        int currD1= (currNum/100)%10;
        int currD2= (currNum/10)%10;
        int currD3= (currNum)%10;

        int row=d1+d2;
        int column=d1+d3;

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
               if(currNum%5==0){
                   currNum=currNum-currD1;
               }else if(currNum%3==0){
                   currNum=currNum-currD2;
               }else{
                   currNum=currNum+currD3;
               }
                System.out.print(currNum+" ");
            }
            System.out.println();
        }


    }
}
