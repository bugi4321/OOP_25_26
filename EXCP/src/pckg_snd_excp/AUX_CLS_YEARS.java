package pckg_snd_excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AUX_CLS_YEARS {

    public static void enterAge(Scanner scanner){
        while (true){
            System.out.println("Please enter your age as integer:\n");
            try{
                int age = scanner.nextInt();
                checkNegativeValues(age);
                System.out.println("Entered age value is:  "+  age);
                break;

            }catch (InputMismatchException ime){
                System.out.println("Entered value must be an integer value!");
                scanner.nextLine();
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
                scanner.nextLine();
            }

        }




    }
    private static void checkNegativeValues(int inputAge)throws IllegalArgumentException{
        if (inputAge <= 0){
            throw new IllegalArgumentException("Negative number of zero is not legal for age value!");
        } else {
            System.out.println("Good value for age!");
        }
    }
}
