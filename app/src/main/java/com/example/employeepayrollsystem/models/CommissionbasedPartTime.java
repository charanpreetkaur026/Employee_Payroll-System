package com.example.employeepayrollsystem.models;

public class CommissionbasedPartTime extends  PartTime {

    private float commission;

    public float getCommission() { return commission; }

    public void setCommission(int commission) { this.commission = commission; }


    public  double calcCommissionEarnings(){
        double commissionEarning;
        double earn = (this.getHours()*this.getRate());
        commissionEarning = (this.getCommission()/100*earn)+earn;
        return  commissionEarning;
    }
}
