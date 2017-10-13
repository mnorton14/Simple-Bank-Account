package bankPackage;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount accountTest = new BankAccount();
		double amount = 0.0;
		String response;
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner input = new Scanner(System.in);
      
		System.out.println("Please enter in a command (Deposit, Withdraw, Balance, Exit) :");
		response = input.nextLine();
		do { 	  	
    	  		if(response.equalsIgnoreCase("Deposit")) {
    	  			System.out.println("Please enter an amount to deposit:");
    	  			try {	
    	  				amount = input.nextDouble();
    	  			}catch(InputMismatchException e){
    	  				System.out.println("Please input a valid amount.");
    	  			}	
    	  			input.nextLine();
    	  			accountTest.Deposit(amount);
    	  		}else if(response.equalsIgnoreCase("Withdraw")) {
    	  			System.out.println("Please enter an amount to withdraw:");
    	  			try {
    	  				amount = input.nextDouble();
    	  			}catch(InputMismatchException e) {
    	  				System.out.println("Please input a valid amount.");
    	  			}
    	  			input.nextLine();
    	  			accountTest.Withdraw(amount);
    	  		}else if(response.equalsIgnoreCase("Balance")) {
    	  			System.out.println("The current balance is: $" + df.format(accountTest.Balance()));
    	  		}else if(response.equalsIgnoreCase("Exit")) {
    	  			input.close();
    	  			System.exit(0);
    	  		} 	
    	  		System.out.println("Please enter in a command (Deposit, Withdraw, Balance, Exit) :");
    	  		response = input.nextLine();   	  	
		}while(response != null);  
   }

}
