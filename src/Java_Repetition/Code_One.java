package Java_Repetition;

import java.util.Scanner;

/***
 * @author Francisco Gomes
 *
 */

public class Code_One {
    public static void main(String[] args) {

        //Calling class "Scanner" for input data received user
        Scanner input = new Scanner(System.in);

        //Creating variables
        int note;

        //Received input data user
        System.out.println("Enter with note: ");
        note = input.nextInt();

        //Creating flow repetition for checkin value
        while (note < 0 || note > 10){
            System.out.println("Note invalid");
            System.out.println("Enter with a new note: ");
            note = input.nextInt();
        }

        //Printing value final

        System.out.println("A note final is: " +note);

    }
}
