/*
10. There is no transfer method in the documentation (http://www.davin.50webs.com/research/1999/egs/SavingsAccount.html#withdraw(int))
*/

public class SavingsAccount {
 
	private int balance;

	public SavingsAccount() {
		balance = 0;
	}

	public SavingsAccount(int initialBalance) {
		balance = initialBalance;
	}

	public void greet() {
		System.out.println("Welcome to your savings account!");
	}	

	public void showBalance() {
		System.out.println(balance);
	}

	public void deposit(int howMuch) {
		if(howMuch > 0) {
			balance = balance + howMuch;
		}
		else {
			System.out.print("Please enter a positive number");
		}
	}

	public void withdraw(int howMuch) {
		if(howMuch > 0) {
			balance = balance - howMuch;
		}
		else {
			System.out.print("Please enter a positive number");
		}
	}

}