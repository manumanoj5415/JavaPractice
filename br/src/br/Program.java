package br;

import java.util.Scanner;

public class Program {

	
	public static void main (String[] args) {
		int  num1 ,num2 ,result;
  
		System.out.println("Enter a 1st number");
		
		Scanner input = new Scanner(System.in);
		num1 = input.nextInt();
		
		System.out.println("enter a second number ");
		
		num2 = input.nextInt();
		input.close();
		
		result = num1 + num2 ;
		
	
		System.out.printf("%d + %d = %d", num1,num2,result);
	}
	
	
}
