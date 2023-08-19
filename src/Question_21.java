//While loop using break Program in java

import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the  number :");
       int inputnumb = scan.nextInt();

       while (true){
           System.out.println(inputnumb);
           inputnumb--;
           if (inputnumb==5){
               break;
           }
       }

    }
}
