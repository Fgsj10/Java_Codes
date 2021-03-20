package Java_Condition;

import java.util.Scanner;

public class Code_Four {
    public static void main(String[] args) {

        //Calling class "Scanner" for received input data
        Scanner input = new Scanner(System.in);


        //Variables
        String letter;
        String letterConverter;

        //Received datas inputs logical user
        System.out.println("Enter with letter: ");
        letter = input.next();

        //Converting letter for lower
        letterConverter = letter.toLowerCase(); //Converting letter for minuscule

        //Checking value of letter

        if (letterConverter.equals("a") || letterConverter.equals("e") || letterConverter.equals("i") || letterConverter.equals("o") || letterConverter.equals("u")) {
            System.out.println("A letter is vogal " + letterConverter);
        } else {
            System.out.println("A letter is consonant "+letterConverter);
        }


    }
}
