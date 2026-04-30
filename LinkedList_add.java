package basic_programs;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList {
    Node head;
    
    public void addFirst(int data) {
    	
    	Node newnode=new Node(data);
    	
    	newnode.next=head;
    	head = newnode;
    	
		
	}
    
    public void addlast(int data) {
    	
    	Node n=new Node(data);
    	if(head==null) {
    		
    		head=n;
    		
    		return;
    		
    	}
    	 Node temp = head;

         while (temp.next != null) {
             temp = temp.next;
         }

         temp.next = n;
		
	}
 public void printList() {
    	
    	Node term=head;
    	
    	while(term != null) {
    		System.out.print(term.data);
    		term= term.next;
    	}
    	System.out.println("null");

    	
		
	}
 
}

// Main class
public class LinkedList_add {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(5);
        list.addlast(15);
        list.printList();
    }
}