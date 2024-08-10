import java.util.Scanner;

public class Conditional_Switch {
    public static void main(String args[]){

        System.out.print("Enter any number b/w 1 to 3 : ");
        Scanner scan = new Scanner(System.in);
        int button= scan.nextInt();

        switch (button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Welcome...");
        }
    }
}
