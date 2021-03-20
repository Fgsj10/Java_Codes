package Java_Condition;

import java.util.Scanner;

public class Code_Five {
    public static void main(String[] args) {

        //Calling class "Scanner" for received input data user
        Scanner input = new Scanner(System.in);

        //Variables
        double noteOne;
        double noteTwo;
        double average;


        //Inputing values logical for user
        System.out.println("Enter with first note: ");
        noteOne = input.nextDouble();

        System.out.println("Enter with second note: ");
        noteTwo = input.nextDouble();

        //Calculating average of notes
        average = (noteOne + noteTwo) / 2;

        //checking values of average
        if(average == 10.0){
            System.out.println("Approved with distinction");
        } else if (average >= 7.0 && average <= 9.9){
            System.out.println("Approved, your average is: " +average);
        } else if (average < 7.0){
            System.out.println("Repproved, your average is: " +average);
        } else if (average > 10.0){
            System.out.println("Average invalid");
        } else if (average < 0){
            System.out.println("Average invalid");
        }

    }
}
