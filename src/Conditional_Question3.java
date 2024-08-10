import java.util.Scanner;

public class Conditional_Question3 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any Number Between 1 to 3 : ");
        byte a = scan.nextByte();

        if (a == 1) {
            System.out.println("Hello");

        } else if (a == 2) {
            System.out.println("Namaste");

        } else {
            System.out.println("Bonjour");
        }
    }
}
