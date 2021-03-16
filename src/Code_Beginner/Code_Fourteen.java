package Code_Beginner;

import java.util.Scanner;

/***
 * @author Francisco Junior
 */

public class Code_Fourteen {
    public static void main(String[] args) {

        //Class "Scanner" for received input data user
        Scanner input = new Scanner(System.in);

        //Creating variables
        double hourLabourPrice = 0;
        int totalHourMonth = 0;

        //Operation with variables
        double salaryBrute;
        double discountIR;
        double discountInss;
        double discountSindicate;
        double salaryLiquid;

        //Receiving data user input
        System.out.println("Enter with value of labour hour: ");
        hourLabourPrice = input.nextDouble();

        System.out.println("Enter with total hours in month: ");
        totalHourMonth = input.nextInt();

        //Calculating values with operations

        salaryBrute = (hourLabourPrice * totalHourMonth);
        discountIR = (salaryBrute * 0.11);
        discountInss = (salaryBrute * 0.08);
        discountSindicate = (salaryBrute * 0.05);
        salaryLiquid = (salaryBrute - (discountInss + discountIR + discountSindicate));


        //Printing values of salary and discounts
        System.out.println("Salary Brute is: R$ "+salaryBrute);
        System.out.println("Discount IR is: R$ "+discountIR);
        System.out.println("Discount INSS is: R$ "+discountInss);
        System.out.println("Discount Sindicate is: R$ "+discountSindicate);
        System.out.println("Salary liquid is: "+salaryLiquid);



    }
}
