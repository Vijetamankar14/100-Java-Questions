//Qs. Print if a number is prime or not (Input n from the user).
import java.util.*;
public class Loops_Question7 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int num = scan.nextInt();

        for (int i =1; i<=num; i++){
            if (i%2!=0 && i%3!=0){
                System.out.println(i);
            }
        }
    }
}
/*import java.util.*;

public class Solutions {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();


       boolean isPrime = true;
       for(int i=2; i<=n/2; i++) {
           if(n % i == 0) {
               isPrime = false;
               break;
           }
       }


       if(isPrime) {
           if(n == 1) {
               System.out.println("This is neither prime not composite");
           } else {
               System.out.println("This is a prime number");
           }
       } else {
           System.out.println("This is not a prime number");
       }
   }
}
*/