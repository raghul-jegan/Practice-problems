import java.util.Scanner;
public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj=new Scanner(System.in);
		System.out.println("enter user name");
		String userName=myObj.nextLine();
		if (userName.length() >= 3) {
			System.out.println("Hello "+userName+", How are you?");
			}else {
				System.out.println("incorrect username");
			}

	}

}
