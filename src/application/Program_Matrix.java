/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ut2u
 */
public class Program_Matrix {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //Inputing matrix size (l and c)
        System.out.print("Enter the number of lines (l) of the matrix: ");
        int l = sc.nextInt();
        System.out.print("Enter the number of columns (c) of the matrix: ");
        int c = sc.nextInt();
        
        //Initiating the matrix
        int[][] matrix = new int[l][c];
        
        System.out.println("\n--------------------\n");
        
        //Adding numbers to the matrix
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < c; j++) {
                System.out.printf("Enter a number for the element [%d][%d] of the matrix: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
            
        //Printing out the matrix
        System.out.println("\nMatrix created:\n");    
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < c; j++) {
                System.out.printf(" %d  ", matrix[i][j]);
            }
            System.out.println();
        }
        
        //Tests
        System.out.println("\n--------------------\n");
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < c; j++) {
                if(matrix[i][j] == x) {
                    System.out.printf("\nPosition [%d][%d]:\n", i, j);
                    if(j > 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if(i > 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if(j < (c - 1)) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if(i < (l - 1)) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }           
        sc.close();
    }  
}
