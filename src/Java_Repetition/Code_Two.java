package Java_Repetition;

import java.util.Scanner;

/***
 * @author Francisco Gomes
 */

public class Code_Two {
    public static void main(String[] args) {

        //Calling class "Scanner" for received input data user
        Scanner input = new Scanner(System.in);

        //Creating variables
        String name;
        String password;

        //Received data input user
        System.out.println("Enter with you name: ");
        name = input.next();

        System.out.println("Enter with you password: ");
        password = input.next();

        //Checking value with flow repetition
        while (name.equals(password)) {
            System.out.println("Name and password not equals");
            System.out.println("Enter please you name again : ");
            name = input.next();
            System.out.println("Your password again: ");
            password = input.next();
        }

        //Printing values final
        System.out.println("Your name is: " + name);
        System.out.println("Your password is: " + password);


    }
}
