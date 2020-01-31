import com.dsa.impl.stack.IstackImpl;



public class PostFix {

	
	
	private static boolean evalPostfix(String[] input) {
		
		
		boolean success=true;
		IstackImpl myStack=new IstackImpl(20);
		for(String curr:input) {
			int num=0;
			boolean isNum=true;
			try {
				//if number
				num= charToInt(curr);
			}catch (Exception e) {
				//else check if operator
				isNum=false;
			}
			
			
			if(isNum) {
				myStack.push(Integer.valueOf(num));
			}else {
				//check and pop last elements from stack
				if(!myStack.isEmpty()) {
					int first=myStack.pop();
					//check and pop second last elements from stack
					if(!myStack.isEmpty()) {
						int second=myStack.pop();
						int result=0;
						switch(curr) {
						case "*":
							result=second * first;
						      break;
						case "/":
							result=second / first;
						      break; 
						      
						case "+":
							result=second + first;
							break;
						case "-":
							result=second - first;
							break;
						case "^":
							result=second ^ first;
							break;
						
						 default:
							 success=false;
						}
						
						if(success) {
							//push result to stack
							myStack.push(result);
						}
					}else {
						success=false;
					}
				}else {
					success=false;
				}
			}
		}
		
		if(success) {
			System.out.println("reslut::"+myStack.peek());
		}
			
		
		return success;
		
		
	}
	
	
	
//	check if input is number 
//	throw number format exception if not
	private static int charToInt(String s) {
		char ZERO='0';
		int result=0;
		boolean negative =false;
		
		
		
		for(char c:s.toCharArray()){
			int temp=0;
			
			
			temp=c-ZERO;
			
			if(temp>=0&&temp<10) {
				
				result=result*10+temp;
			}
			else {
				throw new NumberFormatException();
			}
			
		}
		if(negative) {
			result=result*-1;
		}
		
		
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="5 10 2 * + 3 -";
		
		String[] input=s.split(" ");
		
		boolean test= evalPostfix(input);
		
		if(test) {
			System.out.println("not a valid postfix");
		}
	}
	

}