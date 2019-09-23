import java.util.Scanner;

public class Dequeue {
	static final int MAX=100;
	char[] a=new char[MAX];
	int firstIndex;
	int lastIndex;
	
	Dequeue() {
		firstIndex=0;
		lastIndex=-1;
	}
	boolean isEmpty() {
		return lastIndex-firstIndex<0;
	}
	
	void addRear(char c) {
		a[++lastIndex]=c;
	}
	
	char removeFront() {
		if (isEmpty()) {
			return ' ';
		}
		return a[firstIndex++];
	}
	
	char removeRear() {
		if (isEmpty()) {
			return ' ';
		}
		return a[lastIndex--];
	}
	
	int size() {
		return lastIndex-firstIndex+1;
	}
	
	 boolean isPalindrome() {
		 if (lastIndex-firstIndex<=0) {
			 return true;
		 }
		 if(removeFront()==removeRear()) {
			 return isPalindrome();
		 }
		 return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dequeue dq=new Dequeue();
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=myObj.nextLine();
		for (int i=0;i<s.length();i++) {
			dq.addRear(s.charAt(i));
		}
		System.out.println(dq.isPalindrome());
	}

}
