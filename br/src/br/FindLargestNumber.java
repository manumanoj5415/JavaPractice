package br;

public class FindLargestNumber {

	public static  void main (String[] args) {
	int num1 = 10 , num2 = 55, num3 = 81, largest ;
	
	if (num1 > num2 &&  num1 > num3 ) {
		largest = num1;
	
	}else if (num2 > num1 && num2 > num3) { 
		largest = num2;
	
	}else {
		largest = num3;
	}
	
	
	System.out.printf ( "%d %d %d  = this is largest %d ", num1, num2, num3,largest);
	
	}
	
}
