package br;

public class RevNumber {

	
	public  static void main (String[] args) {
		
		int number = 432;
		int remainder, revNumber = 0;
		
		while(number > 0) {
			remainder = number % 10;
			number = number/10;
			revNumber = revNumber * 10 + remainder ; 
			
		}
		System.out.println(revNumber);
	} 
}
