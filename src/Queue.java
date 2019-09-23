
public class Queue {
	static final int MAX=100;
	int[] a=new int[MAX];
	int firstIndex;
	int lastIndex;
	
	Queue() {
		firstIndex=0;
		lastIndex=-1;
	}
	boolean isEmpty() {
		return lastIndex-firstIndex<0;
	}
	
	void enqueue(int n) {
		a[++lastIndex]=n;
	}
	
	int dequeue() {
		if (isEmpty()) {
			return 0;
		}
		return a[firstIndex++];
	}
	
	int size() {
		return lastIndex-firstIndex+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println("Befor dequeue.");
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		System.out.println("After dequeue.");
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		
	}

}
