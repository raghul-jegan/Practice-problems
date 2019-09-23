import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=myObj.nextInt();
		if (num >= 0 && num<31) {
			for(int i=1;Math.pow(2,i)<=Math.pow(2,num);i++) {
				System.out.print((int)Math.pow(2,i)+" ");
			}
		}
		

	}

}
