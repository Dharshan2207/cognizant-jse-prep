public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println(result);
        System.out.println("Multiplication > Addition");

        result = 50 - 10 / 5;
        System.out.println(result);
        System.out.println("Division > Subtraction");

        result = (50 - 10) / 5;
        System.out.println(result);
        System.out.println("Brackets > Division");

        result = 10 * 5 + 20 - 10 / 2;
        System.out.println(result);
        System.out.println("Division, Multiplication > Addition, Subtraction");


    }
}
