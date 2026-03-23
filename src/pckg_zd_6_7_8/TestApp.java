package pckg_zd_6_7_8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class TestApp {
    public static void main(String[] args) {

        //Zadatak 6
        int [] niz = new int[15];
        int [] noviNiz = Arrays.copyOf(niz,niz.length);
        if (niz.equals(noviNiz)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        System.out.println("-------------------------------------");
        // Zaključak: Nisu isti jer ne zauzimaju istu memorijsku adresu(metoda equals ne usporeduje sadrzaj tih nizova)


        //Zadatak 7
        int [][] niz2 = {{2,3,12,90},{5,4,60,80},{0,50,27,1}};
        int MAX_VAlUE = AUX_CLS.maxValueOfArr(niz2);
        System.out.println("Max vrijednost niza  " + Arrays.deepToString(niz2) + " je " + MAX_VAlUE);
        System.out.println("------------------------------------------");


        //Zadatak 8
        double minDo = 25.78; double maxDo = 2400.89;

        Double [] noviniz = new Double[15];
        for (int k = 0; k<15;k++){
            double rnDo = ThreadLocalRandom.current().nextDouble(minDo, maxDo);
            noviniz[k] = rnDo;
        }

        System.out.println("Nesortirani niz:");
        System.out.println(Arrays.toString(noviniz));
        Arrays.sort(noviniz, Collections.reverseOrder());
        System.out.println("Sortirani niz:");
        System.out.println(Arrays.toString(noviniz));







    }

}
