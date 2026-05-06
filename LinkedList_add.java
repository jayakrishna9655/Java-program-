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
    	}
    	else{
    	 Node temp = head;

         while (temp.next != null) {
             temp = temp.next;
         }

         temp.next = n;
    	}
		
	}
    
    public void addAtPosition(int index , int data) {
		if(index ==0) {
			addFirst(data);
			return;
		}
    	Node n = new Node(data); 
    	Node temp=head;
    	for(int i =0;i<index-1;i++) {
    		if(temp==null) {
    			return;
    		}
    		temp=temp.next;
    	}
    	if(temp==null) {
			return;
		}
    	n.next=temp.next;
    	temp.next=n;
    	
	}
    
    public void deleteAt(int index) {
		if(index==0) {
			head = head.next;
		}
		else {
			Node n=head;
			Node n1=null;
			for(int i=0;i<=index-1;i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.println("n1.data"+n1.data);
			this.printList();
		}
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
        list.addlast(25);
        list.addAtPosition(3, 15);
        list.deleteAt(1);
        list.printList();
    }
}