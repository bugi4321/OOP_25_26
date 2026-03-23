package pckg_arr_2;

import pckg_arr_1.AUX_CLS;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrPomocna {

    public static Float[] getUserDefinedTemp(Scanner scanner,int numElements){
        Float[] temps= new Float[numElements];
        for (int k = 0; k<numElements;k++){
            System.out.println("Unesite tmepretaturu:\t");
            temps[k] = scanner.nextFloat();
        }
        return temps;
    }
    public static Float[] getRandomTemp(int numTemps){
        Float MAXI = 39f;
        Float MINI = -15f;
        Float []temps = new Float[numTemps];
        for (int k = 0;k<numTemps;k++){
            temps[k] = ThreadLocalRandom.current().nextFloat(MINI,MAXI);
        }
        return temps;
    }

    private static float avgTemp(Float[] temps){
        Float acumSum =  0f;
        for (Float el:temps){
            acumSum+= el;
        }
        return acumSum/temps.length;
    }
    public static void aboveBelow(Float[] temps){
        int above = 0;
        int below = 0;
        int eq = 0;

        float avg = avgTemp(temps);
        for (Float el : temps){
            if (el> avg){
                above++;
            } else if (el<avg) {
                below++;
            }else {
                eq++;
            }


        }
        System.out.println("Izmjerene temperature su : ");
        System.out.println("--------------------------------------");
        AUX_CLS.printElementsFromArray(temps);
        System.out.println("----------------------------------");
        System.out.println("Average temperature is : " + avg);
        System.out.println("Number of above avg temp is :" + above);
        System.out.println("Number of below avg temp is: " + below);
        System.out.println("Number of equal to avg temps is  : " + eq);
    }
}
