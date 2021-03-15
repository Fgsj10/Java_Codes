package Code_Beginner;

import java.util.Scanner;

public class Code_Six {
    public static void main(String[] args) {

        //Calling class "Scanner" for capture and received input data
        Scanner input = new Scanner(System.in);

        //Variables
        double numberMeters;
        double converter;

        //Inputing datas of user
        System.out.println("Enter with value of meters: ");
        numberMeters = input.nextDouble();

        //Calculating converting values
        converter = numberMeters * 100;

        //Printing values
        System.out.println("Value converted meters in centimeters is: " + converter + " cm ");


    }
}
