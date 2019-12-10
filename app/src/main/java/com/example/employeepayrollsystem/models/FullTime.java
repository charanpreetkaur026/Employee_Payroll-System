package com.example.employeepayrollsystem.models;

public class FullTime extends Employee
{
    private double salary;
    private double bonus;

    public FullTime(int id, String name, int birthYear, double salary, double bonus, Vehicle vehicle) {
        super(id, name, birthYear, vehicle);
        this.salary = salary;
        this.bonus = bonus;
    }


    public double getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(int bonus)
    {
        this.bonus = bonus;
    }

    @Override
    public double calcEarning() {
        return this.getSalary()+this.getBonus();
    }
}
