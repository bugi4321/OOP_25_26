package pckg_zd_9_10;

public class IndexValueApp {
    public static void main(String[] args) {

        float [] nums = {2.44f, 4.55f, 7.88f, 44.32f, 51.11f};
        printIndexValueOfArr(nums);

    }

    public static void printIndexValueOfArr(float [] arr){
        int index = 0;
        for (float el :  arr){
            System.out.println("Index: " + index+" <-> " + "Value: " + el);
            index++;

        }


    }
}
