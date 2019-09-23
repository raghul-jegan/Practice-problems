
public class Binary {
	
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
		}

		return s;
	}
	
	static int toDecimal(String s) {
		int decimal=0;
		char[] c=s.toCharArray();
		int[] a= {128,64,32,16,8,4,2,1};
		for (int i=0;i<c.length;i++) {
			decimal=decimal+a[i]*Integer.parseInt(String.valueOf(c[i]));
		}
		return decimal;
	}
	
	static String swapNibbles(String str) {
		int mid=str.length()/2;
		String s1=str.substring(0, mid);
		String s2=str.substring(mid, str.length());
		
		return s2+s1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=swapNibbles(toBinary(100));
		System.out.println(toDecimal(s));
	}

}
