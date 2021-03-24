package Java_Repetition;

import java.util.Scanner;

/***
 * @author Francisco Junior
 */

public class Code_Four {
    public static void main(String[] args) {
        //Calling class "Scanner" data input received user;
        Scanner input = new Scanner(System.in);

        //Creating variables
        double popA = 80000;
        double taxPopA = 1.03;
        //------------------------------
        double popB = 200000;
        double taxPopB = 1.015;

        int agePop = 0;

        //Creating logical while for resolution
        while (popA <= popB){
            popA = (popA * taxPopA);
            popB = (popB * taxPopB);
            agePop += 1;
            System.out.println("Age " + agePop);
        }

    }
}
