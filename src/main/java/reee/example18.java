package reee;

import java.util.Scanner;

public class example18 {
    public static void main(String[] args){
        double c, f;
        Scanner input = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert Celsius to Fahrenheit.\nYour choice: ");
        String choice = input.nextLine();
        if(choice.equals("F"))
        {
            System.out.print("Please enter the temperature in Celsius: ");
            c = input.nextDouble();
            f = (c * 9/5) + 32;
            System.out.println("The temperature in Fahrenheit is "+f+".");
        }
        else
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            f = input.nextDouble();
            c = (f-32) * (5/9);
            System.out.println("The temperature in Celsius is "+c+".");
        }

    }
}
