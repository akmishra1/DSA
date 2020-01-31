package com.akash.array;

public class SwapThreeVar
{
	
	private static int[] swapThree(int a,int b,int c) 
    { 
           int result[]=new int[3];   
       
        a = a + b + c;  
      
       
        b = a - (b + c);  
      
       
        c = a - (b + c);  
      
        
        a = a - (b + c);  
        
        result[0]=a;
        result[1]=b;
        result[2]=c;
        
        return result;
    } 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20; 
		int c=30;
		
		int[] result=swapThree(a, b, c);
		System.out.println("before swap :: a = "+a+ " b = "+b+" c = "+c);
		System.out.println("after swap :: a = "+result[0]+ " b = "+result[1]+" c = "+result[2]);
		
	}
	
}