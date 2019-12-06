package com.example.employeepayrollsystem.models;

public class Car extends Vehicle{
    private String carModel;


    public Car(String make, String plate, String carModel) {
        super(make, plate);
        this.carModel =carModel;
    }

    
}
