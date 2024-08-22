//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Exercise1_Functions {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int average = averageOfNumber(a,b,c);
        System.out.print("The average of three num is : " +average );
    }
    public static int averageOfNumber(int a , int b , int c){
        int average;
        average = (a+b+c)/3;
        return average ;
    }
}
