package com.example.employeepayrollsystem.models;

public class FixedBasedPartTime extends PartTime {

    private double fixedAmount;

    public FixedBasedPartTime(int id, String name, int birthYear, float rate, float hoursWorked,double fixedAmount, Vehicle vehicle) {
        super(id, name, birthYear, rate, hoursWorked, vehicle);
        this.fixedAmount = fixedAmount;
    }


    public double getFixedAmount() { return fixedAmount; }

    public void setFixedAmount(float fixedAmount) { this.fixedAmount = fixedAmount; }
//    public String getEmpType(){
//        return empType;
//    }
    public double calFixedAmountEarning()
    {
        double earn = this.getHours() * this.getRate();
        return this.getFixedAmount() + earn;
    }
}
