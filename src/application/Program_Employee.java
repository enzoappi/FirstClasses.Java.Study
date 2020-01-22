/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ut2u
 */
public class Program_Employee {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Employee employee = new Employee();
        
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: U$");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: U$");
        employee.tax = sc.nextDouble();
        
        System.out.println("\n" + employee.toString());
        
        System.out.print("\nWhich percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());
        
        sc.close();
    }
    
}
