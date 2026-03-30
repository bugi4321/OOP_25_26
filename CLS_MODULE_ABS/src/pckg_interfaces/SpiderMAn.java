package pckg_interfaces;

public class SpiderMAn extends Man implements Fly, RunFast{
    public SpiderMAn(String name) {
        super(name);
    }

    @Override
    public void flyingAbility() {
        System.out.println("Spiderman can fly using nets....");
    }

    @Override
    public void fastRunningAbility() {
        System.out.println("Spiderman is running fast!");
    }
}
