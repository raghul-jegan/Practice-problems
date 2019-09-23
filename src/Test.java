import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

import BinaryTree.Node;

import java.io.*;

public class Test {
	static boolean isPalindrome(String s) {
		if (s.length()==1 || s.length()==0) {
			return true;
		}
		else if (s.charAt(0) == s.charAt(s.length()-1)) {
			return isPalindrome(s.substring(1,s.length()-1));
		}else {
			return false;
		}
		
	}
	
	static boolean anagram(String s1,String s2) {
		if (s2.length()==s1.length()){
			char[] a1=s1.toCharArray();
			char[] a2=s2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			String str1=new String(a1);
			String str2=new String(a2);
			return str1.equals(str2);
		}
		return false;
		
	}
	
	static void stackPush(Stack<Integer> stack) {
		for (int i=0;i<5;i++) {
			stack.push(i);
		}
	}
	
	static void stackPop(Stack<Integer> stack) {
		int n=stack.size();
		for (int i=0;i<n;i++) {
			Integer y = (Integer) stack.pop();
			System.out.print(y+" ");
			//System.out.print(stack.pop()+" ");
		}
		System.out.println();
	}
	
	static void bubbleSort(int[] a) {
		int swap=0;
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length-1;j++) {
				if (a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swap++;
				}
				if (swap==0) {
					return;
				}
			}
		}
	}
	
	static void selectionSort(int[] a) {
		int minIndex;
		for (int i=0;i<a.length-1;i++) {
			minIndex=i;
			for (int j=i+1;j<a.length;j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
	}
	
	static void insertionSort(int[] a) {
		for (int i=1;i<a.length;i++) {
			for (int j=i-1;j>=0;j--) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					i=i-1;
				/*if(i>=2) {	
					i=i-1;
				}*/
				}
			}
		}                            
	}
	
	static int binarySearch(int[] a,int l,int r,int x) {
		if(r>=l) {
			int mid=(l+r)/2;
			if (a[mid]==x) {
				return mid;
			}
			if(x < a[mid]) {
				return binarySearch(a,l,mid-1,x);
			}
			return binarySearch(a,mid+1,r,x);
		}
		return -1;
	}
	
	static void printArray(int[] a) {
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static void vendingMachine(int amount) {
		String[] a=new String[8];
		int index=0;
		//int amount=5000;
		int[] notes= {1000,500,100,50,10,5,2,1};
		for(int i=0;i<notes.length;i++) {
			if(notes[i]<amount) {
				int noOfNotes=amount/notes[i];
				amount=amount-noOfNotes*notes[i];
				a[index++]=noOfNotes+" "+notes[i]+" rupees notes";
			}
		}
		for (int j=0;j<a.length;j++) {
			if (a[j]!=null) {
				System.out.println(a[j]);
			}
		}
	}
	
	static void monthlyPayment(int P,int Y,double R) {
		int n=12*Y;
		double r=R/(12*100);
		double payment=(P*r)/(1-Math.pow((1+r),-n));
		System.out.println((float)payment);
	}
	
	static String toBinary(int decimal) {
		String s="";
		int[] a= new int[8];
		int index=a.length-1;
		while(decimal!= 0 && decimal!= 1) {
			int binaryValue=decimal%2;
			a[index--]=binaryValue;
			decimal=decimal/2;
		}
		a[index]=decimal;
		
		for (int i:a) {
			s=s+i;
			//System.out.print(i+" ");
		}

		return s;
		//System.out.println();
	}
	
	static int[][] arrayCreation(){
		int[][] a=new int[2][3];
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter");
		for (int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				a[i][j]=myObj.nextInt();
				
			}
		}
		return a;
	}
	
	static void triples(int[] a) {
		int count=0;
		for (int i = 0; i < a.length-3; i++) {
			for (int j = i+1; j < a.length-2; j++) {
				for (int k = j+1; k < a.length; k++) {
					if(a[i]+a[j]+a[k]==0) {
						count++;
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
			
		}
		System.out.println("Number of triplets is : "+count);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*float x=(32*9.0f/5)+32;
		float y=(89.6f-32)*5.0f/9;
		System.out.println((int)y);*/
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random()*3));
			
		}
	}

}

