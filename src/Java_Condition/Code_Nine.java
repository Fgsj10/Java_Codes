package Java_Condition;

import java.util.Scanner;

/***
 * @author Francisco Junior
 */

public class Code_Nine {
    public static void main(String[] args) {

        //Calling class "Scanner" for received input data user
        Scanner input = new Scanner(System.in);

        //Creating variables
        double salary;
        double valueReadjust;
        double newSalary;


        //Logical received data user
        System.out.println("Enter with you salary: ");
        salary = input.nextDouble();

        //operation for new salary
        if (salary <= 280){
            valueReadjust = salary * 0.20;
            newSalary = (salary + valueReadjust);
            System.out.println("Value of readjust is: " + valueReadjust);
            System.out.println("New salary is: " + newSalary);
        } else if (salary > 280 && salary <= 700){
            valueReadjust = salary * 0.15;
            newSalary = (salary + valueReadjust);
            System.out.println("Value of readjust is: " + valueReadjust);
            System.out.println("New salary is: " + newSalary);
        } else if (salary > 700 && salary <= 1500){
            valueReadjust = salary * 0.10;
            newSalary = (salary + valueReadjust);
            System.out.println("Value of readjust is: " + valueReadjust);
            System.out.println("New salary is: " + newSalary);
        } else if (salary > 1500){
            valueReadjust = salary * 0.05;
            newSalary = salary + valueReadjust;
            System.out.println("Value of readjust is: " + valueReadjust);
            System.out.println("New salary is: " + newSalary);
        }

    }
}
