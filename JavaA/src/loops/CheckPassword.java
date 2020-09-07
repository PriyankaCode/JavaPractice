package loops;

import java.util.Scanner;

public class CheckPassword {
	
	final static String USER_PASSWORD = "chkPassword";

	public static void main(String[] args) {
		int counter = 0;
		String password;

		System.out.println("Hello User!!! ");
		Scanner scan = new Scanner(System.in);

		while (counter < 3) {		
			password = userPwd(scan);
			if(checkPwd(password)) {
				System.out.println("\tWelcome!!!");
				counter = 4;
			}else {
				counter++;
				System.out.println("You have " +(3-counter)+ " attempts remaining.");
			}
		}

	}

	private static boolean checkPwd(String password) {
		if (password.equals(USER_PASSWORD )) {
			return true;
		} else {
			return false;
		}
	}

	private static String userPwd(Scanner scan) {
		System.out.println("\tPlease Enter Your Password");
		String pwd = scan.nextLine();
		return pwd;
	}
}
