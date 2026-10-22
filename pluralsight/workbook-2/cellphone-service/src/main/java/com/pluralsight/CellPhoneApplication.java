package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- FIRST PHONE ---
        System.out.println("Enter information for the first phone:");
        CellPhone phone1 = new CellPhone();

        System.out.print("What is the serial number? ");
        long serial1 = scanner.nextLong();
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model1 = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier1 = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNum1 = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner1 = scanner.nextLine();

        phone1.setSerialNumber(serial1);
        phone1.setModel(model1);
        phone1.setCarrier(carrier1);
        phone1.setPhoneNumber(phoneNum1);
        phone1.setOwner(owner1);

        System.out.println("\n-----------------------------------\n");

        // --- SECOND PHONE ---
        System.out.println("Enter information for the second phone:");
        CellPhone phone2 = new CellPhone();

        System.out.print("What is the serial number? ");
        long serial2 = scanner.nextLong();
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model2 = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier2 = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNum2 = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner2 = scanner.nextLine();

        phone2.setSerialNumber(serial2);
        phone2.setModel(model2);
        phone2.setCarrier(carrier2);
        phone2.setPhoneNumber(phoneNum2);
        phone2.setOwner(owner2);

        System.out.println("\n--- Displaying Phone Details ---");
        // Calling the static display method for both phones
        display(phone1);
        System.out.println();
        display(phone2);

        System.out.println("\n--- Testing Dial Method ---");
        // Testing the dial method we created
        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());


        scanner.close();
    }

    // Static method to display a phone's properties (From Exercise 2)
    public static void display(CellPhone phone) {
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
