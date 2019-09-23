
public class BalancedParanth {
	
	static class Stack {
		static final int MAX=100;
		char[] a=new char[MAX];
		int top;
		
		Stack() {
			top=-1;
		}
		void push(char ch) {
			if (top<99) {
			a[++top]=ch;
			}
		}
		
		char pop() {
			if(top>=0) {
			return a[top--];
			}
			return ' ';
		} 
		
		char peek() {
			if (top>=0) {
				return a[top];
			}
			return ' ';
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
	}
	
	static boolean isMatching(char ch1,char ch2) {
		//Stack stk=new Stack();
		if (ch1== '(' && ch2==')') {
			return true;
		}
		if (ch1=='{' && ch2== '}') {
			return true;
		}
		if (ch1=='[' && ch2==']') {
			return true;
		}
		return false;
	}
	
	static boolean areParantesisBalanced(char[] ch) {
		Stack s=new Stack();
	
		for (int i=0;i<ch.length;i++) {
			if (ch[i]=='(' || ch[i]=='{' || ch[i]=='[' ) {
				s.push(ch[i]);
				break;
		}
			if (ch[i]==')' || ch[i]=='}' || ch[i]==']' ) {
				if (s.isEmpty()) {
					return false;
				}else if(!isMatching(s.pop(),ch[i])) {
					return false;
				}
			}
	}
		if (s.isEmpty()) {
			return true;
		}else {
		return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="()]{}{[()()]()}";
		char[] ch=s.toCharArray();		
		if(areParantesisBalanced(ch)) {
			System.out.println("Balanced");
		}else {
			System.out.println("not Balanced");
		}
		
	}

}
