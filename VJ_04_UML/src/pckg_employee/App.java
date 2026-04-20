package pckg_employee;

public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Tony","Marketing");
        MobilePhone mp = new MobilePhone();

        mp.setBrand("Samsung");
        mp.setMobNum("385912342344532");
        mp.setModel("S9+");

        mp.setEmp(emp1);
        emp1.setMob(mp);

        mp.mobInfo();

        System.out.println(emp1.getNameSurname() + " mobNum: " + emp1.getMob().getMobNum());

        System.out.println(emp1.getNameSurname() + " mob model: " + emp1.getMob().getModel());
    }
}
