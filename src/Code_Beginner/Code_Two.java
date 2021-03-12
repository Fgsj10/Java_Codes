package Code_Beginner;

import java.util.Scanner;

/**
 * @author Francisco Junior
 */

public class Code_Two {
    public static void main(String[] args) {

        //Creating class "Scanner" for received data keyboard
        Scanner input = new Scanner(System.in);

        //Variables
        String nameSaler;
        double salary;
        double totalSale;
        double newSalary;

        //logical for resolution problem
        System.out.println("Enter with your name: ");
        nameSaler = input.next();

        System.out.println("Enter with salary: ");
        salary = input.nextDouble();

        System.out.println("Enter with total of sales in month: ");
        totalSale = input.nextDouble();

        //Calculating new salary with percent comission

        newSalary = (salary + (salary * 0.15)); //printing calculating final salary



        //Printing values

        System.out.println("Name: " + nameSaler);
        System.out.println("Salary: " + salary);
        System.out.println("total sales in month: " + totalSale);
        System.out.println("Salary with sales is: " + (salary + totalSale));
        System.out.println("Final salary is: " + newSalary);

    }
}
