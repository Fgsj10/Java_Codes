package Code_Beginner;

import java.util.Scanner;

/**
 * @author Francisco Junior
 */

public class Code_Five {
    public static void main(String[] args) {

        //Calling class "Scanner" with received input data user
        Scanner input = new Scanner(System.in);

        //variables
        int number;
        int numberMore;
        int numberPrevious;

        //Received input of user data
        System.out.println("Enter with of number: ");
        number = input.nextInt();

        //calculating operations logical math
        numberMore = number + 1;
        numberPrevious = number - 1;


        //Printing values
        System.out.println("Number: " + number);
        System.out.println("Number More: " + numberMore);
        System.out.println("Number Previous: " + numberPrevious);

    }
}
