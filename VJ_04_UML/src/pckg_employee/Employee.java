package pckg_employee;

public class Employee {

    private String nameSurname;
    private int emplID = 0;
    private String department;
    private MobilePhone mob;

    public Employee() {

    }

    public Employee(String name, String department) {

        emplID++;
        this.nameSurname = name;
        this.department = department;

    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getEmplID() {
        return emplID;
    }

    public void setEmplID(int emplID) {
        this.emplID = emplID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public MobilePhone getMob() {
        return mob;
    }

    public void setMob(MobilePhone mob) {
        this.mob = mob;
    }

}