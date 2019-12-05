package com.example.employeepayrollsystem.models;

public class PartTime extends Employee {

    private int rate;
    private float hours;
    public PartTime(int id, String name, int age, double earnings, int birthYear) {
        super(id, name, age, earnings, birthYear);
    }

    public int getRate() { return rate; }

    public void setRate(int rate) { this.rate = rate; }

    public float getHours() { return hours; }

    public void setHours(float hours) { this.hours = hours; }
}
