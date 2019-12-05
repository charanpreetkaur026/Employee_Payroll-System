package com.example.employeepayrollsystem.models;

public abstract class Vehicle {
    private String make;
    private String plate;

    public Vehicle(String make, String plate) {
        this.make = make;
        this.plate = plate;
    }

    public String getMake() { return make; }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
