import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b;
        float result = 0.0f;
        char operator;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();

        System.out.print("Enter Operator (+, -, *, /) : ");
        operator = sc.next().charAt(0);

        if(operator == '+'){
            result = a + b;
            System.out.println("Result : " + result);
        }
        else if(operator == '-'){
            result = a - b;
            System.out.println("Result : " + result);
        }
        else if(operator == '*'){
            result = a * b;
            System.out.println("Result : " + result);
        }
        else if(operator == '/'){
            result = (float) a / b;
            System.out.println("Result : " + result);

        }
        else{
            System.out.println("Invalid Input");
        }

    }
}
