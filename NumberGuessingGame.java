import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int num;
        int target = 55;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Guess number : ");
            num = sc.nextInt();
            if(num == target){
                System.out.println("You won");
                break;
            }
            else if(num > target){
                int diff = (num - target);
                if(diff > 25){
                    System.out.println("You entered too high");
                }
                else{
                    System.out.println("You entered high");
                }
            }
            else if(target > num){
                int diff = target - num;
                if(diff > 25){
                    System.out.println("You entered too low");
                }
                else{
                    System.out.println("You entered low");
                }
            }
        }
    }
}
