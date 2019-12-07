package com.example.employeepayrollsystem.models;

public class CommissionbasedPartTime extends  PartTime {

    private float commission;

    public float getCommission() { return commission; }

    public void setCommission(int commission) { this.commission = commission; }

    public CommissionbasedPartTime(int id, String name, int age, double earnings, int birthYear, int rate, float hours, float commission,Vehicle vehicle) {
        super(id, name, age, earnings, birthYear,vehicle, rate, hours);
        this.commission = commission;
    }
    public  double calcCommissionEarnings(){
        double commissionEarning;
        double earn = (this.getHours()*this.getRate());
        commissionEarning = (this.getCommission()/100*earn)+earn;
        return  commissionEarning;
    }
}
