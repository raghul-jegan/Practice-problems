import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import LinkedList.Node;

public class OrderedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
	Node (int n){
		data=n;
		next=null;
	}
	}
	public void printOL() {
		if(head==null) {
			System.out.println("Empty");
		}
		Node current=head;
		while(current!=null) {
			System.out.print(current.data + " ");
			current=current.next;
		}
		System.out.println();
	}
	
	public int length() {
		int count=0;
		Node current=head;
		while (current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	public void add(int n) {
		Node newNode =new Node(n);
		if (head==null) {
			head=newNode;
			return;
		}
		if (head.next==null || n<=head.data) {
			if (n<=head.data) {
				Node temp=head;
				head=newNode;
				head.next=temp;
				return;
			}else {
				head.next=newNode;
				return;
			}
		}
		Node prev=head;
		Node current=head.next;
		while(current!=null) {
			if(n<=current.data) {
				Node temp=prev.next;
				prev.next=newNode;
				newNode.next=temp;
				return;
			}
			prev=current;
			current=current.next;
		}
		prev.next=newNode;
		
	}
	
	public boolean search(int n) {
		Node current =head;
		while(current != null) {
			if (current.data == n) {
				return true;
			}
			current=current.next;
		}
		return false;
	}
	
	public void remove(int n) {
		if (head==null) {
			return;
		}
		if (head.next==null && head.data==n) {
			head=null;
			return;
		}
		if (head.data==n) {
			head=head.next;	
		}
		Node prev=head;
		Node current=head.next;
		while(current!=null) {
			if (current.data==n) {
				prev.next=current.next;
				}
			prev=current;
			current=current.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderedList ol=new OrderedList();
		try { 
		      File myFile = new File("test.txt");
		      Scanner reader=new Scanner(myFile);
		      while (reader.hasNextLine()) {
		    	  String line=reader.nextLine();
		    	  String[] a=line.split("\\s");
		    	  for (int i=0;i<a.length;i++) {
		    		  ol.add(Integer.parseInt(a[i]));
		    	    //System.out.println(Integer.parseInt(a[i]));
		    	  }
		    	  //System.out.println(line);
		      }
		      reader.close();
		     
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		System.out.println("Before searching");
		ol.printOL();
		System.out.println("Enter a num");
		Scanner myObj=new Scanner(System.in);
		int num=myObj.nextInt();
		if(ol.search(num)) {
			ol.remove(num);
		}else {
			ol.add(num);
		}
		System.out.println("After searching");
		ol.printOL();
	}

}
