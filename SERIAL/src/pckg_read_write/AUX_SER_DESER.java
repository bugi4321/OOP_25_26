package pckg_read_write;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AUX_SER_DESER {

    public static void saveSpaceShipOne(SpaceShip spaceShip, String filePath){
        File file = new File(filePath);
        try (FileOutputStream fos = new FileOutputStream(file,true)) {
            ObjectOutputStream oos = null;
            if (file.length() == 0){
                oos = new ObjectOutputStream(fos);
            } else {
                oos = new NoHeaderObjectOutputStream(fos);
            }

            oos.writeObject(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static List<SpaceShip> readOneByOneSpaceShip(String filePath){
        List<SpaceShip> spaceShipList = new ArrayList<>();
        try(FileInputStream fis = new FileInputStream(filePath)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (fis.available()>0){
                SpaceShip spaceShip = (SpaceShip) ois.readObject();
                spaceShipList.add(spaceShip);
                System.out.println("One ship added to a list!");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return spaceShipList;
    }

    public static void  saveShips(List<SpaceShip> ships,String filePath)  {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(ships);
            System.out.println("Data written in the file!!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<SpaceShip> readSpaceShipsdata(String filePath){

        List<SpaceShip> spaceShipList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))){
            spaceShipList = (List<SpaceShip>) ois.readObject();
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found!");
            fnfe.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return spaceShipList;
    }

    public static List<SpaceShip> readDataFromAFile(String filePath){
        List<SpaceShip> spaceShipList = new ArrayList<>();
        File file = new File(filePath);
        try (Stream<String> lineStream = Files.lines(file.toPath())){
            lineStream.forEach(line -> {
                String[] lines = line.split(",");
                String ime = lines[1].trim();
                int id = Integer.parseInt(lines[0].trim());
                SpaceShip spaceShip = new SpaceShip(ime,id);
                spaceShipList.add(spaceShip);
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return spaceShipList;
    }

    public static List<String[]> readLinesFromFile(String filePath){
        List<String[]> content = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))){
            String line = null;
            while ((line = br.readLine()) != null){
                String [] data = line.split(",");
                System.out.println(data);
                content.add(data);

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return content;
    }
    public static List<SpaceShip> createSpaceShipsFromCSVData(List<String[]> data){
        List<SpaceShip> spaceShipList = new ArrayList<>();
        for (String[] partData : data){
            int id = Integer.parseInt(partData[0].trim());
            String name = partData[1].trim();
            SpaceShip spaceShip = new SpaceShip(name,id);
            spaceShipList.add(spaceShip);

        }
        return spaceShipList;
    }
}
