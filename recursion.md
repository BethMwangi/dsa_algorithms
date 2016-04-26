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

