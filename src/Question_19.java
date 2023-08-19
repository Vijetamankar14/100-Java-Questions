//While loop Program in java

import java.util.Scanner;
public class Question_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1;
        System.out.print("Enter the number : ");
        int inputnum = scan.nextInt();
        while (i !=inputnum){
            System.out.println(i);
            i++;

        }
    }
}
