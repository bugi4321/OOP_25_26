package pckg_abs_cls;

import java.util.ArrayList;

public class TestDeviceApp {
    public static void main(String[] args) {
        Device mobilePhone = new MobilePhone("Samsung","S26");
        Device camera = new Camera("Sony", "S345");
        Device mobile2 = new MobilePhone("Iphone","17");
        ArrayList<Device> devices = new ArrayList<>();
        addNewDevice(mobilePhone,devices);
        addNewDevice(camera,devices);
        addNewDevice(mobile2,devices);
        testAllDevices(devices);

        int val = 100;
        changeInt(val);
        System.out.println("------------------------------------");
        System.out.println(val);
    }

    private static void changeInt(int val){
        System.out.println("input values is:  " + val);
        val += 100;
        System.out.println("now values is: " + val);
    }
    private static void addNewDevice(Device device, ArrayList<Device> devices){
        if (devices.contains(device)){
            System.out.println("Device is alrdy in the list");
        }else {
            devices.add(device);
            System.out.println("New device added to a list!");
        }
    }
    private static void testAllDevices(ArrayList<Device> devices){
        for (Device device : devices){
            device.getMainInfo();
            device.operate();
            System.out.println("----------------------");
        }

    }


}
