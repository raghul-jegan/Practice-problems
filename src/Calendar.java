import java.util.*;
public class Calendar {   //jan=0,feb=1...
	
	void fillCalendar(int dayName,int maxDays) {
		String[][] c=new String[7][7];
		int x=1;
		int firstDay=dayName-1;
		String[] a={"S","M","T","W","Th","F","S"};  // inserting in first row(week name)
		for (int k=0;k<a.length;k++) {
			if(a[k]=="Th") {
				c[0][k]=a[k];
				continue;
			}
			c[0][k]=" "+a[k];
		}
		for (int i=1;i<c.length;i++) {
			for (int j=firstDay;j<7;j++) {
				if (x<=maxDays) {
					if(String.valueOf(x).length()==1) {
						c[i][j]=" " + String.valueOf(x);
						x++;
					}else {
				        c[i][j]=String.valueOf(x);
				        x++;
					}
				}
			}
			firstDay=0;
		}
		//int k=0;
		for (int i=0;i<7;i++) {    //ordering second row
			if (c[1][i]==null) {
				c[1][i]="  ";
			}
		}
		for (int i=0;i<7;i++) {   //ordering last row
			if (c[6][i]==null) {
				c[6][i]="  ";
			}
		}
		printCalendar(c);
	}
	
	int noOfDays(int month) {
		int D[]={31,28,31,30,31,30,31,31,30,31,30,31};
		return D[month];
	}
	
	int monthNum(String str) {
		String[] s={ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
				"Sep", "Oct", "Nov", "Dec" };
		for (int i=0;i<s.length;i++) {
			if (s[i]==str) {
				return i;
			}
		}
		return -1;
	}
	
	/*int weekNameOFOne(int month,int year) {
		Calendar c=Calendar.getInstance();
	}*/
	
	void printCalendar(String[][] a) {
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<7;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Calendar c=new Calendar();
		//c.fillCalendar(6,31);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=s.nextInt();
		System.out.println("Enter the month(eg:Jan)");
		String month=s.nextLine();
	}

}
