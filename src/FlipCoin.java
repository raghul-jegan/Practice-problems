import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heads=0;
		int	tails=0;
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter num of flips");
		int flips=myObj.nextInt();
		if (flips>0) {
			for (int i=0;i<flips;i++) {
				if (Math.random() < 0.5) {
					tails=tails+1;
				}else {
					heads=heads + 1;
				}
			}
			int tailsPercent=tails*100/flips;
			int headsPercent=heads*100/flips;
			System.out.println("The percentage of heads : "+headsPercent );
			System.out.println("The percentage of tails : "+tailsPercent );
		}
		//System.out.println((5/10)*100);

	}

}
