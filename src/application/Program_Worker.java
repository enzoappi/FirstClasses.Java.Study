/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ut2u
 */
public class Program_Worker {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Worker> list = new ArrayList<>();
        
        //Inputing Data
        System.out.print("How many workers will be registered? ");
        int e = sc.nextInt();
        
        for(int i = 0; i < e; i++) {
            System.out.println();
            System.out.println("Worker #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Worker(id, name, salary));
        }
        
        //Updating Data
        Worker work = new Worker();
        do {
            if(work == null) {
                System.out.println("This worker doesn't exist!");
            }
            System.out.println();
            System.out.print("Enter the worker id that have salary increase: ");
            int id = sc.nextInt();
            work = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        } while(work == null);
        System.out.println();
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();
        work.increaseSalary(percentage);
        
        
        //Printing the workers list
        System.out.println();
        System.out.println("Workers list: ");
        list.stream().forEach(w -> System.out.println(w));

        sc.close();
    }
    
}
