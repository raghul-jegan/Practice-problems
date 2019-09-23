import java.util.Arrays;

public class Util {
	
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
	
	static void bubbleSort(String[] a) {
		int swap=0;
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length-1;j++) {
				if (a[j].compareTo(a[j+1])>0) {
					String temp=a[j];
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
			int k=i;
			for (int j=i-1;j>=0;j--) {
				if (a[k]<a[j]) {
					int temp=a[k];
					a[k]=a[j];
					a[j]=temp;
					
					k=k-1;
				/*if(i>=2) {	
					i=i-1;
				}*/
				}
			}
		}                            
	}
	
	static void insertionSort(String[] a) {
		for (int i=1;i<a.length;i++) {
			int k=i;
			for (int j=i-1;j>=0;j--) {
				if (a[k].compareTo(a[j])<0) {
					String temp=a[k];
					a[k]=a[j];
					a[j]=temp;
					
					k=k-1;
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
	
	static int binarySearch(String[] a,int l,int r,String x) {
		if(r>=l) {
			int mid=(l+r)/2;
			if (a[mid].equals(x)) {
				return mid;
			}
			if(x.compareTo(a[mid])<0) {
				return binarySearch(a,l,mid-1,x);
			}
			return binarySearch(a,mid+1,r,x);
		}
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"saro","rithik","yedhu","dilip","prakash","prabhu","navin"};
		/*System.out.println("Before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		insertionSort(a);
		System.out.println("After sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();*/
		insertionSort(a);
		int i=binarySearch(a,0,a.length-1,"ball");
		if (i==-1) {
			System.out.println("String not found");
		}else {
			System.out.println("String found : "+a[i]);
		}
	}

}
