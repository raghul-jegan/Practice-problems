import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stack,goal,noOfTimes;
		int noOfBets=0;
		int noOfWins=0;
		System.out.println("Enter stack,goal,noOfTimes");
		Scanner myObj=new Scanner(System.in);
		stack=myObj.nextInt();
		goal=myObj.nextInt();
		noOfTimes=myObj.nextInt();
		for (int i=1;i<=noOfTimes;i++) {
			System.out.println("Enter bet ");
			noOfBets++;
			int bet=myObj.nextInt();
			if (bet<=stack) {
			if (Math.random() < 0.5) {   //win
				System.out.println("you won this bet");
				noOfWins++;
				stack=stack+bet;
				System.out.println("Your current stack is : "+stack);
				if (stack==goal) {
					System.out.println("you won");
					break;
				}
			}else {  //loss
				System.out.println("You lost this bet");
				stack=stack-bet;
				System.out.println("Your current stack is : "+stack);
				if(stack==0) {
					System.out.println("you lost");
					break;
				}
				
			}
		}else {
			System.out.println("insufficient fund");
		}
		}
		
		float winsPercent = noOfWins*(100.0f/noOfBets);
		float lossPercent= (noOfBets-noOfWins)*(100.0f/noOfBets);
		
		System.out.println("win percentage is : "+winsPercent);
		System.out.println("loss percentage is : "+ lossPercent);
		
		

	}

}
