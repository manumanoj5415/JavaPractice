package br;

import java.util.Scanner;

public class EvenNumber {
   
public static void main (String[] args) {
	int number , remainder ;
	
	System.out.println("enter a number");
	 Scanner scan = new Scanner(System.in);
	 number = scan.nextInt();
	 scan.close();
	 
	 remainder = number % 2;
	 
	 if (remainder == 0 ) {
		 System.out.println( number + " its even");
	 }
	 else 
		 System.out.println( number +"  itz odd"  );
	 
}
}

