package pckg_arr3;

import java.util.Arrays;

public class POM_ARR {

    public static void print2DArrFloat(Float[][] fArr){
        System.out.println("Temperature za : ");
        for (int row = 0;row < fArr.length;row++){
            System.out.println(row+1 +".mjesec:");
            for (int col = 0; col <fArr[0].length;col++ ){
                System.out.print(fArr[row][col]+" ");
            }
            System.out.println();
        }
    }
    //for each petlja

    public static void print2DArr(Float[][] fArr){
        for (Float []el:fArr){
            System.out.println(Arrays.toString(el));
        }
    }

    public static Float[] calcProfit(Float[][] priRash){
        Float[] profit = new Float[priRash.length];
        for (int k = 0;k < profit.length;k++){
            profit[k] = priRash[k][0] - priRash[k][1];
        }
        return profit;
    }
    public static float avgProfit(Float[] profits){
        float acumSum = 0.0f;
        for (Float el : profits){
            acumSum+= el;
        }
        return acumSum/profits.length;
    }
}
