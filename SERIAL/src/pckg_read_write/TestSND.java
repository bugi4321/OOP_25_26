package pckg_read_write;

import java.util.ArrayList;
import java.util.List;

public class TestSND {
    public static void main(String[] args) {
        String filePath = "./SERIAL/src/pckg_read_write/spaceShipsCSV.csv";
        List<SpaceShip> ships = AUX_SER_DESER.readDataFromAFile(filePath);
        System.out.println(ships);

        List<String[]> listaStringova = AUX_SER_DESER.readLinesFromFile(filePath);
        System.out.println(listaStringova);
        List<SpaceShip> spaceShipList = AUX_SER_DESER.createSpaceShipsFromCSVData(listaStringova);
        System.out.println(spaceShipList);
    }
}
