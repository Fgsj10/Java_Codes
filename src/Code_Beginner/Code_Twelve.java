package Code_Beginner;

import java.util.Scanner;

/***
 * @author Francisco Junior
 */


public class Code_Twelve {
    public static void main(String[] args) {
        //Calling class "Scanner" for received input user data
        Scanner input = new Scanner(System.in);

        //Creating variables
        double heightPeople;
        double weightIdealMan;
        double weightIdealWomen;

        //Receiving data user input
        System.out.println("Enter with value Height: ");
        heightPeople = input.nextDouble();

        //Calculating weight ideal for man and Women
        weightIdealMan = (72.7 * heightPeople) - 58;
        weightIdealWomen = (62.1*heightPeople) - 44.7;

        //Printing values of weight for man and women
        System.out.println("Weight ideal for man is: "+weightIdealMan + " kg ");
        System.out.println("Weight ideal for Women is: "+weightIdealWomen + " kg ");

    }
}
