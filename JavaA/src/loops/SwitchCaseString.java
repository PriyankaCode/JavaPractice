package loops;

import java.util.Scanner;

public class SwitchCaseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Do you want to proceed y/n?");
			String option = scan.nextLine();
			switch(option) {
			case "y":
				System.out.println("Proceeding ...");
				break;
			case "n":
				System.out.println("Exiting..");
				System.exit(0);
				break;
			default:
				System.out.println("UNRECOGNISED OPTION");
			}
		}finally {scan.close();}

	}

}
