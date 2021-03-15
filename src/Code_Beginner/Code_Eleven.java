package Code_Beginner;

import java.util.Scanner;

/***
 * @author Francisco Junior
 */

public class Code_Eleven {
    public static void main(String[] args) {

        //Calling class "Scanner" for input received data user
        Scanner input = new Scanner(System.in);


        //Variables
        double height;
        double weightIdeal;

        //Received input of data
        System.out.println("Enter with value height: ");
        height = input.nextDouble();

        //Operation of Weight ideal for people
        weightIdeal = (72.7 * height) - 58;

        //Printing value of Weight Ideal
        System.out.println("You Weight ideal is: "+weightIdeal+" kg ");


    }
}
