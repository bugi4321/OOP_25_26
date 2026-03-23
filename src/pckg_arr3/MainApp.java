package pckg_arr3;

import pckg_arr_1.AUX_CLS;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        float [][] vals = new float[2][2];
        Float [][] dvals = {{20f,10f},{50f,40f},{340f,240f},{120f,100f}};
        //POM_ARR.print2DArrFloat(dvals);
        POM_ARR.print2DArr(dvals);
        System.out.println("----------------------");
        Float [] profs = POM_ARR.calcProfit(dvals);
        System.out.println("Razlike temperatura su: ");
        AUX_CLS.printElementsFromArray(profs);
        System.out.println("Prosjecna temperatura je :  ");
        System.out.println(POM_ARR.avgProfit(profs));

        /*deepToString metoda
        System.out.println(Arrays.deepToString(dvals)); */

    }
}
