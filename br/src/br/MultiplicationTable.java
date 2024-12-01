package br;

public class MultiplicationTable {

	public static void main (String[] args) {
		
		int num=5 ;
		int multiplictiona , result ;
		
		for( multiplictiona = 1; multiplictiona <= 10 ;multiplictiona++ ) {
		
		result = num *multiplictiona;
		
		
		System.out.printf( "%d * %d = %d \n ", num , multiplictiona, result);
		}
		
	}
	 
}
