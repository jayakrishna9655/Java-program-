package basic_programs;

class queueFunctions{
	int front;
	int size;
	int rear;
	int[] arr = new int[5];
	
	public void enqueue(int data) {
		if(this.isFull()) {
			System.out.println("this is full");
			return;
		}
		arr[rear]=data;
		rear++;
		rear= rear %5;
		size++;
	}
	
	public void dequeue() {
		if(this.isFull()==false) {
			System.out.println("it is empty");
			return;
		}
		front++;
		front= front %5;
		size--;
	}
	
	public void show() {
		for(int i=0;i<size;i++) {
			System.out.println(arr[(front+i)%5]);
		}
	}
	
	
	
	public boolean isFull() {
		if(size == 5) {
			return true;
		}
		return false;
	}
}

public class queue {

	public static void main(String[] args) {
		queueFunctions queue = new queueFunctions();
		queue.enqueue(5);
		queue.enqueue(4);
		queue.enqueue(3);
		queue.enqueue(2);
		queue.enqueue(1);
		queue.dequeue();
		queue.enqueue(0);
		queue.enqueue(0);
		queue.show();
	}
	
}
