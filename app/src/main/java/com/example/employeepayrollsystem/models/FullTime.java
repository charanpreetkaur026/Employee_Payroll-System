package com.example.employeepayrollsystem.models;

public class FullTime extends Employee
{
    private int salary;
    private int bonus;

    public FullTime(int salary, int bonus, String name, int age, Vehicle vehicle) {
        super(name,age,vehicle);
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int getBonus()
    {
        return bonus;
    }

    public void setBonus(int bonus)
    {
        this.bonus = bonus;
    }

}
