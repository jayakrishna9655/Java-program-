package basic_programs;

class stack{
	
	int top=0;
	int[] arr =new int [4];
	
	public int push(int data) {
		arr[top]=data;
		top++;
		return data;
	}
	
	public void pop() {
		top--;
		arr[top]=0;
	}
	
	public int peek() {
		int data=arr[top-1];
		return data;
	}
	public void show() {
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
}

public class stack_full_functions {

	public static void main(String[] args) {
		
		stack stack=new stack();
		stack.push(10);
		stack.push(8);
		stack.push(5);
		stack.pop();
		System.out.println(stack.peek());
		stack.show();
		
	}
	
}
