package com.example.employeepayrollsystem.models;

public class Intern extends Employee
{
    private String schoolname;
    private  double internSalary;

    public Intern(int id, String name, int birthYear,String schoolname, double internSalary, Vehicle vehicle) {
        super(id, name, birthYear, vehicle);
        this.schoolname = schoolname;
        this.internSalary = internSalary;
    }


    public String getSchoolname()
    {
        return schoolname;
    }

    public void setSchoolname(String schoolname)
    {
        this.schoolname = schoolname;
    }

    public double getInternSalary() {
        return internSalary;
    }

    public void setInternSalary(double internSalary) {
        this.internSalary = internSalary;
    }

    @Override
    public double calcEarning() {
        return this.internSalary;
    }
}
