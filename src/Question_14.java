//Find factorial for given no Program in Java

import java.util.Scanner;
import java.math.BigInteger;
public class Question_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,c;
        BigInteger fact = new BigInteger("1");
        BigInteger inc = new BigInteger("1");
        System.out.print("Enter the number whose factorial is to find : ");
        int inputNumb = scan.nextInt();
        if (inputNumb < 0) {

            System.out.println("The number is negative");
        }
        else {
            for (  i=1; i <= inputNumb; i++) {
                fact = fact.multiply(inc);
                inc = inc.add(BigInteger.ONE);

            }
            System.out.println("The factorial is : " + fact);
        }
    }
}
