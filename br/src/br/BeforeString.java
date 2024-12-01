package br;
import java.util.*;
public class BeforeString {
	
	public static void main (String[] args) {
		
		int Linenumber = 1;
		String line ;
		
		System.out.println("enter a name");
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			
		line= scan.nextLine();
		System.out.println(Linenumber + " " + line);
		
		Linenumber++;
		}
		
	}

}
