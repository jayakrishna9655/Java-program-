package basic_programs;

class stack{
	
	int top=0;
	int capacity=2;
	int[] arr =new int [capacity];
	
	public int push(int data) {
		if(this.size()==capacity) {
			this.expand();
		}
		arr[top]=data;
		top++;
		return data;
	}
	
	public void expand() {
		int length = this.size();
		int[] newstack = new int [capacity *2];
		System.arraycopy(arr, 0, newstack, 0, length);
		arr = newstack;
		capacity *=2;
		}
	
	public void pop() {
		top--;
		arr[top]=0;
		this.shrink();
	}
	
	public void shrink() {
		int length = this.size();
		if(length <= (capacity /2)/2) {
			capacity = capacity /2;
		}
			int[] newstack = new int [capacity];
			System.arraycopy(arr, 0, newstack, 0, length);
			arr = newstack;
		
	}
	
	public int peek() {
		int data=arr[top-1];
		return data;
	}
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		if(top == 0) {
			return true;
		}
		return false;
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
		stack.push(5);
		stack.push(5);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
//		System.out.println(stack.peek());
		stack.show();
		
	}
	
}
