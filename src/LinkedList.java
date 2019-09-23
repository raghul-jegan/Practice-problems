import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LinkedList {
	Node head;
	
	static class Node{
		String data;
		Node next;
		
	Node (String str){
		data=str;
		next=null;
	}
	}
	
	public void add(String str) {
		Node newNode=new Node(str);
		//Node current=head;
		if (head==null) {
			head=newNode;
			return;
		}
		Node current=head;
		while(current.next != null) {
			current=current.next;
		}
		current.next = newNode;
	}
	
	public void remove(String str) {
		if (head == null) {
			return;
		}
		if (head.next==null && head.data.equals(str)) {
			head=null;
			return;
		}
		if (head.data.equals(str)) {
			head=head.next;
			return;
		}
		Node prev=head;
		Node current=head.next;
		while(current != null) {
			if (current.data.equals(str)) {
				prev.next=current.next;
				return;
			}
			prev=current;
			current=current.next;
		}
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
	
	public boolean search(String str) {
		Node current =head;
		while(current != null) {
			if (current.data.equals(str)) {
				return true;
			}
			current=current.next;
		}
		return false;
	}
	
public void printLL() {
	Node current=head;
	while(current!=null) {
		System.out.print(current.data + " ");
		current=current.next;
	}
	System.out.println();
}

   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		/*try { 
		      File myFile = new File("test1.txt");
		      Scanner reader=new Scanner(myFile);
		      while (reader.hasNextLine()) {
		    	  String line=reader.nextLine();
		    	  String[] a=line.split("\\s");
		    	  for (int i=0;i<a.length;i++) {
		    	  ll.add(a[i]);
		    	  }
		      }
		      reader.close();
		     
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		System.out.println("Before searching and insertion");
		ll.printLL();
		System.out.println("Enter a string");
		Scanner myObj= new Scanner(System.in);//user input
		String w=myObj.nextLine();
		String word=w.trim();
		boolean result=ll.search(word);
		//System.out.println("is the word in ll : "+result);
		if (result==true) {      // searching the ll and inserting
			ll.remove(word);
		}else {
			ll.add(word);
		}
		
		System.out.println("After searching and insertion");
		ll.printLL();*/
		/*Node first=ll.head;
		first=new Node("Hello");*/
		//ll.head=new Node("Hello");
		ll.add("Hello");
		ll.printLL();
		
		
		
	}

}
