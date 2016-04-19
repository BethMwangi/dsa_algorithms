/*
 * How to find the GCD of two numbers using Euclid's algorithm
 * First, take the largest number int a that should divide the second number int b
 * and open the template in the editor.***/


package gcd;
import java.util.Scanner;


public class GCD {
 public static int GCD(int a, int b){
     if(b==0) {
        
     return a;
 }
     return GCD(b, a % b);
  
 }
   
    public static void main(String[] args) {
       //Enter the two numbers to calculate the GCD
      Scanner scanner = new Scanner(System.in); 
     System.out.println ( "Please enter the first number:" );
        int a=scanner.nextInt();
        System.out.println ("Please enter the second number");
                int b=scanner.nextInt();
               System.out.println("The GCD of the two numbers" + int a + "and" + int b +"results to:" + GCD(int a,int b));
    }};
    

    
    

