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
public class StringClass {
    
    public static void main(String[] args){
        //char array[] = new char[5]; //created character array of size 5
        //its not premitivie types 
        //int,float,char,boolean;
        //String is builtin class in java
        //char b = 'A';
        
        String a; //declared variable 'a' of type String
        a = "Hello World!";
        
        System.out.println(a);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter new value for String");
        a = input.nextLine();
        System.out.println("Value from user " + a);  //Shift F6

        a = a.toLowerCase();   // String immutable in java
        System.out.println("a.toLowerCase() " +a);  //Shift F6
        
        a = a.toUpperCase();
        System.out.println("a.toUpperCase() "+a); 
        
        System.out.println("a.charAt(7) " + a.charAt(7));
        
        for(int i = 0; i < a.length(); i++){
            System.out.println("a.charAt("+i+") " +a.charAt(i));
        }
        
        //reverse string
       
    }
    
}
