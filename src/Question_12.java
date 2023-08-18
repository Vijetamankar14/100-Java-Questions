//Nested if else clause

import java.net.Socket;
import java.util.Scanner;
public class Question_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int passmarks = 33;
        System.out.print("Enter the Marks you Obtain : ");
        int marksobt = scan.nextInt();
        if (marksobt>=33){
            System.out.println("You passed the exam");
            if (marksobt>=75){
                System.out.println("Pass with GARADE A");

            }
            else if(marksobt>=50){
                System.out.println("Passed with GRADE B");
            }

        }
        else {
            System.out.println("You Failed");
        }

    }
}
