package Java_Condition;

import java.util.Scanner;

public class Code_Eight {
    public static void main(String[] args) {

        //Calling class "Scanner" for input received data user
        Scanner input = new Scanner(System.in); //Creating object of type Scanner

        //Variables
        String shift;
        String converterLetter;

        //Logical for receiving input data
        System.out.println("You shift study: ");
        shift = input.next();

        //converting letter
        converterLetter = shift.toLowerCase();

        //Checking value of shift
        if(converterLetter.equals("m")){
            System.out.println("Morning");
        } else if (converterLetter.equals("a")){
            System.out.println("Afternom");
        } else if (converterLetter.equals("n")){
            System.out.println("Night");
        } else {
            System.out.println("Shift invalid");
        }



    }
}
