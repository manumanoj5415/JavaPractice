package br;
import java.util.*;
import java.text.*;
import java.io.*;


public class StaticInitialBlockd {

	public static int B,H;
	
	public static  boolean  flag = true;
	static {
	Scanner input = new Scanner(System.in);
	B = input.nextInt();
	H = input.nextInt();
	 input.close();
	  if(B <= 0 || H <= 0) {
		  System.out.println("only positive number");
		  flag = false;
	  }
	}
	
	public static void main (String[] args) {
		if(flag) {
			int area  = B * H ;
			System.out.println(area);
		}
	}
	

}
