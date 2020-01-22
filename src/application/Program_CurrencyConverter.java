/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

/**
 *
 * @author ut2u
 */
public class Program_CurrencyConverter {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nWhat is th dollar price? U$");
        double price = sc.nextDouble();
        System.out.print("How many dollars will be bought? U$");
        double amountCurrency = sc.nextDouble();
        
        double amountPaid = CurrencyConverter.converter(price, amountCurrency);
        System.out.printf("Amount to be paid in Brazilian Reais = R$%.2f%n", amountPaid);
        
    }
}
