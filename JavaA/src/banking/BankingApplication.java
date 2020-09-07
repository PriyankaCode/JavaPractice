package banking;

import java.util.Scanner;

public class BankingApplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount ba = new BankAccount("Priyanka", "7892139210");
		ba.showMenu();

	}
	
}

class BankAccount{

	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String customerName, String customerId){
		this.customerName = customerName;
		this.customerId = customerId;
	}
	
	void deposit(int amount) {
		if(amount!=0) {
			balance = balance + amount;
			previousTransaction = +amount;
		}
	}
	
	void withdrawl(int amount) {
		if(amount!=0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction() {
		if(previousTransaction>0) {
			System.out.println("Deposited " + previousTransaction + "\n");
		}else if(previousTransaction<0) {
			System.out.println("Withdrawn " + Math.abs(previousTransaction) + "\n" );
		}else {
			System.out.println("No Transaction Occured\n");
		}
		
	}
	
	int userInputAmount(Scanner scan) {
		int amount = 0;
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Enter Amount");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("");
		amount = scan.nextInt();
		return amount;
		 
	}
	
	void showMenu() {
		char option = '\0';
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome " +customerName +"\nYour ID is "+ customerId+ "\n");
		System.out.println("A. Check Balance \nB. Deposit \nC. Withdraw \nD. Previous Transaction \nE. Exit");
		
		do {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Enter an Option");
			System.out.println("-----------------------------------------------------------------");
			option = scan.next().charAt(0);
			
			switch(option){
				case 'A':
				case 'a':
					System.out.println("\nBalance "+ balance + "\n");
					break;
				case 'B':
				case 'b':
					System.out.println("\nYou have selected the option to Deposit Money");
					int amount = userInputAmount(scan) ;
					deposit(amount);
					getPreviousTransaction();
					System.out.println("\nYour updated Blance is "+ balance+ "\n");
					break;
				case 'C':
				case 'c':
					System.out.println("\nYou have selected the option to Withdraw Money");
					withdrawl(userInputAmount(scan) );
					getPreviousTransaction();
					System.out.println("\nYour updated Blance is "+ balance+ "\n");
					break;
				case 'D':
				case 'd':
					getPreviousTransaction();
					break;
				case 'E':
				case 'e':
					break;
				default:
					System.out.println("\nInvalid Option!! Please enter again.");
					break;
			}
		}while((option!='e')&&(option!='E'));
		
		scan.close();
		System.out.println("\nThankyou for using our Services");
		
	}
	

}
