package com.example.employeepayrollsystem.models;

public class PartTime extends Employee {

    private double rate;
    private float hoursWorked;

    public PartTime(int id, String name, String birthYear, double rate, float hoursWorked, Vehicle vehicle) {
        super(id, name, birthYear, vehicle);
        this.rate = rate;
        this.hoursWorked =hoursWorked;
    }


    public double getRate() { return rate; }

    public void setRate(int rate) { this.rate = rate; }

    public float getHours() { return hoursWorked; }

    public void setHours(float hours) { this.hoursWorked = hours; }
}
