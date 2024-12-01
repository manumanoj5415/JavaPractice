package br;

import java.util.Scanner;

public class swing {

	public static void main (String[] args) {
	
		int num1 ,num2 ,temp;
  
		System.out.println("Enter a 1st  number");
		Scanner sacn = new Scanner(System.in);
		num1 = sacn.nextInt();
		
		System.out.println("Enetr a 2nd number");
		num2 = sacn.nextInt();
		
		sacn.close();
		
		System.out.printf("before swapping: num1 = %d and num2 = %d \n", num1 ,num2);
		 
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.printf("after sawpping : num1 = %d and num2 = %d" , num1, num2);
	
	
	
	
	
	}
	
}
