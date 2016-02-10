import java.util.Scanner;

public class ATM {
	
	private static double balance = 1000;
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		login();
		process();
	}
	
	public static void login() {
		
		boolean flag = true;
		
		System.out.println("    WELCOME TO BANK OF CST141");
		System.out.println("533 College Road, Selden, NY 11784");
		System.out.println("-----------------------------------");
		do {
			System.out.println();
			System.out
					.println("Enter account number and password: ");
		
			if (input.next().equals("12345678")
					&& input.next().equals("secretWord")) {
				
				flag = false;
			}
		} while (flag);
	}

	public static int mainMenu() {
		
		System.out.println("          MAIN MENU");	
		System.out.println("------------------------------");
		System.out.println("1.          Check Balance");
		System.out.println("2.          Deposit");
		System.out.println("3.          Withdraw");
		System.out.println("4.          Exit");
		return input.nextInt();
	}
	
	public static void checkBalance() {
		System.out.println("Balance: " + balance);
		System.out.println("\n");
		process();
	}
	
	public static void deposit() {
		
		System.out.println("      Deposit Menu");
		System.out.println("------------------------------");
		System.out.println("1.             Deposit");
		System.out.println("2.             Main Menu");
		int choice = input.nextInt();
		
		if (choice == 1) {
			System.out.println("How much to deposit?");
			balance += input.nextDouble();
			System.out.println("Your new balance: " + balance);
			System.out.println("\n");
			deposit();
		} else {
			process();
		}
	}
	
	public static void withdraw () {
		System.out.println("      Withdrawal Menu");
		System.out.println("------------------------------");
		System.out.println("1.             Withdraw");
		System.out.println("2.             Main Menu");
		int choice = input.nextInt();
	
		if (choice == 1) {
			System.out.println("How much to withdraw?");
			balance -= input.nextDouble();
			System.out.println("Your new balance: " + balance);
			System.out.println("\n");
			withdraw();
		} else {
			process();
		}
	}
	
	public static void exit() {
		System.out.println("Have a good day!");
		System.out.println("\n");
		System.exit(0);
	}
	
	public static void process() {
		int choice = mainMenu();
		switch(choice) {
			case 1: checkBalance();
					break;
			case 2: deposit();
					break;
			case 3: withdraw();
					break;
			case 4: exit();
					break;
			default:
					System.out.println("Error: Enter a choice between 1 and 4.");
					System.out.println("\n");
		}
	}
}
