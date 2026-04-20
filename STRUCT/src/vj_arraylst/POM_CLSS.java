package vj_arraylst;

import java.util.ArrayList;
import java.util.LinkedList;

public class POM_CLSS {
    public static void addElementToList(ArrayList<String>lst,String addedElement){
        if (lst == null){
            System.out.println("List is null - define list!!");
        } else {
            if (addedElement == null){
                System.out.println("Added element cant be null!");
            }else {
                lst.add(addedElement);
                System.out.println("Element added to a list!");
            }
        }
    }
    public static void addAndRemoveFromList(LinkedList<String> lst, int idx, String element){
        lst.remove(idx);
        lst.add(idx,element);
    }
}
