/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ut2u
 */
public class Program_Account {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Account Owner's name: ");
        sc.nextLine();
        String ownerName = sc.nextLine();
        
        Account account = new Account(accountNumber, ownerName);
        
        System.out.print("Do you want to make a inicial deposit? [Yes/No] ");
        char answer = sc.next().charAt(0);
        
        if (answer == 'Y' || answer == 'y') {
            
            System.out.print("Initial deposit amount: U$");
            account.setDeposit(sc.nextDouble());
            
        }
        
        System.out.println("\nAccount data: \n" + account.toString());
        
        System.out.print("\nEnter a deposit value: U$");
        account.setDeposit(sc.nextDouble());
        
        System.out.println("Updated account data: \n" + account.toString());
        
        System.out.print("\nEnter a withdraw value: U$");
        account.setWithdraw(sc.nextDouble());
        
        System.out.println("Updated account data: \n" + account.toString());
        
        
        sc.close();
    }
}
