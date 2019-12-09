package com.example.employeepayrollsystem.models;

public class Intern extends Employee
{
    private String schoolname;

//    public Intern() {
//        super();
//    }



    public Intern( String schoolname, int id,String name, int age , Vehicle vehicle ) {
        super(id,name,age,vehicle);
        this.schoolname = schoolname;
    }

    public String getSchoolname()
    {
        return schoolname;
    }

    public void setSchoolname(String schoolname)
    {
        this.schoolname = schoolname;
    }

}
