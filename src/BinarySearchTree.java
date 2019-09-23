//import BinaryTree.Node;

public class BinarySearchTree {
	Node root;
	
	BinarySearchTree(){
		root=null;
	}
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int n){
			data=n;
			left=null;
			right=null;
		}
	}
	
	boolean search(Node root,int i) {
		if(root==null) {
			return false;
		}
		if(root.data==i) {
			return true;
		}
		if (i>root.data) {
			return search(root.right,i);
		}else {
			return search(root.left,i);
		}
	}
	
	/*void insert(int key) {
		insertRec(root,key);
	}
	
	void insertRec(Node root,int key) {
		Node newNode=new Node(key);
		if (root==null) {
			root=newNode;
			return;
		}
		if (key<root.data) {
			if(root.left==null) {
				root.left=newNode;
				return;
			}
			insertRec(root.left,key);
		}
		if (key>root.data) {
			if(root.right==null) {
				root.right=newNode;
				return;
			}
			insertRec(root.right,key);
		}
		
	}*/
	
	void insert(int key) { 
	       root = insertRec(root, key); 
	    } 
	      
	    //A recursive function to insert a new key in BST 
	  /*  Node insertRec(Node root, int key) { 
	  
	        //If the tree is empty, return a new node 
	        if (root == null) { 
	            root = new Node(key); 
	            return root; 
	        } 
	  
	        // Otherwise, recur down the tree 
	        if (key < root.data) 
	            root.left = insertRec(root.left, key); 
	        else if (key > root.data) 
	            root.right = insertRec(root.right, key); 
	  
	        //return the (unchanged) node pointer 
	       
	       return root; 
	    }*/
	
	   
	void inorder(Node root) {
		if (root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree();
		//bst.root=new Node(50);
		/*bst.root.left=new Node(3);
		bst.root.right=new Node(7);
		bst.root.left.left=new Node(2);
		bst.root.left.right=new Node(4);
		bst.root.right.left=new Node(6);
		bst.root.right.right=new Node(8);*/
		//bst.insertRec(bst.root,50);
		bst.insert(30);
		//bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(80);
		
		
		//bst.insert(bst.root, 9);
		bst.inorder(bst.root);
		
		//System.out.println(bst.search(bst.root,8));
	}

}
