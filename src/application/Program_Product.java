/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ut2u
 */
public class Program_Product {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: U$");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        System.out.println("\nProduct data: " + product.toString()); //poderia usar somente o product diretamente, ao inves do porduct.toString()
        //System.out.println(product.name + " , U$" + product.price + " , " + product.quantity);
        
        System.out.print("\nEnter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());
        
        System.out.println("\nUpdated data: " + product);
        
        System.out.print("\nEnter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());
        
        System.out.println("\nUpdated data: " + product);
        
        sc.close();
    }
    
}
