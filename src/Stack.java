
public class Stack {
	static final int MAX=100;
	int[] a=new int[MAX];
	int top;
	
	Stack() {
		top=-1;
	}
	void push(int n) {
		if (top<MAX) {
		a[++top]=n;
		}
	}
	
	int pop() {
		if(top>=0) {
		return a[top--];
		}
		return -1;
	} 
	
	int peek() {
		if (top>=0) {
			return a[top];
		}
		return -1;
	}
	
	boolean isEmpty() {
		return top<0;
	}
	
	int size() {
		return top+1;
	}
	
	void printStack() {
		if (top>=0) {
			for (int i=0;i<=top;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stk=new Stack();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		stk.push(6);
		stk.printStack();
		
		System.out.println("the peek element is : "+stk.peek());
		System.out.println("pop the last element : "+stk.pop());
		stk.printStack();
	}

}
