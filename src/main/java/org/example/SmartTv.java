package org.example;

public class SmartTv extends Tv {
    private boolean bluetoothConnected = false;
    private boolean browsingInternet = false;
    public void browseInternet(){
        browsingInternet = true;
        System.out.println("Browsing the internet...");
    }
    public void connectBluetoothDevice(){
        bluetoothConnected = true;
        System.out.println("Connecting bluetooth device to the Tv..");
    }
    @Override
    public void printStatus() {
        super.printStatus();
        System.out.println("| Bluetooth connected: " + (bluetoothConnected ? "Yes" : "No"));
        System.out.println("| Browsing the internet: " + (browsingInternet ? "Yes" : "No"));
        System.out.println("------------------------------------\n");
    }
}
