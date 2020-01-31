package com.akash.array;

public class IntCon
{
	
	private static int charToInt(String s) {
		char ZERO='0';
		int result=0;
		boolean negative =false;
		
		if(s.charAt(0)=='-') {
			negative=true;
			s=s.substring(1);
		}else if(s.charAt(0)=='+') {
			s=s.substring(1);
		}
		
		for(char c:s.toCharArray()){
			int temp=0;
			
			
			temp=c-ZERO;
			
			if(temp>0&&temp<10) {
				
				result=result*10+temp;
			}
			else {
				if(negative) {
					result=result*-1;
				}
				return result;
			}
			
		}
		if(negative) {
			result=result*-1;
		}
		
		
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="+349A756";
		
		int result=charToInt(s);
		
		System.out.println("result::"+result);
	}
	
	
	}