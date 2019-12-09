package com.example.employeepayrollsystem.models;

import java.util.ArrayList;
import java.util.List;

public class Singleton {
    static Singleton singletonObj;
    List<Employee> employees;
    private Singleton(){
        employees = new ArrayList<>();

        //create objects of employee classes here
     CommissionbasedPartTime emp_cp = new CommissionbasedPartTime(1, "preet", 20, 1000.50, 1995,
             16, 20, 150, new Car("Audi", "PB08", "A4"));
     FixedBasedPartTime emp_fp = new FixedBasedPartTime(2, "deep", 21, 1200.30, 1996,
             14, 40, 130, new Motorcycle("Royal Enfield", "PBO9", "Bullet"));
     Intern emp_intern = new Intern("Lambton college in Toronto", 3, "inder", 21,
             new Motorcycle("abc", "ABC123", "A1B2"));


        addtoList(emp_cp);
        addtoList(emp_fp);
        addtoList(emp_intern);
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
    public static Singleton getSingletonObjObj()
    {
        if(singletonObj == null)
        {
            singletonObj = new Singleton();

        }
        return singletonObj;
    }
}
