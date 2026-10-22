package com.pluralsight;

public class CellPhone {
    // 1. Data members (Properties)
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // 2. Parameterless Constructor (Default values)
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    // 3. Getters and Setters for all 5 data members
    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Method to simulate making a call
    public void dial(String phoneNumber) {
        System.out.println(this.owner + "'s phone is calling " + phoneNumber);
    }
}