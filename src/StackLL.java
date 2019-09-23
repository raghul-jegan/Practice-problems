//import LinkedList.Node;

public class StackLL {     //Stack implementation using queue
	Node head;
	
	static class Node{
		int data;
		Node next;
		
	Node (int n){
		data=n;
		next=null;
	}
	}
	
	void push(int n) {
		Node newNode=new Node(n);
		if (head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	int pop() {
		if (head==null) {
			return -1;
		}
		Node temp=head;
		head=head.next;
		return temp.data;
	}
	
	boolean isEmpty() {
		return head==null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLL s=new StackLL();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());

	}

}
