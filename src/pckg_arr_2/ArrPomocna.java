package pckg_arr_2;

import java.util.Scanner;

public class ArrPomocna {

    public static float[] getUserDefinedTemp(Scanner scanner,int numElements){
        float[] temps= new float[numElements];
        for (int k = 0; k<numElements;k++){
            System.out.println("Unesite tmepretaturu:\t");
            temps[k] = scanner.nextFloat();
        }
        return temps;
    }
}
