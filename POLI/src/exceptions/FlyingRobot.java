package exceptions;

public class FlyingRobot extends Robot{

    private int hours;
    protected FlyingRobot(String name,int hours) {
        super(name);
        this.hours = hours;
    }

    @Override
    protected void chargeRobot() {
        System.out.println("Charging in the air + "  + this.getClass().getSimpleName());
    }

    @Override
    protected void changeState() {
        System.out.println("Fly or land!");
    }
}
