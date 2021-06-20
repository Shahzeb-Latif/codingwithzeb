/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingwithzeb;

/**
 *
 * @author Shahzeb_Latif
 */
public class BubbleSort {
    public static void main(String []args){
        int array[] = new int[5];
        
        array[0] = 5;
        array[1] = 0;
        array[2] = 2;
        array[3] = 1;
        array[4] = 9;
        int temp = 0;
        System.out.println("Elements of array before sorting");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        
        for(int i = 0; i < 5; i++){
            for(int j = i + 1; j < array.length; j++){
                
                if(array[j] < array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                } 
            }
        }
        
        System.out.println("Elements of array after sorting");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        
        
    }
}
