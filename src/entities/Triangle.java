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
public class Triangle {
    public double a;
    public double b;
    public double c;

public double area(){
    double p = (a + b + c) / 2.0;
    double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    return result;
}
    
}
