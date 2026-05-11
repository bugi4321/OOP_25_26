package pckg_serial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        SpaceShip sp1 = new SpaceShip("Enterprize");
//        SpaceShip sp2 = new SpaceShip("Millenium Falcon");
//        SpaceShip sp3 = new SpaceShip("Discovery");
//        List<SpaceShip> spaceShipList = List.of(sp1,sp2,sp3);
//        listAllSpaceShips(spaceShipList);
//        String filePath = "./SERIAL/src/pckg_serial/SpaceShipData.bin";
//        saveSpaceShips(spaceShipList,filePath);
//        SpaceShip sp4 = new SpaceShip("SP4");
//        SpaceShip sp5 = new SpaceShip("SP5");
//        List<SpaceShip> spsl = new ArrayList<>(spaceShipList);
//        spsl.add(sp4);
//        spsl.add(sp5);
//        saveSpaceShips(spsl,filePath);
        SpaceShip sp7 = new SpaceShip("Seven45-45");
        SpaceShip sp8 = new SpaceShip("EFE-34");
        List<SpaceShip> spList = new ArrayList<>();
        spList.add(sp7);
        spList.add(sp8);
        String filePath2 = "./SERIAL/src/pckg_serial/spaceShipDataFile.dat";
        //saveSpaceShips(spList,filePath2);
        List<SpaceShip> newSpList = readSpaceShipData(filePath2);
        listAllSpaceShips(newSpList);
    }

    private static void listAllSpaceShips(List<SpaceShip> spList){
        for (SpaceShip sp : spList){
            System.out.println(sp);
        }
    }
    private static void saveSpaceShips(List<SpaceShip> ships,String filePath){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))){
            oos.writeObject(ships);
            System.out.println("Finished writing to a file!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println();
            System.out.println("Can not write into the file!");
        }
    }

    private static void addSpaceShip(SpaceShip spaceShip,String filePath){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath),true))){
            oos.writeObject(spaceShip);
            System.out.println("Finished writing to a file!");
            oos.reset();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println();
            System.out.println("Can not write into the file!");
        }
    }
    private static List<SpaceShip> readSpaceShipData(String filePath){
        List<SpaceShip> spaceShipList = null;
        try(FileInputStream fis = new FileInputStream(new File(filePath))) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            spaceShipList = (List<SpaceShip>) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return spaceShipList;
    }
}

