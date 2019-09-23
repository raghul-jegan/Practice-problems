import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float harmonic=0;
		System.out.println("Enter a num");
		Scanner myObj=new Scanner(System.in);
		int n=myObj.nextInt();
		if (n>0) {
			for (int i=1;i<=n;i++) {
				float h=1.0f/i;
				harmonic=harmonic+h;
			}
			System.out.println("The harmonic value of "+n+" : "+harmonic);
		}

	}

}
