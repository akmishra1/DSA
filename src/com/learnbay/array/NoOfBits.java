package com.akash.array;

public class NoOfBits
{
	
public static void main(String[] args) {
		
	    
		System.out.println("no of bits required ::"+getNofOfBits(1023));    
	      
	}
	
	private static int getNofOfBits(int num) {
		int count =0;
		while(num >0) {
			num =	num >> 1;
		count ++;
		}
		
		return count;
		
	}
	
	
	
}