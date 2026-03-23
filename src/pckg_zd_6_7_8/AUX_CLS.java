package pckg_zd_6_7_8;

public class AUX_CLS {
    //ZD 7
    public static int maxValueOfArr(int[][] niz){
        int max = niz[0][0];

        for (int row = 0;row<niz.length;row++){
            for (int col= 0;col<niz[row].length;col++){
                if (niz[row][col] > max){
                    max = niz[row][col];
                }
            }
        }
        return max;
    }


}
