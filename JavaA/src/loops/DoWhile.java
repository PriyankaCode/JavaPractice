package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String password = null;
		do {
			System.out.println("Enter Password");
			password = scan.nextLine();
			if (password.equals("password")) {
				System.out.println("Access Granted!!!");
			}
		} while (!password.equals("password"));
		scan.close();
		System.out.println("Access Denied!!!");

	}

}
