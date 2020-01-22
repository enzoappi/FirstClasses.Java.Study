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
public class Rectangle {
    
    public double width;
    public double height;
    
    public double area() {
        double result = width * height;
        return result;
    }
    
    public double perimeter() {
        double result = (width * 2) + (height * 2);
        return result;
    }
    
    public double diagonal() {
        double result = Math.sqrt((width * width) + (height * height));
        return result;
    }
    
    public String toString() {
        return "AREA: " + String.format("%.2f", area())
            + "\nPERIMETER: " + String.format("%.2f", perimeter())
            + "\nDIAGONAL: " + String.format("%.2f", diagonal());
                
    }
    
}
