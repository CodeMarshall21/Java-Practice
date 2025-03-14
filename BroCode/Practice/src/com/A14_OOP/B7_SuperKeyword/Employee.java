package com.A14_OOP.B7_SuperKeyword;

public class Employee extends Person{
    int salary;

    Employee(String fname, String lname, int money ){
        super(fname,lname);
        this.salary = money;
    }

    void salaryIs(){
        System.out.println("Salary is: "+this.salary);
    }
}
