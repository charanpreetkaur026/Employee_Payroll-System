package com.example.employeepayrollsystem.models;

public class CommissionbasedPartTime extends  PartTime {

    private double commissionPerc;

    public CommissionbasedPartTime(int id, String name, String birthYear, float rate, float hoursWorked,double commissionPerc, Vehicle vehicle) {
        super(id, name, birthYear, rate, hoursWorked, vehicle);
        this.commissionPerc = commissionPerc;
    }


    public double getCommissionPerc() { return commissionPerc; }

    public void setCommissionPerc(int commissionPerc) { this.commissionPerc = commissionPerc; }


    public  double calcCommissionEarnings(){
        double commissionEarning;
        double earn = (this.getHours()*this.getRate());
        commissionEarning = (this.getCommissionPerc()/100*earn)+earn;
        return  commissionEarning;
    }
}
