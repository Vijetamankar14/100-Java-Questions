//How to get input using Scanner

import java.util.Scanner;
public class Question_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Number");
        int a = scan.nextInt();
        System.out.println("The number you entered is : " +a);
        System.out.println();

        System.out.println("Enter any String");
        String str = scan.next();
        System.out.println("The String you entered is : " +str);
        System.out.println();

        System.out.println("Enter any double Number");
        float b = scan.nextFloat();
        System.out.println("The double number you entered is : " +b);
        System.out.println();
    }
}
