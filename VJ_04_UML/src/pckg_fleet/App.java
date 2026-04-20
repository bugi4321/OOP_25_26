package pckg_fleet;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        FleetVehicles flt = new FleetVehicles();
        Vehicle v1 = new Vehicle("Skoda", "Octavia", 1,"444HU","2015");
        Vehicle v2 = new Vehicle("Audi","s+", 2,"888ZD","2015" );
        Vehicle v3 = new Vehicle("Mercedes","Benz", 3, "213ZG", "2018");
        // Kreirajte tri objekta klase Vehicles korištenjem pripadnog konstruktora
        ArrayList<Vehicle> vhl1 = new ArrayList<>();
        // Kreirajte nova tri objekta klase Vehicles korištenjem pripadnog konstruktora --> ti objekti idu u novu listu
        Vehicle v4 = new Vehicle("Toyota", "Yaris",4,"516ZD","2001");
        Vehicle v5 = new Vehicle("Hiundai", "505", 5,"789ZG","2002");
        Vehicle v6 = new Vehicle("Fiat", "Brava", 6,"999HA","1999");

        // Dodajte prva tri objekta klase Vehicles u listu vhl1
        vhl1.add(v1);
        vhl1.add(v2);
        vhl1.add(v3);
        // Postavite ta vozila u vozni park tvrtke
        flt.setVehList(vhl1);
        // Izlistaje sva vozila u voznom parku tvrtke
        flt.listAllVehicles();
        System.out.println(); // dodano samo za prazni red

        // Dodajte druga tri objekta klase Vehicles u drugu listu
        ArrayList<Vehicle> vhl2 = new ArrayList<>();
        vhl2.add(v4);
        vhl2.add(v5);
        vhl2.add(v6);
        // Postavite ta vozila u vozni park tvrtke
        flt.setVehList(vhl2);
        System.out.println("///////////////// Snd listing /////////////////");

        // Izlistajte sada sva vozila u voznom parku tvrtke
        flt.listAllVehicles();

    }
}
