package Java_Condition;

import java.util.Scanner;

/***
 * @author Francisco Gomes
 */

public class Code_Two {
    public static void main(String[] args) {

        //Calling class "Scanner" for received input data
        Scanner input = new Scanner(System.in);

        //Creating variables
        int number;

        //Receiving value of input
        System.out.println("Enter with value: ");
        number = input.nextInt();

        //Checking value
        if(number > 0){
            System.out.println("Number positive " + number);
        } else {
            System.out.println("Number negative " + number);
        }

    }
}
