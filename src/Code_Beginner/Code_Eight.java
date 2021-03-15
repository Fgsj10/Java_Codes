package Code_Beginner;

import java.util.Scanner;

public class Code_Eight {
    public static void main(String[] args) {

        //Calling class "Scanner" for received input data
        Scanner input = new Scanner(System.in);


        //Variables
        double valueHourLabour;
        int valueHourMonthTotal;
        double salaryBrute;

        //Logical resolution for received data input
        System.out.println("Input you value for hour labour: ");
        valueHourLabour = input.nextDouble();

        System.out.println("Input you hours total labour in month: ");
        valueHourMonthTotal = input.nextInt();

        //calculating you salary brute
        salaryBrute = (valueHourLabour * valueHourMonthTotal);


        //Printing value you salary brute

        System.out.println("You salary brute in month is: R$ "+salaryBrute+"");





    }
}
