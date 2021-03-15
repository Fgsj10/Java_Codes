package Code_Beginner;

import java.util.Scanner;

/***
 * @author Francisco junior
 */

public class Code_Ten {
    public static void main(String[] args) {
        //Calling class "Scanner" for received input data user

        Scanner input = new Scanner(System.in);

        //variables
        int numberOne;
        int numberTwo;
        float numberThree;

        //Operations with numbers
        float operationOne;
        float operationTwo;
        float operationThree;

        //Received data input of user
        System.out.println("Enter with number one: ");
        numberOne = input.nextInt();

        System.out.println("Enter with number Two: ");
        numberTwo = input.nextInt();

        System.out.println("Enter with number Three: ");
        numberThree = input.nextFloat();

        //Calculating operations with numbers

        operationOne = (numberOne * 2) * (numberTwo / 2);
        operationTwo = (numberOne * 3) + (numberThree);
        operationThree = (float) Math.pow(numberThree,3);

        //Printing values of operations
        System.out.println("Operation One Value result is: "+operationOne);
        System.out.println("Operation Two Value result is: "+operationTwo);
        System.out.println("Operation Three value result is: "+operationThree);

    }
}
