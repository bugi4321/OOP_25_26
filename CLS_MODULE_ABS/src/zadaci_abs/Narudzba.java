package zadaci_abs;

public class Narudzba {
    private Proizvod[] proizvodi;
    private int id;
    private int idx;
    private static int cntID=1001;

    public Narudzba(int brojProizvoda){
        this.id = cntID++;
        this.proizvodi = new Proizvod[brojProizvoda];
        this.idx =0;
    }

    public Narudzba(Proizvod[] proizvodi){
        this.proizvodi = proizvodi;
        this.id = cntID++;

    }

    public void addProizvod(Proizvod proizvod){
        if (idx < this.proizvodi.length){
            this.proizvodi[idx] = proizvod;
            System.out.println("Proizvod je dodan!!");
            idx++;

        }else {
            System.out.println("Nema mjesta!!");

        }
    }
    public float ukupnaCijenaNarudzbe(){
        float ukupno = 0f;
        for (Proizvod proizvod: proizvodi){
            ukupno+= proizvod.ukupnaCijenaProizvoda();

        }
        System.out.println("Ukupna cijena narudžbe: " + ukupno);
        return ukupno;
    }
    public void ispisiRacun(){
        for (Proizvod proizvod: proizvodi){
            System.out.println(proizvod);
            float ukupna = proizvod.ukupnaCijenaProizvoda();
        }
    }
}
