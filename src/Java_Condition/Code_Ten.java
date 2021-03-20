package Java_Condition;

import java.util.Scanner;

/***
 * @author Francisco Junior
 */

public class Code_Ten {
    public static void main(String[] args) {

        //Calling class "Scanner" for received input data user
        Scanner input = new Scanner(System.in);

        //Creating variables
        double hourLabour;
        double hoursMonth;
        double salaryBrute;
        double IR;
        double FGTS;
        double INSS;
        double discounts;
        double salaryLiquid;

        //Logical user of input received data
        System.out.println("Enter you value of hour labour: ");
        hourLabour = input.nextDouble();

        System.out.println("Enter you hours worked in month: ");
        hoursMonth = input.nextDouble();

        //Calculating your salary brute
        salaryBrute = (hourLabour * hoursMonth);
        System.out.println("You salary brute is: R$ " + salaryBrute);

        //Calculating deposit in count bank
        FGTS = (salaryBrute * 0.11);
        System.out.println("You received value deposit is of FGTS: R$ " +FGTS);

        //Calculating discounts under salary brute
        IR = (salaryBrute * 0.05);
        INSS = (salaryBrute * 0.10);
        discounts = (IR + INSS);

        //Printing values final
        System.out.println("Discount of IR is: R$ "+IR);
        System.out.println("Discount of INSS is: R$ "+INSS);
        System.out.println("Total discounts is: R$ "+discounts);
        System.out.println("************************************");
        salaryLiquid = (salaryBrute + FGTS - (discounts));
        System.out.println("Your salary liquid is: R$ "+salaryLiquid);



    }
}
