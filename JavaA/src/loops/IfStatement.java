package loops;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		
		try {
			
			System.out.println("Enter a number \n=========");
			int number = scan.nextInt();

			if (number < 100) {
				System.out.print("You have entered a number smaller than 100");
			} else if (number == 100) {
				System.out.print("you have entered 100");
			} else {
				System.out.print("You have entered a number greater than 100");
			}
		//	System.exit(0); exits the system with the written int code
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			scan.close();
		}
	}
}
