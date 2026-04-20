package pckg_employee;


public class MobilePhone {

    private String mobNum;
    private String brand;
    private String model;

    private Employee emp;

    public String getMobNum() {
        return mobNum;
    }

    public void setMobNum(String mobNum) {
        this.mobNum = mobNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public void mobInfo() {
        System.out.println(" //////////////////////////////////////////////////////////////////////////// ");
        System.out.println("Brand: " + getBrand() + ", model: " + getModel() + " , mobNum: " + getMobNum());
        System.out.println("Owner - employee: " + getEmp().getNameSurname());
        System.out.println(" //////////////////////////////////////////////////////////////////////////// ");
    }

}
