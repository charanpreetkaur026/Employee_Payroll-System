package com.example.employeepayrollsystem.models;

public class Motorcycle extends Vehicle {
    private String motorcycleModel;

    public Motorcycle(String make, String plate, String motorcycleModel) {
        super(make, plate);
        this.motorcycleModel =motorcycleModel;
    }

    public String getMotorcycleModel() {
        return motorcycleModel;
    }

    public void setMotorcycleModel(String motorcycleModel) {
        this.motorcycleModel = motorcycleModel;
    }
}
