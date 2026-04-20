package pckg_zgrada;

public class Zgrada {

    // Unutarnja klasa


    private final class Kat {

        int kat;

        Kat(){

            brKata++;
            this.setKatBr(brKata);

        }


        void setKatBr(int brkt) {

            this.kat = brkt;
        }

        int getBrKata() {

            return this.kat;
        }


    }

    // Ostatak za glavnu klasu

    private int brKata = 0;
    private String adresa;
    private final Kat katA;
    private final Kat katB;
    private final Kat katC;

    public Zgrada() {

        katA = new Kat();
        katB = new Kat();
        katC = new Kat();
    }


    public void setAddrs(String adr) {
        this.adresa = adr;
    }

    public String getAddrs() {

        return this.adresa;
    }

    public void zgradaInfo() {

        System.out.println("Adresa: " + getAddrs() + ", broj katova: " + brKata);


        System.out.println("Kat " + this.getNumKat(katA) );
        System.out.println("Kat " + this.getNumKat(katB) );
        System.out.println("Kat " + this.getNumKat(katC) );

    }

    public int getNumKat(Kat kt) {

        return kt.getBrKata();
    }


}
