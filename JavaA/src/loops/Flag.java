package loops;

import java.util.Scanner;

public class Flag {

	public static void main(String[] args) {
		final String USER_PASSWORD = "pwd";
		boolean locked = false;
		
		Scanner scan = new Scanner(System.in);
		String password = null;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Please Enter Password!!! >");
			password = scan.nextLine();
			
			if (password.equals(USER_PASSWORD)) {
				System.out.println("Access Granted.");
				break;	
			} else if ((!password.equals(USER_PASSWORD)) && i == 2) {
				System.out.println("Access Denied!!!");
				locked = true;
			}else{
				System.out.println("Incorrect Password!!!");
			}
		}
		
		scan.close();
		if (locked) {
			System.out.println("You are locked out of the system!!!");
		}
	}

}
