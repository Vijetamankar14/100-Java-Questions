//Find largest no in java Program

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a= scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a>b && a>c){
            System.out.println("A is largest");
        }
        else if (b>a && b>c) {
            System.out.println("B is largest");
        }
        else if(c>a && c>b){
            System.out.println("C is largest");
        }
        else {
            System.out.println("Numbers are not distinct");
        }
    }
}
