import java.util.*;

public class TicTacToe {
	
	static void computer(String[][] a) {
		
		while(true) {
		  int i=(int) (Math.random()*3);
		  int j=(int) (Math.random()*3);
		
		  if (a[i][j]==null) {
			  a[i][j]="o";
			  System.out.println(" The computer entered at "+i+" "+j);
			  break;
		  }
		}
	}
	
	static void user(String[][] a) {  // user input to cell
		Scanner s=new Scanner(System.in); 
		while(true) {
			System.out.println("Enter row and column ");
			int i=s.nextInt();
			int j=s.nextInt();
			
			if (a[i][j]==null) {
				a[i][j]="x";
				break;
			}else {
				System.out.println("the cell is occupied,enter another cell ");
			}
		}
	}
	
	static int checkResult(String[][] a) {   // checking the cells
		if (a[0][0]!=null && a[1][1]!=null && a[2][2]!=null) {
		if( a[0][0].equals(a[1][1]) && a[1][1].equals(a[2][2]) ) {
			if(a[0][0].equals("o")) {
				System.out.println("The computer wins");
				return 0;
			}else {
				System.out.println("You won");
				return 1;
			}
		}
		}
		
		if ( a[0][2]!=null && a[1][1]!=null && a[2][0]!=null ) {
		if( a[0][2].equals(a[1][1]) && a[1][1].equals(a[2][0]) ) {
			if(a[0][2].equals("o")) {
				System.out.println("The computer wins");
				return 0;
			}else {
				System.out.println("You won");
				return 1;
			}
		}
		}
		
		for (int i = 0; i < 3; i++) {  // checking horizontal cells
			if( a[i][0]!=null && a[i][1]!=null && a[i][2]!=null) {
			if(a[i][0].equals(a[i][1]) && a[i][1].equals(a[i][2])) {
				if(a[i][0].equals("o")) {
					System.out.println("The computer wins");
					return 0;
				}else {
					System.out.println("You won");
					return 1;
				}
			}
			}
		}
		
		for (int j = 0; j < 3; j++) {   //checking vertical cells
			if ( a[0][j]!=null && a[1][j]!=null && a[2][j]!=null ) {
			if(a[0][j].equals(a[1][j]) && a[1][j].equals(a[2][j])) {
				if(a[0][j].equals("o")) {
					System.out.println("The computer wins");
					return 0;
				}else {
					System.out.println("You won");
					return 1;
				}
			}
			}
		}
		return -1;
	}
	
	static void crossGame(String[][] a) {
		int count=0;
		for (int i = 0; i < 5; i++) {
			computer(a);
			if (count<4) {
			   user(a);
			   count++;
			}
			if (i>=2) {
				int x=checkResult(a);
				if(x==1) {
					return;
				}
				if(x==0) {
					return;
				}
			    }
		}
		System.out.println("Game over");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] a=new String[3][3];
		crossGame(a);
		/*for(int i=0;i<9;i++) {
			computer(a);
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}*/
		
	}

}
