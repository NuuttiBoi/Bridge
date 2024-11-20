package org.example;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Normal Tv");
        testDevice(new Tv());
        //System.out.println("Normal Radio");
        //testDevice(new Radio());
        //System.out.println("Smart Tv");
        //testSmartDevice(new SmartTv());
        //System.out.println("Smart Radio");
        //testDevice(new SmartRadio());
    }

    public static void testDevice(Device device) {
        /*
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

         */

        SmartRemote smartRemote = new SmartRemote(device);
        smartRemote.voiceControl();
    }
    public static void testSmartDevice(Device device){
        System.out.println("Tests with SmartRemote");
        SmartRemote smartRemote = new SmartRemote(device);
        smartRemote.voiceControl();
        device.printStatus();
    }
}