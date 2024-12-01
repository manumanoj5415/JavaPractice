package br;
import java.util.*;
public class FibonicNumber {

	public static void main (String[]args) {
		int number , t1 = 0 ,t2 = 1, nexterm;
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		input.close();
		
		for (int counter = 1; counter <= number; counter++) {
			System.out.printf("%d",t1);
			
			nexterm =t1+t2;
			t1 = t2;
			t2 = nexterm;
		}
		
	}
}
