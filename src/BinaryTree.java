import java.util.Queue;
import java.util.Stack; 
import java.util.LinkedList; 

public class BinaryTree {
	Node root;
	static int preIndex=0;
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int n){
			data=n;
		}
	}
	
     void inorder(Node root) {
    	 if (root==null) {
    		 return;
    	 }
    	 inorder(root.left);
    	 System.out.print(root.data+" ");
    	 inorder(root.right);
     }
     
     void preorder(Node root) {
    	 if (root==null) {
    		 return;
    	 }
    	 System.out.print(root.data+" ");
    	 preorder(root.left);
    	 preorder(root.right);
     }
     
     void postorder(Node root) {
    	 if (root==null) {
    		 return;
    	 }
    	 //System.out.print(root.data+" ");
    	 postorder(root.left);
    	 postorder(root.right);
    	 System.out.print(root.data+" ");
     }
     
     //Level order traversal
     void levelOrderTraversal(Node root) {
    	 int h=height(root);
    	 for (int i=1;i<=h;i++) {
    		 printGivenLevel(root,i);
    	 }
     }
     
     
     void printGivenLevel (Node root ,int level) 
     { 
         if(root == null) {
        	 return;
         } 
         if (level == 1) {
        	 System.out.print(root.data+" ");
         }else if(level>1) {
        	 printGivenLevel(root.left,level-1);
        	 printGivenLevel(root.right,level-1);
         }
     }
     
     int height(Node root) {
    	 if (root==null) {
    		 return 0;
    	 }
    	 /* compute  height of each subtree */
    	 int lheight=height(root.left);
    	 int rheight=height(root.right);
    	 
    	 /* use the larger one */
    	 if (lheight>rheight) {
    		 return lheight+1;
    	 }else {
    		 return rheight+1;
    	 }
     }
	
    /* Node insert(Node root,int n) {
    	Node newNode = new Node(n);
    	if (root==null) {
    		return null;
    	}
    	 if (root.left==null) {
    		 root.left=newNode;
    		 return root.left;
    	 }
    	 if (root.right==null) {
    		 root.right=newNode;
    		 return root.right;
    	 }
    	 return null;
     }
     
     Node checkNode(Node root,int level,int n) {
    	 if(root == null) {
        	 return null;
         } 
         if (level == 1) {
        	return insert(root,n);
         }else if(level>1) {
        	 Node lnode=checkNode(root.left,level-1,n);
        	 if (lnode!= null) {
        		 return null;
        	 }
        	 Node rnode=checkNode(root.right,level-1,n);
         }
         return null;
     }
     
     void insertInLevelOrder(Node root,int n) {
    	 int level=height(root);
    	 for (int i=1;i<=level;i++) {
    		 checkNode(root,i,n);
    	 }
     }*/
     
     //level order traversal using queue
     void levelOrderQueue(Node root) {
    	 Queue<Node> q=new LinkedList<Node>();
    	 if (root==null) {
    		 return;
    	 }
    	 Node current=root;
    	 q.add(current);
    	 while(!q.isEmpty()) {
    		 current=q.remove();
    		 System.out.print(current.data+" ");
    		 if(current.left!=null) {
    			 q.add(current.left);
    		 }
    		 if(current.right!=null) {
    			 q.add(current.right);
    		 }
    	 }
    	 System.out.println();
     }
     
     //binary tree insertion
     void insertUsingQueue(int n) {
    	 Queue<Node> q=new LinkedList<Node>();
    	 Node newNode=new Node(n);
    	 if (root==null) {
    		 root=newNode;
    		 return;
    	 }
    	 q.add(root);
    	 while(!q.isEmpty()) {
    		 //System.out.print(current.data+" ");
    		 Node current=q.remove();
    		 
    		 if (current.left==null){
    			 current.left=newNode;
    			 return;
    		 }
    		 if (current.right==null){
    			 current.right=newNode;
    			 return;
    		 }
    		 q.add(current.left);
    		 q.add(current.right);
    	 }
 
     }
     
     Node rightMostNode(Node root) {
    	 Queue<Node> q=new LinkedList<Node>();
    	 q.add(root);
    	 while(!q.isEmpty()) {
    		 Node current=q.remove();
    		 if (current.right==null && current.left==null){
    			 return current;
    		 }
    		 if (current.right!=null) {
    			 q.add(current.right);
    		 }
    		 if (current.left!=null) {
    			 q.add(current.left);
    		 }
    	 }
    	 return null;
     }
     
     void replaceNode(Node root,int key,Node lastNode) {
    	 Queue<Node> q=new LinkedList<Node>();
    	 Node current=root;
    	 q.add(current);
    	 while(!q.isEmpty()) {
    		 current=q.remove();
    		 if (current.data==key) {
    			 current.data=lastNode.data;
    			 return;
    		 }
    		 if(current.left!=null) {
    			 q.add(current.left);
    		 }
    		 if(current.right!=null) {
    			 q.add(current.right);
    		 }
    	 }
     } 
     
     void inorderStack(Node root) {
    	 Stack<Node> s=new Stack<Node>();
    	 Node current=root;
    	 while (current!=null || s.size()>0) {
    	    while(current!=null ) {
    		   s.push(current);
    		   current=current.left;
    	 }
    	    Node poppedNode=s.pop();
    	    System.out.print(poppedNode.data+" ");
    	    current=poppedNode.right;
    	 }
    	 System.out.println();
     }
     
    void reverseLevelOrder() {
    	Stack<Node> s=new Stack<Node>();
    	Queue<Node> q=new LinkedList<Node>();
    	if (root == null) {
    		return;
    	}
    	q.add(root);
    	s.push(root);
    	while(!q.isEmpty()) {  //add elements to stack using queue
    		Node current=q.remove();
    		if (current.left!=null) {
    			q.add(current.left);
    	    	s.push(current.left);
    		}
    		if (current.right!=null) {
    			q.add(current.right);
    	    	s.push(current.right);
    		}
    	}
    	while(!s.isEmpty()) {
    		Node temp=s.pop();
    		System.out.print(temp.data+" ");
    	}
    	System.out.println();
    } 
    
    int search(int[] a,int startIndex,int endIndex,int x) {
		for (int i=startIndex;i<endIndex;i++) {
			if(a[i]==x) {
				return i;
			}
		}
		return -1;
	}
	
    // build tree using inorder and preorder
	Node buildTree(int[] in,int[] pre,int startIndex,int endIndex) {
		//int index=0;
		if (startIndex>endIndex) {
			return null;
		}
		
		Node root=new Node(pre[preIndex++]);
		
		if(startIndex==endIndex) {
			return root;
		}
		
		int inIndex=search(in,startIndex,endIndex,root.data);
		
		
		root.left=buildTree(in,pre,startIndex,inIndex-1);
		root.right=buildTree(in,pre,inIndex+1,endIndex);
		
		return root;
	}
	
	Node buildTree2(int[] a,int index,Node root) {  //build tree using level order
		if(index>=a.length) {
			return null;
		}
		root=new Node(a[index]);
		
		root.left=buildTree2(a,2*index+1,root.left);
		root.right=buildTree2(a,2*index+2,root.right);
		
		return root;
	}
	
	/*public Node insertLevelOrder(int[] arr, Node root, 
            int i) 
	{ 
		// Base case for recursion 
		if (i < arr.length) { 
			Node temp = new Node(arr[i]); 
			root = temp; 

			// insert left child 
			root.left = insertLevelOrder(arr, root.left, 
											2 * i + 1); 

			// insert right child 
			root.right = insertLevelOrder(arr, root.right, 
												2 * i + 2); 
		} 
		return root; 
	}*/
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt=new BinaryTree();
		//bt.root=null;
		//bt.root=new Node(1);
		/*bt.root.left=new Node(2);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(5);
		bt.root.right=new Node(3);
		bt.root.right.left=new Node(6);
		bt.root.right.right=new Node(7);*/
		
		bt.insertUsingQueue(1);
		bt.insertUsingQueue(2);
		bt.insertUsingQueue(3);
		bt.insertUsingQueue(4);
		bt.insertUsingQueue(5);
		bt.insertUsingQueue(6);
		bt.insertUsingQueue(7);
		bt.insertUsingQueue(8);
		
		/*int[] in= {4,2,5,1,6,3,7};
		int[] pre= {1,2,4,5,3,6,7};
		//int[] level= {7,6,5,4,3,2,1};
	  //  System.out.println("The last number is : "+result.data);
		bt.root=bt.buildTree(in,pre,0,in.length-1);*/
		
		bt.levelOrderQueue(bt.root);
		
	}

}
