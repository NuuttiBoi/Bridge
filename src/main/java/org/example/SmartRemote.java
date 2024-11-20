package org.example;

import java.util.Scanner;

public class SmartRemote extends BasicRemote{
    public SmartRemote(Device device){
        super.device=device;
    }
    public void voiceControl(){
        String choice = null;
        System.out.println("Voice control activated: Say what would you like to do (eg. Mute");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a voice command:");
        choice=scanner.nextLine();
        switch (choice.toLowerCase()){
            case "volume down":
                volumeDown();
                break;
            case "volume up":
                volumeUp();
                break;
            case "power":
                power();
                break;
            case "chanel up":
                channelUp();
                break;
            case "chanel down":
                channelDown();
                break;
            case "browse internet":
                if(device instanceof SmartTv){
                    ((SmartTv) device).browseInternet();
                } else {
                    System.out.println("Your device doesn't support browsing the internet..");
                }
                break;
            case "connect bluetooth device":
                if(device instanceof SmartTv){
                    ((SmartTv) device).connectBluetoothDevice();
                } else if(device instanceof SmartRadio){
                    ((SmartRadio) device).connectBluetoothDevice();
                }else {
                System.out.println("Your device doesn't support browsing the internet..");
                }
            default:
                System.out.println("Invalid command...");
        }
    }

}
