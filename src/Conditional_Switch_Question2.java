import java.util.Scanner;

public class Conditional_Switch_Question2 {
    public static void main(String args[]){

        Scanner scan = new Scanner (System.in);

        System.out.print("Enter number 1: ");
        int a = scan.nextInt();

        System.out.print("Enter number 2 :");
        int b = scan.nextByte();


        System.out.println("\nPress 1 Addition");
        System.out.println("Press 2 Subtraction");
        System.out.println("Press 3 Multiply");
        System.out.println("Press 4 Division");
        System.out.println("Press 5 Modulo\n");

        System.out.print("Enter Operation : ");
        byte operator = scan.nextByte();

        switch (operator)
        {
            case 1:{

                System.out.println("Sum of a and b = " + (a+b));
                break;
            }
            case 2:{

                System.out.println("Subtraction of a and b = " + (a-b));
                break;
            }
            case 3:{

                System.out.println("Multiplication of a and b = " + (a*b));
                break;
            }
            case 4:{

                System.out.println("Division of a and b = " + (a/b));
                break;
            }
            case 5:{

                System.out.println("Modulo of a and b = " + (a%b));
            }
            default:{
                System.out.println("Invalid number");
            }
        }

    }
}
