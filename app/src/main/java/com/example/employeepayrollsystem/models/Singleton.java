package com.example.employeepayrollsystem.models;

import java.util.ArrayList;
import java.util.List;

public class Singleton {
    static Singleton singletonObj;
    List<Employee> employees;
    private Singleton(){
        employees = new ArrayList<>();

        //create objects of employee classes here
     CommissionbasedPartTime emp_cp = new CommissionbasedPartTime(1, "Preet", "1994", 14,
             20, 2.5, new Car("Audi", "PB08", "A4"));
     FixedBasedPartTime emp_fp = new FixedBasedPartTime(2, "deep", "2001",14,50, 300, new Motorcycle("Royal Enfield", "PBO9", "Bullet"));
     Intern emp_intern = new Intern(3,"Inder", "2000", "Lambton College in Toronto",1200.50,
             new Motorcycle("abc", "ABC123", "A1B2"));
     FullTime emp_full1 = new FullTime(4, "Camy", "1994", 2500.30, 350,
             new Car("Nissan", "CAMYG", "xyz"));


        addtoList(emp_cp);
        addtoList(emp_fp);
        addtoList(emp_intern);
        addtoList(emp_full1);
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
