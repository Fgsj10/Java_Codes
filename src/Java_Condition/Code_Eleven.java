package Java_Condition;

import java.util.Scanner;

/***
 * @author Francisco Junior
 */

public class Code_Eleven {
    public static void main(String[] args) {

        //Calling class "Scanner" of input received data user
        Scanner input = new Scanner(System.in);

        //Variables
        int day;

        //Input logical data user
        System.out.println("What day: ");
        day = input.nextInt();

        //Checking of value day in portuguese

        if(day == 1){
            System.out.println("Domingo");
        } else if (day == 2){
            System.out.println("Segunda-Feira");
        } else if (day == 3){
            System.out.println("Terça-Feira");
        } else if (day == 4){
            System.out.println("Quarta-Feira");
        } else if (day == 5){
            System.out.println("Quinta-Feira");
        } else if (day == 6){
            System.out.println("Sexta-Feira");
        } else if (day == 7){
            System.out.println("Sábado");
        } else {
            System.out.println("Day invalid");
        }

    }
}
