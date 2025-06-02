import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input : ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Given number is even");
        }
        else{
            System.out.println("Given number is Odd");
        }
    }
}
