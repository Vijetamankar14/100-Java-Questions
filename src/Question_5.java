// How to convert Fahrenheit to Celsius

import java.util.Scanner;
public class Question_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit : ");
        int inputTemp = scan.nextInt();

        float temp = ((inputTemp-32)*5)/9;
        System.out.println("The temperature in Celsius is : "+temp+"°C");


    }
}
