//How to swap two number without using 3rd variable

import java.util.Scanner;
public class Question_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter two numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Before Swapping \n a = "+a+"\n b = "+b);
        a= a+b;
        b = a-b;
        a=a-b;

        System.out.print("After Swapping \n a = "+a+"\n b = "+b);





    }
}
