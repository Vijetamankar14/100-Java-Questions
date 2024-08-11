// Print all even numbers till n
import java.util.*;
public class Loops_Question4 {
    public static void main(String  args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any num : ");
        int num = scan.nextInt();

        for(int i =1; i<=num; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
