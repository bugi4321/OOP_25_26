package pckg_arr_1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class AUX_CLS {

    private static  final int ORIGIN = 0;
    private static final int BOUND = 250;




    public static int[] genIntArray(int numElements){

        int[] array = new int[numElements];
        for (int k = 0; k<numElements;k++){
            array[k] = ThreadLocalRandom.current().nextInt(ORIGIN,BOUND);

        }
        return array;
    }
    public static Student[] students(String[] strArr){
        Student[] students = new Student[strArr.length];
        for (int k = 0;k < strArr.length; k++){
            students[k] = new Student(strArr[k]);


        }
        return students;


    }
    public static Professor[] professors(String[] imena){
        Professor [] professors = new Professor[imena.length];
        for (int k= 0; k<imena.length;k++){
            professors[k] = new Professor(imena[k]);

        }
        return professors;
    }

    public static void printStudentsFromArray(Student[] arr){
        for (Student student1 : arr){
            System.out.println(student1);

        }
    }
    public static <E> void printElementsFromArray(E [] arr){
        for (E el : arr){
            System.out.println(el);
        }

    }

    public static String concatenateArrElements(String [] strArr){
        String conString = "";
        for (String el : strArr){
            conString = conString + "" + el;
        }
        return conString;
    }
    public static String[] userInputArr(Scanner scanner,int numElements){
        String []userArr = new String[numElements];
        for (int k = 0; k< numElements; k++){
            System.out.println("Unesite neki string!\n");
            userArr[k] = scanner.nextLine();
        }
        return userArr;

    }

}
