//Print Reverse number in java program

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int inputNum = scan.nextInt();
        int i=0;

        while (inputNum!=i){
            System.out.println(inputNum);
            inputNum--;
        }
        System.out.println("End of Loop");
    }
}
