package Code_Beginner;

import java.util.Scanner;

/***
 * @author Francisco Junior
 */

public class Code_Thirteen {
    public static void main(String[] args) {
        //Calling class "Scanner" for input received data

        Scanner input = new Scanner(System.in);

        //Creating variables
        double weightFish;
        double excessWeight = 0;
        double taxWeightExcess = 0;


        //Received values of input user
        System.out.println("User, enter with weight fish: ");
        weightFish = input.nextDouble();

        //Calculating Weight excess with conditional
        if(weightFish > 50){
            excessWeight = weightFish - 50;
        }

        //Calculating price tax weight fish
        taxWeightExcess = excessWeight * 4.0;

        //Printing values of tax price for pay
        System.out.println("You tax for pay is: R$ "+taxWeightExcess);



    }
}
