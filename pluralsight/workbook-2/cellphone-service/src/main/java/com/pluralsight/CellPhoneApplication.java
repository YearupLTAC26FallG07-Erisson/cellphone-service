package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Instantiate a new CellPhone object using the default constructor
        CellPhone phone = new CellPhone();

        // Prompt the user for information (Step 2 from instructions)
        System.out.print("What is the serial number? ");
        long serial = scanner.nextLong();
        scanner.nextLine(); // Clear the buffer line after a number input

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNum = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        // Use setters to assign user inputs to the phone object
        phone.setSerialNumber(serial);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNum);
        phone.setOwner(owner);

        System.out.println(); // Print a blank line for layout spacing

        // Use getters to display the properties on the screen
        System.out.println("--- Phone Details ---");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

        scanner.close();
    }
}
