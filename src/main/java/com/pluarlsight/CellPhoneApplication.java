package com.pluarlsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone();
        Scanner scanner = new Scanner(System.in);

        newPhone(scanner, phone1);
        newPhone(scanner, phone2);

        display(phone1);
        display(phone2);

        System.out.println(phone1.getSerialNumber() + "\n" + phone1.getModel() + "\n" + phone1.getCarrier() + "\n" + phone1.getPhoneNumber() + "\n" + phone1.getOwner());

        System.out.println("Please enter the number you want to call: ");
        String callNumber = scanner.nextLine();

        phone1.dial(phone1.getOwner(), callNumber);
        scanner.close();
    }
    public static void display(CellPhone phone){
        System.out.println(phone.getSerialNumber() + "\n" + phone.getModel() + "\n" + phone.getCarrier() + "\n" + phone.getPhoneNumber() + "\n" + phone.getOwner());
    }
    public static CellPhone newPhone(Scanner scanner, CellPhone phone) {
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

        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        return phone;
    }
}
