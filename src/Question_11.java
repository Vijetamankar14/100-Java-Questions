//if Else Clause
import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int passingMarks = 40;
        System.out.print("Enter the marks obtained : ");
        int obtMarks = scan.nextInt();

        if (obtMarks>=passingMarks){
            System.out.println("You pass the internal exam");
        }
        else if (obtMarks<passingMarks){
            System.out.println("Unfortunately, You fail the exam");
        }
    }
}
