package br;

import java.util.Scanner;

public class Radious {
	
	public static void main (String[] args) {
		
		double area , radious ;
		
		Scanner sacn = new Scanner(System.in);
		
		System.out.println("plz enter a number");
		
		radious = sacn.nextDouble();
		sacn.close();
		
		area = Math.PI * Math.pow(radious, 2);
		
		System.out.println(" radious of cercle area is now " + area);
		
		
	}
	

}
