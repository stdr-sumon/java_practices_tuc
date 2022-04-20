/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_3;

/**
 *
 * @author Sumon
 */
public class EmployeeTest {
    public static void raiseSalary(Employee[] empArr, double raisePercent) {
        double raisedSalary = 0.0;
        double currentSalary = 0.0; 
        for (Employee employee : empArr) {
//            raisedSalary =  employee.getSalary() * (raisePercent/100);
//            currentSalary = employee.getSalary();
//            employee.setSalary(currentSalary + raisedSalary);
            employee.raiseSalary(raisePercent);
            System.out.println("Name = " + employee.getName());
            System.out.println("New salary = " + employee.getSalary());
            System.out.println("Hired on day: " + employee.getHireDay());
        }
    }
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Carl Cracker", 100.0, 1987, 12, 15);
        Employee e2 = new Employee("Harry Hacker", 200.0, 1989, 10, 01);
        Employee e3 = new Employee("Tony Tester", 300.0, 1990, 03, 15);
        Employee[] empArr = {e1, e2, e3};
        raiseSalary(empArr, 5.0);        
    }
}
