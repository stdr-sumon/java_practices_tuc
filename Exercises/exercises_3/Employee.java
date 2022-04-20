/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_3;

import java.util.*;
/**
 *
 * @author Sumon
 */
public class Employee {
    private String name;
    private Double salary;
    private Date hireDay;

    public Employee(String name, Double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar gregorianCal = new GregorianCalendar(year, month - 1, day);
        this.hireDay = gregorianCal.getTime();
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    public String getName() {
        return this.name;
    }

    public Double getSalary() {
        return this.salary;
    }
    
    public Date getHireDay() {
        return this.hireDay;
    }
    
    public void raiseSalary (double raisedPercent) {
        this.salary += (this.salary * (raisedPercent/100));
    }
    
}
