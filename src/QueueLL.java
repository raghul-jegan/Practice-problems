//import StackLL.Node;

public class QueueLL {
	Node front,rear;
	
	static class Node{
		int data;
		Node next;
		
	Node (int n){
		data=n;
		next=null;
	}
	}
	
	void enqueue(int n) {
		Node newNode=new Node(n);
		if (front==null) {
			front=rear=newNode;
		}
		rear.next=newNode;
		rear=newNode;
	}
	
	int dequeue() {
		if (front==null) {
			return -1;
		}
		if(front==rear) {
			Node temp=front;
			front=rear=null;
			return temp.data;
		}
		Node temp=front;
		front=temp.next;
		return temp.data;
	}
	
	boolean isEmpty() {
		if (front==null && rear==null) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLL q=new QueueLL();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		System.out.println(q.isEmpty());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());

	}

}
