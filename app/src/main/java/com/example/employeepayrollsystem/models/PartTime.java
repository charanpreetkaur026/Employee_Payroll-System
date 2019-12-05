package com.example.employeepayrollsystem.models;

public class PartTime extends Employee {

    private int rate;
    private float hoursWorked;
    public PartTime(int id, String name, int age, double earnings, int birthYear,Vehicle vehicle, int rate, float hoursWorked) {
        super(id, name, age, earnings, birthYear, vehicle);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public int getRate() { return rate; }

    public void setRate(int rate) { this.rate = rate; }

    public float getHours() { return hoursWorked; }

    public void setHours(float hours) { this.hoursWorked = hours; }
}
