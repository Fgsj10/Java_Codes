package Code_Beginner;

import java.util.Scanner;

public class Code_One {
    public static void main(String[] args) {

        //Using Class "Scanner" for received data of keyboard
        Scanner input = new Scanner(System.in);

        //Variables
        int numberOne = 0; //Initializing variable with value zero
        int numberTwo = 0;
        int numberThree = 0;
        double average;

        //Logical of resolution problem

        System.out.println("User, enter with number one: ");
        numberOne = input.nextInt();

        System.out.println("User, now enter with number two: ");
        numberTwo = input.nextInt();

        System.out.println("Ending, enter with number three: ");
        numberThree = input.nextInt();

        //Calculating average of numbers

        average = (numberOne + numberTwo + numberThree) / 3;
        System.out.println("Average of numbers is: " + average);


    }
}
