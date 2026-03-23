package pckg_arr_1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arrInt =AUX_CLS.genIntArray(10);
        System.out.println(Arrays.toString(arrInt));
        String [] someStrings = {"String1","novi","itd","its"};
        String [] anotherStr;
        String[] newString = new String[5];
        anotherStr = someStrings;
        printStringArrayElements(someStrings);
        System.out.println("-------------------------------------");
        printStringArrayElements(anotherStr);
        Student[] students = new Student[10];
        /* Niz napravljen od objekata */
        Student[] students2 = {new Student("MArko"),new Student("Ivana")};
     }

    private static void printStringArrayElements(String[] arr){
        for (String el : arr){
            System.out.println(el);
        }
    }
}
