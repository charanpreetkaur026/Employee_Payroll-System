package com.example.employeepayrollsystem.models;

public class Car extends Vehicle{
    private String carModel;


    public Car(String make, String plate, String carModel) {
        super(make, plate);
        this.carModel =carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
