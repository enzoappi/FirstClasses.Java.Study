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
public class Product {
    
    public String name;
    public double price;
    public int quantity;
    
    public double totalValueInStock() {
        double result = price * quantity;
        return result;
    }
    
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    
    public String toString() {
        return name
            + ", U$"
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: U$"
            + String.format("%.2f", totalValueInStock());
    }
}
