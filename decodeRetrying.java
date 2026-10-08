package basic_programs;

import java.util.Stack;

class SolutionDecodeString {
    public String decodeString(String s) {
    	
    	Stack<String> stack = new Stack<String>();
    	
    	String res="";
    	for(int i =0;i<s.length();i++) {               //3[a2[c]]
    		
    		if(s.charAt(i) != ']') {
    			stack.push(String.valueOf(s.charAt(i)));
    		}
    		else {
    			res="";
    			while(!stack.isEmpty()){
    				
    				if(stack.peek().equals("[")) {
        			    
        			    stack.pop();
        				StringBuffer numsBuf = new StringBuffer();
        				while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
        					
        					numsBuf.insert(0, stack.pop());
        					
        				}
        				
        				String org=res;
        				int n =Integer.parseInt(numsBuf.toString());
        				System.out.println(n);
        				System.out.println(org);
        				for(int j=1;j<n;j++) {
        					res += org;
        				}
        				stack.push(res);
        				break;
        			}
        			else {
        				res = stack.pop() + res;	
        			}
    				
    				
    			}
    			
    		}
    	}
    	
    	String ans="";
    	while(!stack.isEmpty()) {
    		ans = stack.pop() + ans;
    	}
    	System.out.println("ans = "+ans);
		return ans;
    }
}

public class decodeRetrying {

	public static void main(String[] args) {
		
		String s="3[a2[c]]";
		
		SolutionDecodeString sol = new SolutionDecodeString();
		
		sol.decodeString(s);
		
	}
	
}
