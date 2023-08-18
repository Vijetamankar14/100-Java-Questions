//How to check Odd and Even Number in java

import java.util.Scanner;
import java.util.SortedMap;

public class Question_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check weather the number is even or odd :  ");
        int inputNumb = scan.nextInt();
        if (inputNumb%2==0){
            System.out.println("Number is even");
        }

        else {
            System.out.println("Number is odd");
        }
    }
}
