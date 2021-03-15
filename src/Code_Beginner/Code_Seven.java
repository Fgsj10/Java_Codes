package Code_Beginner;

import java.util.Scanner;

public class Code_Seven {
    public static void main(String[] args) {

        //Calling class "Scanner" for received input data
        Scanner input = new Scanner(System.in);

        //Variables
        double raid;
        double areaCircle;
        double pi = 3.14;


        //Logical for received input data
        System.out.println("Input value of raid Circle: ");
        raid = input.nextDouble();

        //Calculating area of circle
        //Importing class "Math" for operation Mathematicals
        areaCircle = pi * (Math.pow(raid,2));

        //Printing value area of circle

        System.out.println("Value of area circle: "+areaCircle+" m² ");

    }
}
