package JavaSyntax;

import java.util.Scanner;
import java.util.TreeMap;

public class _07_SumByTown {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Double> sumByTown = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\|");
            String town = tokens[0].trim();
            double income = Double.parseDouble(tokens[1].trim());
            if(sumByTown.containsKey(town)){
                sumByTown.put(town, sumByTown.get(town) + income);
            }
            else{
                sumByTown.put(town, income);
            }
        }

        for(String key : sumByTown.keySet()){
            System.out.println(key + " -> " + sumByTown.get(key));
        }
    }
}
