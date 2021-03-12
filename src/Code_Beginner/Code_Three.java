package Code_Beginner;

import java.util.Scanner;

public class Code_Three {
    public static void main(String[] args) {
        //Using class "Scanner" for received data keyboard
        Scanner input = new Scanner(System.in);

        //Variables
        float numberOne;
        float numberTwo;

        //Operations Math
        float sum;
        float subtration;
        float multiplication;
        float division;

        //Logical for resolution for problem
        System.out.println("Enter with number one: ");
        numberOne = input.nextFloat();

        System.out.println("Enter with number two: ");
        numberTwo = input.nextFloat();

        //Calculating in operation Mathematical
        sum = (numberOne + numberTwo);
        subtration = (numberOne - numberTwo);
        multiplication = (numberOne * numberTwo);
        division = (numberOne / numberTwo);

        //Printing values of operation

        System.out.println("Sum of values is: " + sum);
        System.out.println("Subtration of values is: " + subtration);
        System.out.println("Multiplication of values is: " + multiplication);
        System.out.println("Division of value is: " + division);
    }
}
