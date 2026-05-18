package pckg_read_write;

import java.util.ArrayList;
import java.util.List;

public class TestSD {
    public static void main(String[] args) {
//        SpaceShip sp1 = new SpaceShip("Enterprise");
//        SpaceShip sp2 = new SpaceShip("Voyager");
//        SpaceShip sp3 = new SpaceShip("Millenium Falcon");
//
//        List<SpaceShip> spaceShipList = new ArrayList<>();
//        spaceShipList.add(sp1);
//        spaceShipList.add(sp2);
//        spaceShipList.add(sp3);
//
//        String filePath = "./SERIAL/src/pckg_read_write/spaceShipData_1.bin";
//        AUX_SER_DESER.saveShips(spaceShipList,filePath);
//        spaceShipList.clear();
//        listElements(spaceShipList);
//        spaceShipList = AUX_SER_DESER.readSpaceShipsdata(filePath);
//        listElements(spaceShipList);
//        String filePathONE = "./SERIAL/src/pckg_read_write/spaceShipData_2.bin";
//
//        AUX_SER_DESER.saveSpaceShipOne(sp1,filePathONE);
//        AUX_SER_DESER.saveSpaceShipOne(sp2,filePathONE);
//        AUX_SER_DESER.saveSpaceShipOne(sp3,filePathONE);
//        spaceShipList.clear();
//        listElements(spaceShipList);
//        spaceShipList = AUX_SER_DESER.readOneByOneSpaceShip(filePathONE);
//        listElements(spaceShipList);
        String filePathCSV = "./SERIAL/src/pckg_read_write/spaceShipsCSV.csv";
        List<SpaceShip> spaceShipList = new ArrayList<>();
        spaceShipList = AUX_SER_DESER.readDataFromAFile(filePathCSV);
        listElements(spaceShipList);

    }

    private static <E> void listElements(List<E> lista){
        if (lista.isEmpty()){
            System.out.println("Lista je prazna");
        } else {
            for (E el : lista){
                System.out.println(el);
        }

        }
    }
}
