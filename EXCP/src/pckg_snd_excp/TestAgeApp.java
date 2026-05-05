package pckg_snd_excp;

import java.util.Scanner;



public class TestAgeApp {

    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Neka proizvoljna int vrijednost - unesi:\n");
        int exampleInt = scanner.nextInt();
        System.out.println(exampleInt);

        AUX_CLS_YEARS.enterAge(scanner);
        scanner.close();
    }
}
