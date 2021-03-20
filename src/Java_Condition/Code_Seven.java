package Java_Condition;

import java.util.Scanner;

/***
 * @author Francisco Junior
 */

public class Code_Seven {
    public static void main(String[] args) {

        //Calling class "Scanner" for receiving data user input
        Scanner input = new Scanner(System.in);


        //Variables
        int numberOne;
        int numberTwo;
        int numberThree;

        //Receiving data user input
        System.out.println("Enter number one: ");
        numberOne = input.nextInt();

        System.out.println("Enter number two: ");
        numberTwo = input.nextInt();

        System.out.println("Enter number three: ");
        numberThree = input.nextInt();


        if(numberOne > numberTwo && numberOne > numberThree && numberTwo > numberThree){
            System.out.println("Number one is bigger " +numberOne);
            System.out.println("Smaller number is three " + numberThree);
        } else if (numberOne > numberTwo && numberOne > numberThree && numberThree > numberTwo){
            System.out.println("Number one is bigger " + numberOne);
            System.out.println("Smaller number is two " + numberTwo);
        } else if (numberTwo > numberThree && numberTwo > numberOne && numberThree > numberOne){
            System.out.println("Number Two is bigger " + numberTwo);
            System.out.println("Smaller number is one " + numberOne);
        } else if (numberTwo > numberThree && numberTwo > numberOne && numberOne > numberThree){
            System.out.println("Number Two is bigger " + numberTwo);
            System.out.println("Smaller number is three " + numberThree);
        } else if (numberThree > numberOne && numberThree > numberTwo && numberOne > numberTwo){
            System.out.println("Number Three is bigger " + numberThree);
            System.out.println("Smaller number is two " + numberTwo);
        } else if (numberThree > numberOne && numberThree > numberTwo && numberTwo > numberOne) {
            System.out.println("Number Three is bigger " + numberThree);
            System.out.println("Smaller number is two " + numberOne);
        }


    }
}
