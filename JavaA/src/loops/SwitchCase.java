package loops;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter a number between 0 and 5 to Play \nEnter any other number to exit.");
			int option = scan.nextInt();

			switch (option) {
			case 0:
				System.out.println("Zero Worries");
				break;
			case 1:
				System.out.println("A Wonderful Life");
				break;
			case 2:
				System.out.println("A Loving Pair ");
				break;
			case 3:
				System.out.println("Health Wealth and Happiness");
				break;
			case 4:
				System.out.println("Work, Play, Eat, Sleep");
				break;
			case 5:
				System.out.println("Be Mindfull of all the Senses");
				break;
			default:
				System.out.println("Bye Bye :)");
				System.exit(option);
				System.out.println("THIS WILL NOT EXECUTE AS SYSTEM HAS EXITED");
			}
		} catch (Exception e) {
			System.out.println("Please Enter Integers Only " + e.toString());
		} finally {
			scan.close();
		}

	}

}
