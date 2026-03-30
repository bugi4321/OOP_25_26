package inner_cls_pckg;

public class MainLocal {
    public static void main(String[] args) {
        String [] st1 = {"broj1;broj2;broj3;","nm1;nm2;nm3",
                "Helena;Nika",
        null,
        "perica;Santini;Petar"};
        CLSWithLocal cls = new CLSWithLocal();
        cls.processStringData(st1);
        
    }
}
