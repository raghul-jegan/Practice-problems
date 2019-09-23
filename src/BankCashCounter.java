import java.util.Scanner;
public class BankCashCounter {
	
	static class Customer{
		int availBalance;
		
		Customer(int n){
			availBalance=n;
		}
	}
	static final int MAX=100;
	Customer[] a=new Customer[MAX];
	int firstIndex;
	int lastIndex;
	
	BankCashCounter() {
		firstIndex=0;
		lastIndex=-1;
	}
	
	boolean isEmpty() {
		return lastIndex-firstIndex<0;
	}
	
	void enqueue(Customer c) {
		a[++lastIndex]=c;
	}
	
	void doTransaction(Customer c) {
		System.out.println("Enter 1 for deposit 2 for withdrawl");  
		Scanner myObj=new Scanner(System.in);
		int n=myObj.nextInt();
		if (n==1) {    //deposit
			System.out.println("Available balance : "+c.availBalance);
			System.out.println("Enter the amount to be deposited");
			int deposit=myObj.nextInt();
			c.availBalance=c.availBalance+deposit;
			System.out.println("Available balance after deposit : "+c.availBalance);
		}else if (n==2) {   //withdrawl
			System.out.println("Available balance : "+c.availBalance);
			System.out.println("Enter the amount to be withdrawed");
			int withdraw=myObj.nextInt();
			if (withdraw<=c.availBalance) {
				c.availBalance=c.availBalance-withdraw;
				System.out.println("Withdrawl successful");
				System.out.println("Available balance after withdrawl : "+c.availBalance);
			}else {
				System.out.println("Insufficient fund");
			}
		}
	}
	
	void dequeue() {
		if (isEmpty()) {
			System.out.println("the queue is empty");
		}
		doTransaction(a[firstIndex]);
		firstIndex++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankCashCounter q=new BankCashCounter();
		Customer c1=new Customer(1000);
		Customer c2=new Customer(2000);
		q.enqueue(c1);
		q.enqueue(c2);
		q.dequeue();
		q.dequeue();

	}

}
