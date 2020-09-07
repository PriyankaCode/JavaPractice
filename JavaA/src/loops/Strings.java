package loops;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		String name = "Priyanka";
		if (name.equalsIgnoreCase("priyanka")) {
			System.out.println("True");
		}
		System.out.println("Length of Priyanka " + name.length());

		Scanner scan = new Scanner(System.in);
		String command = null;
		for (;;) {
			System.out.print("Please Enter a comand >");
			command = scan.nextLine();

			if (command.length() == 0) {
				continue;
			} else if (command.equalsIgnoreCase("Start")) {
				System.out.println("Machine Starting ....");
			} else if (command.equalsIgnoreCase("Stop")) {
				System.out.println("Machine Stopping ....");
			} else if (command.equalsIgnoreCase("quit")) {
				System.out.println("Exiting ....");
				break;
			} else {
				System.out.println("Unrecognised command");
			}
		}
		scan.close();
	}

}
