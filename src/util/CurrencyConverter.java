/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author ut2u
 */
public class CurrencyConverter {
    public static double TAX = 0.06;
    
    public static double converter(double price, double amountCurrency) {
        double result = ((price * amountCurrency) + ((price * amountCurrency) * TAX));
        return result;
    }
}
