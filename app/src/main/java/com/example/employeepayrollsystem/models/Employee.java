package com.example.employeepayrollsystem.models;

public abstract class Employee {
    private int id;
    private String name = "";
    private int age;
    double earnings;
    private String birthYear;
    private Vehicle vehicle;



    public Employee(int id, String name, String birthYear, Vehicle vehicle)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.earnings = earnings;
        this.birthYear = birthYear;
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { this.age = age; }

    public double getEarnings() { return earnings; }

    public void setEarnings(double earnings) { this.earnings = earnings; }

    public String getBirthYear() { return birthYear; }

    public void setBirthYear(String birthYear) { this.birthYear = birthYear; }
    public  double calcEarning(){
        return  1000;
    }

}
