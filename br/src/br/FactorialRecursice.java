package br;
import java.util.Scanner;
import java.math.BigInteger;
public class FactorialRecursice {

	
     static int factorial(int n ) {
     if(n <= 1)
    	 return 1;
    			 return n * factorial(n-1);
     
     }
	
	public static void main(String[] args) {
		int  number,result;
System.out.println("enter a number");
Scanner scan = new Scanner(System.in);
  number = scan.nextInt();
 scan.close();
 
 result = factorial(number);
 System.out.printf("%d! = %d", number, result);

}
}
	

