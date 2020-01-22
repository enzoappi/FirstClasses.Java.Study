/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Room;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ut2u
 */
public class Program_Room {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Room[] room = new Room[10];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Which room (from 1 to 10) do you want to rent? ");
            int r = sc.nextInt();
            if (room[r - 1] == null) {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                room[r - 1] = new Room(name, email);
            } 
            else {
                while (room[r - 1] != null) {
                    System.out.print("\nOps! This room is already occupied!\n\nChoose another room (from 1 to 10) number: ");
                    r = sc.nextInt();
                }
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                room[r - 1] = new Room(name, email);
            }
        }
        
        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < room.length; i++) {
            if(room[i] != null) {
                System.out.println((i + 1) + ": " + room[i].getName() + ", " + room[i].getEmail());
            }
        }
        
        
        
        sc.close();
    }
}
