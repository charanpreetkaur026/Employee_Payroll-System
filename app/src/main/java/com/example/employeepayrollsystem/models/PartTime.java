package com.example.employeepayrollsystem.models;

public class PartTime extends Employee {

    private float rate;
    private float hoursWorked;

    public PartTime(int id, String name, int birthYear, float rate, float hoursWorked, Vehicle vehicle) {
        super(id, name, birthYear, vehicle);
        this.rate = rate;
        this.hoursWorked =hoursWorked;
    }


    public float getRate() { return rate; }

    public void setRate(int rate) { this.rate = rate; }

    public float getHours() { return hoursWorked; }

    public void setHours(float hours) { this.hoursWorked = hours; }
}
