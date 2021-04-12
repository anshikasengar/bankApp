/*This class is used for the account*/
public abstract class Account implements InterestRateInterface {

	/*variables used in this class*/
	private String name;
	private String ssn;
	private double balance;
	protected String accNumber;
	protected double rate;
	
	/*this method creates a account*/
	public Account(String name, String ssn, double initialDeposit) {
		this.name = name;
		this.ssn = ssn;
		this.balance = initialDeposit;
		/* set account number method called*/
		this.accNumber = setAccNo();
		/* set interest rate*/
		setRate();
	}

	/*This method sets the account number*/
	private String setAccNo() {
		/*The last two numbers of the SSN*/
		String lastTwoOfSSN = ssn.substring(ssn.length() - 2, ssn.length());
		/*A random number gets generated*/
		int randNo = (int) (Math.random() * Math.pow(10, 3)); 
		return lastTwoOfSSN + randNo;
	}

	/*set rate*/
	public abstract void setRate();
	
	
	/*This method displays the Account info*/
	public void showInfo() {
				System.out.println("Name: " + name + 
						"\nAccNr.: " + accNumber + 
						"\nBalance: " + balance + 
						"\nRate: " + rate + "%");
		}
	
	/*Encapsulation*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public String getAccNumber() {
		return accNumber;
	}

	public double getRate() {
		return rate;
	}

	/*This method prints the balance*/
	public void printBalance() {
		System.out.println("Your balance is: $"+ balance);
	}

	
}
