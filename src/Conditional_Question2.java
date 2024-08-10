
import java.util.*;
public class Conditional_Question2 {
    public static void main(String args[]){

        Scanner scan = new Scanner (System.in);

        System.out.print("Enter number 1 : ");
        int a = scan.nextInt();

        System.out.print("Enter number 2 : ");
        int b = scan.nextInt();

        if (a==b){
            System.out.println("Equal");
        } else if (a>b) {
            System.out.println("A is greater");
        } else if (a<b) {
            System.out.println("B is greater");
        }

    }}
