//How to compare 2 string in Java program

import java.util.Scanner;
public class Question_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String str1 = scan.nextLine();
        System.out.print("Enter the second String : ");
        String str2 = scan.nextLine();

        if (str1.compareTo(str2)>0){
            System.out.println("String 1 is greater ");

        } else if (str1.compareTo(str2)<0) {
            System.out.println("String 2 is greater");

        }
        else {
            System.out.println("Both are equal");
        }
    }
}
