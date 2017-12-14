package JavaSyntax;

public class _01_CalculateExpression {
    public static void main(String[] args) {
        double expression = ((30 + 21) * 1.0/2 * (35 - 12 - 1.0/2));
        double result = Math.pow(expression,2.0);
        System.out.println(result);
    }
}
