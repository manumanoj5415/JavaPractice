package br;

import java.util.*;
public class addingStringNumber {
	
	public static void main(String[] args) {
	
		int lineNumber = 1;

		
		
		System.out.println("enter a number");
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
		String	line = scan.nextLine();
		
			System.out.println(lineNumber + " " + line);
		
			lineNumber++;
		}
		scan.close();
	} 
}