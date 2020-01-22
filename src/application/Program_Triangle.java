/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
/**
 *
 * @author ut2u
 */
import java.util.Scanner;
import entities.Triangle;
public class Program_Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        
        double areaX = x.area();
        double areaY = y.area();

        
        System.out.printf("\nTriangle X area: %.4f%n", areaX);
        System.out.printf("\nTriangle Y area: %.4f%n", areaY);
        
        if(areaX > areaY){
            System.out.println("Bigger area --> Triangulo X");
        }
        else{
            System.out.println("\nBigger area --> Triangulo Y");
        }
        
        sc.close();
    }
    
}
