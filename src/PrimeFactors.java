import java.util.Scanner;

public class PrimeFactors {
	
	static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a num");
		Scanner myObj=new Scanner(System.in);
		int n=myObj.nextInt();
		for (int i=2;i<n;i++) {
			if (n%i == 0) {
				//System.out.println(i);
				boolean result=isPrime(i);
				if (result==true) {
					System.out.println(i);
				}
			}
		}

	}

}
