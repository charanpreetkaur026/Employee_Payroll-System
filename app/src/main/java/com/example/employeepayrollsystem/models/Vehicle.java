package com.example.employeepayrollsystem.models;

public abstract class Vehicle
{
    private String make;
    private String plate;
    private String model;

    public Vehicle(String make, String plate, String model)
    {
        this.make = make;
        this.plate = plate;
         this.model=  model;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
