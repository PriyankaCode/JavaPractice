package loops;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		try {
			int number = scan.nextInt();

			if (number < 100) {
				System.out.println("You have entered a number smaller than 100");
			} else if (number == 100) {
				System.out.println("you have entered 100");
			} else {
				System.out.println("You have entered a number greater than 100");
			}
		
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			scan.close();
		}
	}

}
