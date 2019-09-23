import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner myObj=new Scanner(System.in);
		int year=myObj.nextInt();
		String str=String.valueOf(year);
		if (str.length()==4) {
			if (year%4==0 && year%100==0) {
				if (year%400==0) {
					System.out.println("It is a leap year");
				}else {
					System.out.println("It is not a leap year");
				}
			}else if(year%4==0 && year%100 != 0 ) {
				System.out.println("It is a leap year");
			}else {
				System.out.println("It is not a leap year");
			}
		}
	}

}
