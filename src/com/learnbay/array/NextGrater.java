package com.akash.array;

public class NextGrater

{
	
	
	
	
	private static void printNextGreater(int a[]) {
		for (int i=0;i<a.length; i++) {
			int num=a[i];
			int greater =-1;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>num) {
					greater =a[j];
					break;
				}
			}
			
			System.out.println(num +" -> "+greater);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 5, 2, 25, 7, 32, 8, 6};
		printNextGreater(a);
		
	}
}