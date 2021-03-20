package Java_Condition;

import java.util.Scanner;

/***
 * @author Francisco Junior
 */

public class Code_Six {
    public static void main(String[] args) {

        //Calling class "Scanner" for received input data user
        Scanner input = new Scanner(System.in); //Creating object type Scanner

        //Variables
        int numberOne;
        int numberTwo;
        int numberThree;

        //Creating logical for received input
        System.out.println("Enter with Number One: ");
        numberOne = input.nextInt();

        System.out.println("Enter with number two: ");
        numberTwo = input.nextInt();

        System.out.println("Enter with number Three: ");
        numberThree = input.nextInt();

        //Checking what bigger number
        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("Number one is bigger");
            System.out.println("Bigger number is: " + numberOne);
        } else if (numberTwo > numberThree && numberTwo > numberOne) {
            System.out.println("Number Two is bigger");
            System.out.println("Number is: " + numberTwo);
        } else if (numberThree > numberOne && numberThree > numberTwo) {
            System.out.println("Number three is bigger");
            System.out.println("number is: " + numberThree);
        }


    }
}
