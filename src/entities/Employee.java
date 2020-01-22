/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author ut2u
 */
public class Employee {
    
    public String name;
    public double grossSalary;
    public double tax;
    
    public double netSalary() {
        double result = grossSalary - tax;
        return result;
    }
    
    public void increaseSalary(double percentage) {
        System.out.println("\nUpdated Data: " + name + ", U$" + (netSalary() + grossSalary * (percentage / 100.00)));
    }
    
    public String toString() {
        return "Employee: "
             + name
             + ", U$"
             + String.format("%.2f", netSalary());
    }
    
}
