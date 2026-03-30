package inner_cls_pckg;

import java.util.ArrayList;
import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        OuterCLS outer1 = new OuterCLS("IME!!");
        System.out.println(outer1);
        OuterCLS.InnerCLS inner1 = outer1.new InnerCLS("IME unutarnje!");
        inner1.innerInfo();
        OuterCLS.InnerCLS inner2 = outer1.createInnerClsObject("Ime druge unutarnje!");
        inner2.innerInfo();

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(21);
        intList.add(22);
        listElements(intList);
    }

    private static void listElements(ArrayList<Integer> elements){
        for (Integer el: elements){
            System.out.println(el);
        }
    }
}
