package com.example.employeepayrollsystem.models;

import java.util.ArrayList;
import java.util.List;

public class Singleton {
    static Singleton singletonObj;
    List<Employee> employees;
    private Singleton(){
        employees = new ArrayList<>();
        //create objects of employee classes here
     CommissionbasedPartTime emp_cp = new CommissionbasedPartTime(1, "preet", 20, 1000.50, 1993, )

    }
    //to add employee objects to list
    public void addtoList(Employee emp)
    {
        employees.add(emp);

    }
    public ArrayList<Employee> getList()
    {
        return  ((ArrayList<Employee>)this.employees);
    }
}
