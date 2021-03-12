package Code_Beginner;

import java.util.Scanner;

/**
 * @author Francisco junior
 */
public class Code_Four {
    public static void main(String[] args) {
        //Creating class "Scanner" for received data of user
        Scanner input = new Scanner(System.in);

        //Variables
        int years;
        int months;
        int days = 0;
        int totalYears;
        int totalDaysAndMonth;
        int daysFinal;


        //Logical for resolution problem
        System.out.println("Enter with Years: ");
        years = input.nextInt();

        System.out.println("Enter with months: ");
        months = input.nextInt();

        System.out.println("Enter with days: ");
        days = input.nextInt();

        //calculating operation
        totalYears = (years * 365);
        totalDaysAndMonth = (months * 30);

        //Printing values

        daysFinal = (totalDaysAndMonth + totalYears + days);

        System.out.println("Total days is: " + daysFinal);


    }
}
