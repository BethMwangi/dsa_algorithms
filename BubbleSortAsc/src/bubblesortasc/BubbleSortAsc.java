/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortasc;


import java.util.Arrays;


public class BubbleSortAsc {

    public static void main(String[] args) {
        int [] arraylist={9,3,5,2,4,7};
   
        System.out.println("The final result is:" + Arrays.toString(BubbleSortAsceMethod(arraylist)));
        // TODO code application logic here
    }
    public static int [] BubbleSortAsceMethod(int[]arr)
    
    {
    
    int temp;
    for (int i=0; i<arr.length-1; i++) {
        for (int j=1; j<arr.length-i; j++){
            if (arr[j-1]>arr[j]) {
                temp= arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            
            }}
        
       System.out.println((i+1) + "nth iteration result:" + Arrays.toString(arr));
    }
return arr;
} }
    
    

