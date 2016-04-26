###Recursion
Recursion is a process where a function calls itself.In programing the recursion technique is important for computational applications like sorting, combinatorial searches. 

***Example  of recursion in C Programming***


'''c 
void recursion() {
   recursion(); /* function calls itself */
}

int main() {
   recursion();
}
'''


 From the above program, the function recursion calls itself 
 
 
 Recursion can be used to calculate mathematical computations like the **Fibonacci series** and the **Factorial series**

*Every recursion should have the following characteristics.*

  * A simple base case which we have a solution for and a return value.
  * A way of getting our problem closer to the base case. I.e. a way to chop out part of the problem to get a somewhat simpler problem.
  * A recursive call which passes the simpler problem back into the method.
  
  *Implementing Recursion in a Factorial function.*
 Let's say for positive integer N, the factorial method is:
 N!=N * (N-1) * (N-2) * ......* 2 * 1
 
 One can use the recursion while finding the factorial for a positive N;
  ''' java
  public static int factorial (int N) {
            if(N==1) 
            return 1;
            else {
            return N * factorial (N-1) ;
     }}
'''


  *Fibonacci series using rercusion.*
  In Fibonacci series, the next number is as a result of the sum of the previous 2 numbers, i.e, 0,1,1,2,3,5,8,13
  0 and 1 are the first two numbers in a Fibonacci series.
   The code below shows recursion
   
   '''java 
   class FibonacciSeries {
   static int num1=0, num2=1, num3=0;
   static void PrintFibonacci(int Count) {
   
     if (Count>0){
     num3=num1+num2;
     num1=num2;
     num2=num3;
    System.out.print("" +num3);
      printFibonacci(Count-1)
     }
     }
     public static void main (String[]args) {
     int Count=10;
     System.out.print(num1 +" "+ num2);// prints 0 and 1
     printFibonacci(Count-2) // The num is 2 because the first two numbers have been printed
     }
   
   
   
   
   }
            
            
