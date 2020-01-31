package com.akash.stack;


public class ReverseStack {
	
	public static void main(String args[]) {
		
		IstackImpl stack=new IstackImpl(10);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(5);
		stack.push(4);
		stack.push(7);
		
		stack=reverseStack(stack);
		
		stack.print();
		
	}
	
	private static IstackImpl reverseStack(IstackImpl stack) {
		
		int num=0;
		if(!stack.isEmpty()) {
		 num=stack.pop();
		
		reverseStack(stack);
		}else {
			return stack;
		}
		
		
		reverseStackNew(stack,num);
		
		
		return stack;
		
	}

	private static IstackImpl reverseStackNew(IstackImpl stack, int newNum) {
		// TODO Auto-generated method stub

		int num=0;
		if(!stack.isEmpty()) {
		 num=stack.pop();
		
		 reverseStackNew(stack, newNum); 
		 stack.push(num);
		}else {
			 stack.push(newNum);
			 return stack;
		}
		return stack;
		
	}
