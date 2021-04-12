import java.util.Scanner;

public class Action {

	public void action() {

		/* read out of file */
		Bank bank = new Bank();
		bank.fileReading();

		/* goes thru the accounts */
		for (Account a : bank.accList) {
			a.showInfo();
		}

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			/* menu gets displayed */
			System.out.println(
					"[1]add account" + "\n[2]delete account" + "\n[3]deposit" + "\n[4]withdraw" + "\n[5]transfer");
			String action = scanner.nextLine();
			/* switch case for choosing an action from the menu */
			switch (action) {
			/* add account case */
			case "1":
				bank.addAccount();
				break;
			/* delete account case */
			case "2":
				bank.deleteAccount();
				break;
			/* deposit money case */
			case "3":
				System.out.println("Please enter your account number:");
				String accNo = scanner.nextLine();
				System.out.println("Please enter the amount you want to deposit:");
				String deposit = scanner.nextLine();
				bank.deposit(accNo, Double.parseDouble(deposit));
				break;
			/* withdraw money case */
			case "4":
				System.out.println("Please enter your account number:");
				String accNo2 = scanner.nextLine();
				System.out.println("Please enter the amount you want to withdraw:");
				String withdraw = scanner.nextLine();
				bank.withdraw(accNo2, Double.parseDouble(withdraw));
				break;
			/* transferring money from one to another account case */
			case "5":
				System.out.println("Please enter your account number:");
				String accNo3 = scanner.nextLine();
				System.out.println("Please enter your destination account number: ");
				String destinationAccNo = scanner.nextLine();
				System.out.println("Please enter the amount you want to transfer: ");
				String amount = scanner.nextLine();
				bank.transfer(accNo3, destinationAccNo, Double.parseDouble(amount));
				break;
			}
		}
	}

}
