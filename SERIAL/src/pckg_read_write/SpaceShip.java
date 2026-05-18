package pckg_read_write;

import java.io.Serializable;

public class SpaceShip implements Serializable {

    private String name;
    private int id;
    private static int cntID = 1;

    public SpaceShip(String name, int id){
        this.id = id;
        this.name = name;
    }
    public String getSpaceShipName(){

        return this.name;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}
