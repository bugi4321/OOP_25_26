package scanner_primer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    private static Scanner scanner;

    public static void main(String[] args) throws FileNotFoundException {
        try{
            scanner = new Scanner(System.in);
            double num;
            System.out.println("Enter some real number!\t");
            num = scanner.nextDouble();
            System.out.println(num);
        } catch (InputMismatchException ime){
            System.out.println("This is exception due the input mismatcg - expected Double!!");
        }

        readTxtFile("./POLI/src/scanner_primer/primjer31.txt", scanner);
        readTxtFileSnd("./POLI/src/scanner_primer/primjer31.txt", scanner);

    }

    public static void readTxtFile(String filePath,Scanner scanner){
        try{
            scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            System.out.println("Finished reading file!");
        } catch (FileNotFoundException e){
            System.out.println("File not found!");
            System.out.println(e.getMessage());
        }
    }

    public static void readTxtFileSnd(String filePath,Scanner scanner) throws FileNotFoundException {

            scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());

        }
    }
}
