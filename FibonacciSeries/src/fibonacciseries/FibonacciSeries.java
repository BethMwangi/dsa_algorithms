/*
 * The next number is the sum of previous two numbers ,i.e 0,1,1,2,3,5,8,13,21
0+1=1,1+1=2 2+3=5, 3+5=8, 5+8=13.......
 * The first two number of the fibonacci series are 0 and 1.
 * Fibonacci series without using recursion.
 */
package fibonacciseries;


 
public class FibonacciSeries {

    public static void main(String[] args) {
      // declaration of variables to be used
      int num1=0,num2=1,num3,i,count=20;
      System.out.println(+num1+"\n"+num2); // this will print out the 
      //first two numbers of fibonacci series: 0 and 1
      for(i=2;i<count;++i)//the loop starts at 2
      {
    num3 = num1+num2;
    System.out.println(""+num3);
    num1=num2;
    num2=num3;
      }
}}
