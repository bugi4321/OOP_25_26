package exceptions;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<>(5);
        robots.add(new IndustrialRobot("R456"));
        robots.add(new FlyingRobot("Fly300",23));
        robots.add(new IndustrialRobot("SPEC212"));
        robots.add(new FlyingRobot("Fly34" , 300));
    }
}
