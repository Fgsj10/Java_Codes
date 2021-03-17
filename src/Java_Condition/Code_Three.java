package Java_Condition;

import java.util.Scanner;

/***
 * @author Francisco Gomes
 */

public class Code_Three {
    public static void main(String[] args) {

        //Calling class "Scanner" for receiving input data
        Scanner input = new Scanner(System.in);

        //variables
        String letter;
        String letterConverting;

        //Receiving value input
        System.out.println("Enter with value of letter: ");
        letter = input.next();

        //Converting letter for maiuscule
        letterConverting = letter.toLowerCase();


        //Checking value received
        if(letterConverting.equals("f")){
            System.out.println("Female");
        } else if(letterConverting.equals("m")) {
            System.out.println("Male");
        } else {
            System.out.println("Gender invalid");
        }


    }
}
