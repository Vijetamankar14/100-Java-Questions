//Print the table of the number input by user
import java.util.*;
public class Loops_Question3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int num = scan.nextInt();

        for(int i =1; i<=10; i++){
            System.out.println(num +" * " + i + " = " + num*i);
        }
    }
}

