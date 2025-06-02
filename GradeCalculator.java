import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        int mark;
        char grade;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks out of 100 : ");
        mark = sc.nextInt();

        if(mark >= 90 && mark <= 100){
            grade = 'A';
            System.out.println(grade);
        }
        else if(mark >= 80 && mark <= 89){
            grade = 'B';
            System.out.println(grade);
        }
        else if(mark >= 70 && mark <= 79){
            grade = 'C';
            System.out.println(grade);
        }
        else if(mark >= 60 && mark <= 69){
            grade = 'D';
            System.out.println(grade);
        }
        else if(mark < 60){
            grade = 'F';
            System.out.println(grade);
        }
        else{
            System.out.println("Enter marks from 0 to 100");
        }
    }
}
