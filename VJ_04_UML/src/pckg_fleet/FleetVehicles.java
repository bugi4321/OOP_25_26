package pckg_fleet;

import java.util.ArrayList;

public class FleetVehicles {
    private String company;
    private int compID;

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    // Getters and setters

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCompID() {
        return compID;
    }

    public void setCompID(int compID) {
        this.compID = compID;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }


    // Metoda koja kreira i puni listu objekata Vehicle

    public void setVehList(ArrayList<Vehicle> vhcls) {
        if (this.vehicles.isEmpty()){
            this.vehicles = vhcls;
        } else {
            for (Vehicle vehicle: vhcls){
                this.vehicles.add(vehicle);
            }
        }
        // Ako je this.vehicles prazna kreiraj je iz ulazne liste
        // U suprotnom čitaj element po element ulazne liste i dodavaj u postojeću this.vehicles

    }

    // Metoda koja će izlistati cijelu listu dajući info svakog objeka Vehicle u listi

    public void listAllVehicles() {
        for ( Vehicle vehicle : vehicles){
            System.out.println(vehicle.getBrandName() + " " + vehicle.getModel() +" " + vehicle.getProdYear()+" " +vehicle.getVehRegistrationPlate());

        }
        // Npr. koristite for each

    }
}
