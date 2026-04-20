package pckg_fleet;

public class Vehicle {
    private String brandName;
    private int vehID;
    private String model;
    private String vehRegistrationPlate;
    private String prodYear;
    public Vehicle() {

    }

    public Vehicle(String bName, String model, int ID, String regPla, String year) {

        this.brandName = bName;
        this.model = model;
        this.vehID = ID;
        this.vehRegistrationPlate = regPla;
        this.prodYear = year;

    }

    // Getters and setters

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getVehID() {
        return vehID;
    }

    public void setVehID(int vehID) {
        this.vehID = vehID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehRegistrationPlate() {
        return vehRegistrationPlate;
    }

    public void setVehRegistrationPlate(String vehRegistrationPlate) {
        this.vehRegistrationPlate = vehRegistrationPlate;
    }

    public String getProdYear() {
        return prodYear;
    }

    public void setProdYear(String prodYear) {
        this.prodYear = prodYear;
    }


    // metoda koja daje info za objekt klase Vehicle

    public void vehInfo(){
        System.out.println(this.getClass().getSimpleName() + " " + this.brandName + " " + this.model+" " + this.vehRegistrationPlate);
        // Brand name
        // model
        // registraciju


    }
}
