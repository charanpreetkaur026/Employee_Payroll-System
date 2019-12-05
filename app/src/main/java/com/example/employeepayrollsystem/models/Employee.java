package com.example.employeepayrollsystem.models;

public abstract class Employee {
    private int id;
    private String name = "";
    private int age;
    double earnings;
    private int birthYear = 0 ;

    public Employee(int id, String name, int age, double earnings, int birthYear) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.earnings = earnings;
        this.birthYear = birthYear;
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

    public int getBirthYear() { return birthYear; }

    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }
}
