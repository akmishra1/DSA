package com.learnbay.array;



public class PrintDuplicate {

	

	
	public static int findDuplicate(int[] arr) {
	
		int result=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
			return result=arr[i];
					
				}
			}
			
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		 int[] array= {1,3,2,5,6,7,3};
		
		int result=findDuplicate(array);
		System.out.println(result);
			
		}
		
	}
	
	// 
	
	
	
	
	

