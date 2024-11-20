package org.example;

public class SmartRadio extends Radio{
    private boolean bluetoothConnected = false;

    public void connectBluetoothDevice(){
        bluetoothConnected = true;
        System.out.println("Connecting bluetooth device to the Radio..");
    }
    @Override
    public void printStatus() {
        super.printStatus();
        System.out.println("| Bluetooth connected: " + (bluetoothConnected ? "Yes" : "No"));
        System.out.println("------------------------------------\n");
    }
}
