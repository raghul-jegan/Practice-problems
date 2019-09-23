import java.util.Arrays;
import StackLL;
import QueueLL;

public class PrimeNumbers {
	
	/*static int[] primeNumbers() {
		int[] a=new int[1000];
		int j=0;
		//int k=0;
		for (int i=2;i<1000;i++) {
			boolean result=isPrime(i);
			if (result==true) {
				//System.out.print(i+" ");
				a[j]=i;
				j++;
			}
		}
		return a;
	}*/
	
	static int[][] primeNumbersArray(){ //to add prime numbers in the range 90-1000 in a 2D array
		int[][] a=new int[10][100];
		int i=0;
		int j=0;
		int count=100;
		for (int n=2;n<1000;n++) {
			boolean result=isPrime(n);
			if (result==true) {
				if(n>count) {
					i++;
					j=0;
					count=count+100;
				}
				if (i<10 && j<100) {
				   a[i][j]=n;
				   j++;
				}
			}
		}
		return a;
	}
	
	static boolean isPrime(int n) {  //to check a number is prime or not
		for (int i=2;i<n;i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	/*static int[][] Array(int[] arr) {
		int[][] a=new int[10][100];
		int count=100;
		int i=0;
		int j=0;
		for (int p:arr) {
			if(p>0) {
				if (p>count) {
					i++;
					j=0;
					count=count+100;
				}
				if (i<10 && j<100) {
				   a[i][j]=p;
				   j++;
				}
			}
			}
		return a;
	}*/
	static void printArray(int[][] a,int firstDimn,int secondDimn) {
		for (int i=0;i<firstDimn;i++) {
			for (int j=0;j<secondDimn;j++) {
				if (a[i][j]!=0) {
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
			
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
	
	static int[] findAnagram(int[][] a) {
		int[] anagramArray=new int[500];
		int m=0;
		//int n=0;
		for (int i=0;i<10;i++) {
			for(int j=0;j<100;j++) {
				int k=j+1;
				while (a[i][j]!=0 && a[i][k]!=0) {
				   boolean result=anagram(String.valueOf(a[i][j]),String.valueOf(a[i][k]));
				   if (result==true) {
					   //System.out.print(a[i][j]+" "+a[i][k]+" ");
					   anagramArray[m++]=a[i][j];
					   anagramArray[m++]=a[i][k];
					   //m++;
				   }
				   k++;
				}
			}
		}
		return anagramArray;
	}
	
	static void primeStack(int[] a) {  //adding anagram to stack and printing in reverse
		StackLL s=new StackLL();
		for (int i=0;i<a.length;i++) {
			if (a[i]!=0) {
				s.push(a[i]);
			}
		}
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}
		System.out.println();
	} 
	
	static void primeQueue(int[] a) {  //adding anagram to stack and printing in reverse
		QueueLL q=new QueueLL();
		for (int i=0;i<a.length;i++) {
			if (a[i]!=0) {
				q.enqueue(a[i]);
			}
		}
		while(!q.isEmpty()) {
			System.out.print(q.dequeue()+" ");
		}
		System.out.println();
	} 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr1=primeNumbers();
		int[][] a=primeNumbersArray();
		int[] anagram=findAnagram(a);
		System.out.println("Using 2D array");
		for (int i=0;i<anagram.length;i++) {
			if(anagram[i]!=0) {
			System.out.print(anagram[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Using Queue");
		primeQueue(anagram);
		
		//printArray(a,10,100);*/
		
	}

}
