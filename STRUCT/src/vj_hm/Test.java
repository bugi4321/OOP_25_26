package vj_hm;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer,String> podaci = new HashMap<>();
        HashMap<Student,Integer[]> studentiPodaci = new HashMap<>();
        studentiPodaci.put(new Student("Miro"), new Integer[]{2, 3, 4, 5, 5});
        podaci.put(21, "Stipe");
        podaci.put(159,"Divna");
        podaci.put(985,"Etna");
        podaci.put(455,"Petar");
        podaci.put(5788,"Vlatka");
        System.out.println(podaci);
        listHMElements(podaci);
        TreeMap<Integer,String> tmPodaci = new TreeMap<>(podaci);
        System.out.println(tmPodaci);
        listHMElements(tmPodaci);
        listHMElements(studentiPodaci);
        TreeMap<Student,Integer[]> tmStudenti = new TreeMap<>(studentiPodaci);
        listHMElements(tmStudenti);
    }

    private static <K, V> void listHMElements(Map<K,V> podaci){
        Set<Map.Entry<K,V>> entrySet = podaci.entrySet();
        for (Map.Entry<K,V> es: entrySet){
            System.out.println(es.getKey() + " - " + es.getValue());
        }
    }

}
