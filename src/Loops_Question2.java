// Print the sum of first n natural number

import java.util.*;

public class Loops_Question2 {
    public static void main(String args[]) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int num = scan.nextInt();

        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is : " + sum);
    }
}
