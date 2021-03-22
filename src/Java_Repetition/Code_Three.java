package Java_Repetition;


import java.util.Scanner;

/***
 * @author Francisco Junior
 */

public class Code_Three {
    public static void main(String[] args) {
        //Calling class "Scanner" for received input data user
        Scanner input = new Scanner(System.in);

        //Creating variables
        String name;
        int age;
        double salary;
        String gender;
        String converterGender;
        String stateCivil;

        //Inputing data of user;

        //Receiving size of name
        System.out.println("Enter with you name: ");
        name = input.next();
        while (name.length() < 3){
            System.out.println("Size name is invalid, please again");
            System.out.println("Enter with you name again: ");
            name = input.next();
        }
        //-----------------------------------------------------------
        System.out.println("****************************************");
        System.out.println("Enter with you age: ");
        age = input.nextInt();
        while (age < 0 || age > 150){
            System.out.println("Age invalid, try again");
            System.out.println("Enter you age: ");
            age = input.nextInt();
        }
        //-----------------------------------------------------------
        System.out.println("****************************************");
        System.out.println("Enter you salary: ");
        salary = input.nextDouble();
        while (salary < 0){
            System.out.println("Enter you salary please: ");
            System.out.println("Your salary is: ");
            salary = input.nextDouble();
        }
        //-----------------------------------------------------------
        System.out.println("****************************************");
        System.out.println("Enter you gender: ");
        gender = input.next();
        converterGender = gender.toLowerCase();
        while (converterGender != "f" && converterGender != "m"){
            System.out.println("Gender invalid");
            System.out.println("User, enter with you gender: ");
            gender = input.next();
            converterGender = gender.toLowerCase();
        }


    }

}


