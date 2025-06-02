import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year : ");
        year = sc.nextInt();

        if(year % 400 == 0){
            System.out.println("Leap year");
        }
        else if(year % 100 == 0){
            System.out.println("Not leap year");
        }
        else if(year % 4 == 0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }
    }
}
