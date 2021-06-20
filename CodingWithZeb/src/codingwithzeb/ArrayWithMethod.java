/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingwithzeb;

import java.util.Scanner;

/**
 *
 * @author Shahzeb_Latif
 */
//Lecture 14
public class ArrayWithMethod { //Methods = functions

    public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        int size;
        
        System.out.println("Enter size of array : ");
        size = input.nextInt();
        
        int array[] = new int[size];
        
        for(int i = 0; i < size; i++){
            System.out.println("Enter "+ (i+1) + " value  : " );
            array[i] = input.nextInt();
        }
        
        System.out.println("Array before calling methods");
        for(int i = 0; i < size; i++){
            System.out.println("Value at "+ i + " is : " + array[i]);
        }
        
        performMultiplication(array);
        
        System.out.println("Array after calling methods");
        for(int i = 0; i < size; i++){
            System.out.println("Value at "+ i + " is : " + array[i]);
        }
    }
    
    
    public static void performMultiplication(int array[]){
        for(int i = 0; i < array.length; i++)
            array[i] = array[i] * 2;
    }
    
}
