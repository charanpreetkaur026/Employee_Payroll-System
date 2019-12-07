package com.example.employeepayrollsystem.models;

public class FixedBasedPartTime extends PartTime {

    private float fixedAmount;
    public FixedBasedPartTime(int id, String name, int age, double earnings, int birthYear,
                              int rate, float hoursWorked, float fixedamount, Vehicle vehicle) {
        super(id, name, age, earnings, birthYear, vehicle, rate, hoursWorked);
        this.fixedAmount = fixedamount;
    }

    public float getFixedAmount() { return fixedAmount; }

    public void setFixedAmount(float fixedAmount) { this.fixedAmount = fixedAmount; }
    public double calFixedAmountEarning()
    {
        double earn = this.getHours() * this.getRate();
        return this.getFixedAmount() + earn;
    }
}
