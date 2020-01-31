package com.akash.array;

public class FlipBits
{
	
	
	private static int invertNum(int num) {
		
	
		int count =0;
		int temp=num;
		while(temp >0) {
			temp =	temp >> 1;
		count ++;
		}
		
		
		for(int i=0;i<count; i++) {
			
			num= num^ (1 << i);
		}
		
		return num;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1<<0);
		System.out.println(invertNum(11));
	}
	
}