package Java_Condition;

import java.util.Scanner;

/***
 * @author Francisco Junior
 */

public class Code_One {
    public static void main(String[] args) {

        //Class "Scanner" for input received data user
        Scanner input = new Scanner(System.in);

        //Creating variables
        int numberOne;
        int numberTwo;
        int numberBigger = 0;

        //Receiving values of variables
        System.out.println("Enter with value of number one: ");
        numberOne = input.nextInt();

        System.out.println("Value Two: ");
        numberTwo = input.nextInt();

        //Creating condition for bigger number
        if(numberOne > numberBigger){
            numberBigger = numberOne;
            System.out.println("Bigger number is number One: "+numberBigger);
        } else if (numberTwo > numberBigger) {
            numberBigger = numberTwo;
            System.out.println("Bigger number is number Two: "+numberTwo);
        }




    }
}
