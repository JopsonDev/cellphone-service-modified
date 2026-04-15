package com.pluarlsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Serial Number: ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Carrier: ");
        String carrier = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Owner: ");
        String owner = scanner.nextLine();

        //System.out.println(phone1.getSerialNumber()+ "\n" + phone1.getModel() + "\n" + phone1.getCarrier() + "\n" + phone1.getPhoneNumber() + "\n" + phone1.getOwner());
        phone1.setSerialNumber(serialNumber);
        phone1.setModel(model);
        phone1.setCarrier(carrier);
        phone1.setPhoneNumber(phoneNumber);
        phone1.setOwner(owner);
        System.out.println(phone1.getSerialNumber() + "\n" + phone1.getModel() + "\n" + phone1.getCarrier() + "\n" + phone1.getPhoneNumber() + "\n" + phone1.getOwner());

        System.out.println("Please enter the number you want to call: ");
        String callNumber = scanner.nextLine();

        phone1.dial(owner, callNumber);
        scanner.close();
    }
    public static void display(CellPhone phone){
        System.out.println(phone.getSerialNumber() + "\n" + phone.getModel() + "\n" + phone.getCarrier() + "\n" + phone.getPhoneNumber() + "\n" + phone.getOwner());
    }
}
