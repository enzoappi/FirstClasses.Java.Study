/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ut2u
 */
public class Program_Rectangle {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        
        System.out.println(rectangle.toString());
        
        sc.close();
    }
}
