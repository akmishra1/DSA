package com.learnbay.array;



public class PrintDuplicate {

	

	
	public static int findDuplicate(int[] arr) {
	
		int duplicate=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
			return duplicate=arr[i];
					
				}
			}
			
		}
		return duplicate;
	}
	
	
	
	public static void main(String[] args) {
		
		 int[] array= {1,3,2,5,6,7,3};
		
		int dup=findDuplicate(array);
		System.out.println(dup);
			
		}
		
	}
	
	
	
	
	
	

