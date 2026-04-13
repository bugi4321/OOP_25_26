package zadaci_int;

import java.util.ArrayList;

public class AppTest {
    public static void main(String[] args) {
        ArrayList<Pregledljivo> materijali = new ArrayList<>();
        materijali.add(new PDFMaterijal("Java Effecitve and edd.",1024));
        materijali.add(new VideoMaterijal("Superman IV", 123455330));
        materijali.add(new Prezentacija("Predavnaje strukture pod", 1589));
        int velicina = AUX_CLS.ukupnaVelicinaKBMaterijala(materijali);
        System.out.println("Ukupna velicina: " + velicina);
        AUX_CLS.otvoriSve(materijali);
        Pregledljivo najveci = AUX_CLS.nadjiNajveciKapacitetKB(materijali);
        System.out.println("Najveci je : " + najveci.naziv());
    }
}
