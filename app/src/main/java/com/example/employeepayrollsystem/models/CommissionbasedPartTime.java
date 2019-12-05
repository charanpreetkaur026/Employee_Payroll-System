package com.example.employeepayrollsystem.models;

public class CommissionbasedPartTime extends  PartTime {

    private float commission;

    public float getCommission() { return commission; }

    public void setCommission(int commission) { this.commission = commission; }

    public CommissionbasedPartTime(int id, String name, int age, double earnings, int birthYear,Vehicle vehicle, int rate, float hours, float commission) {
        super(id, name, age, earnings, birthYear,vehicle, rate, hours);
        this.commission = commission;
    }
}