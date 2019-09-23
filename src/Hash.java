import OrderedList;

public class Hash {
	OrderedList[] hashTable;
	int max;
	
	static class Node{
		int data;
		Node next;
		
	Node (int i){
		data=i;
		next=null;
	}
	}
	
	Hash(int m){
		max=m;
		hashTable=new OrderedList[m];
	}
	
	int hashCode(int key) {
		return key%max;
	}
	
	void insert(int key,int hashcode) {
		//Node newNode=new Node(key);
		if (hashTable[hashcode]==null) {
			hashTable[hashcode]=new OrderedList();
			hashTable[hashcode].add(key);
			return;
			}
		boolean result=hashTable[hashcode].search(key);
		if(result==true) {
			hashTable[hashcode].remove(key);
		}else if(result==false) {
			hashTable[hashcode].add(key);
		}
	}
	
	boolean search(int num) {
		int hashcode=hashCode(num);
		if (hashTable[hashcode]==null) {
			return false;
		}else {
			return hashTable[hashcode].search(num);
		}
		/*Node current=hashTable[hashcode];
		while(current!=null) {
			if (current.data==num) {
				return true;
			}
			current=current.next;
		}
		return false;*/
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {77,44,55,26,93,17,31,20,54};
		Hash hash=new Hash(11);
		for (int i=0;i<a.length;i++) {
			int hashcode=hash.hashCode(a[i]);
			hash.insert(a[i],hashcode);
		}
		//hash.insert(77,hash.hashCode(77));
		for (int i=0;i<11;i++) {
			if (hash.hashTable[i]!=null) {
				hash.hashTable[i].printOL();
			}
		}
		//hash.insert(88,hash.hashCode(88));
		//System.out.println("Is the number present : "+hash.search(90));
		}
		//hash.hashTable[0].printOL();
		
	}


