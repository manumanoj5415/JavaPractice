package br;

public class LargestInFactorial {

	public static void main (String[]args) {
		
		int n1= 22   , n2 = 26 ,n3 = 89 ,largest;
		
		largest =  (n1 > n2 && n1 > n3)?  n1: (n2 > n1 && n2 > n3)? n2 : n3;
		System.out.println(largest);
		}
	
	
}
