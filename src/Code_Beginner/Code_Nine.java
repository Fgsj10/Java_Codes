package Code_Beginner;

import java.util.Scanner;

public class Code_Nine {
    public static void main(String[] args) {

        //Calling class "Scanner" for received input data
        Scanner input = new Scanner(System.in);

        //Variables
        float temperatureFarenheit;
        float converterTemperature;

        //Received datas input
        System.out.println("Enter with temperature in farenheit: ");
        temperatureFarenheit = input.nextFloat();

        //Calculating converting value of temperature
        converterTemperature = 5 * ((temperatureFarenheit - 32)/  9);

        //Printing value converted temperature
        System.out.println("Temperature converted farenheit for Celsius is: " + converterTemperature+" Cº ");
    }
}
