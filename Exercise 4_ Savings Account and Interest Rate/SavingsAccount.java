import java.util.Scanner;

public class SavingsAccount {

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		SavingsAccountClass newSavingsAccountClass = new SavingsAccountClass();
		
		newSavingsAccountClass.setAccountNo(input.nextLine());
		newSavingsAccountClass.setCustName(input.nextLine());
		newSavingsAccountClass.setPhoneNo(input.nextLine());
		newSavingsAccountClass.setBalance(input.nextDouble());
		newSavingsAccountClass.setDeposited(input.nextDouble());
		newSavingsAccountClass.setAnnualIntRate(input.nextDouble());
		newSavingsAccountClass.setWithdrawn(input.nextDouble());
		
		
		newSavingsAccountClass.deposit();
		newSavingsAccountClass.withdrawal();
		newSavingsAccountClass.calculateMonthlyInterest();
		
		
		input.close();
	}

}
