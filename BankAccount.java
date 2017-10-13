package bankPackage;
/*
 * Authored by: Matthew R. Norton		Date: 10/10/17
 * 
 * Simple Bank Account Jaroop Programming Exercise
 * 
 * In this program a simple bank account with simple actions such as: deposit, withdraw, balance,
 * and exit can all be executed for a single account. This is a program where the user is 
 * prompted to enter data via the command line and these inputs are then processed accordingly. 
 */

class BankAccount{
	double amount = 0.0;
	double account = 0.0;
	
    //Creation of the simple bank account
    public BankAccount() {
		account = 0.0;
	}
    
    //Deposit method that only deposits values greater than or equal to zero
	public void Deposit(double m) {		
		amount = m;
		String text = Double.toString(Math.abs(amount));
		int intPlaces = text.indexOf('.');
		int decPlaces = text.length() - intPlaces - 1;
		if(decPlaces > 2) {
			System.out.println("Please input a valid amount.");
		}else if(amount < 0) {
			System.out.println("Please input a valid amount");
		}else {
			account += amount;
		}				
	}
	
	//Withdraw method that only withdraws positive values so long as the account has the funds
	public void Withdraw(double m) {
		amount = m;
		String text = Double.toString(Math.abs(amount));
		int intPlaces = text.indexOf('.');
		int decPlaces = text.length() - intPlaces - 1;
		if(decPlaces > 2) {
			System.out.println("Please input a valid amount.");
		}else if(amount < 0) {
			System.out.println("Please input a valid amount");
		}else if(amount > account) {
			System.out.println("Please input a valid amount");
		}else {
			account -= amount;
		}
	}
	
	//Balance method which returns the current funds in the account
	public double Balance() {
		return account;
	}		
}