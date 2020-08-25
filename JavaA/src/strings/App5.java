package strings;

import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
		// UserInput
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		try {
			int number = scanner.nextInt();
			System.out.println("Entered number is: " + number);
		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			scanner.close();
		}

	}

}
