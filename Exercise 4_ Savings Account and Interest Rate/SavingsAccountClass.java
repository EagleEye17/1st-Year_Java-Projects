public class SavingsAccountClass {

	private String accountNo;
	private String custName;
	private String phoneNo;
	private double Balance;
	private double deposited;
	private double annualIntRate;
	private double withdrawn;
	
	public SavingsAccountClass() 
	{
		this("","","",0,0,0,0);
	}
	
	public SavingsAccountClass(String accountNo, String custName, String phoneNo, double Balance, double deposited,
			double annualIntRate, double withdrawn) {
		this.accountNo = accountNo;
		this.custName = custName;
		this.phoneNo = phoneNo;
		this.Balance = Balance;
		this.deposited = deposited;
		this.annualIntRate = annualIntRate;
		this.withdrawn = withdrawn;
	}

	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double Balance) {
		this.Balance = Balance;
	}

	public double getDeposited() {
		return deposited;
	}

	public void setDeposited(double deposited) {
		this.deposited = deposited;
	}

	public double getAnnualIntRate() {
		return annualIntRate;
	}

	public void setAnnualIntRate(double annualIntRate) {
		this.annualIntRate = annualIntRate;
	}

	public double getWithdrawn() {
		return withdrawn;
	}

	public void setWithdrawn(double withdrawn) {
		this.withdrawn = withdrawn;
	}
	
	public void deposit()
	{
		this.Balance = this.Balance + this.deposited;
		System.out.printf("Deposited %.2f", + this.deposited);
		System.out.printf(" new balance is " + String.format("%.2f", this.Balance));
		System.out.println();
	}
	
	public void withdrawal()
	{
		if(this.Balance <= this.withdrawn)
		{
			System.out.printf("Insufficient funds, available balance is " + String.format ("%.2f", this.Balance));
			System.out.println();
		}
		else
		{
			this.Balance -= this.withdrawn;
			System.out.printf("Withdrawed %.2f", + this.withdrawn);
			System.out.printf(" new balance is %.2f", + this.Balance);
			System.out.println();
		}
	}
	
	public void calculateMonthlyInterest()
	{
		double interest;
		interest = this.Balance * this.annualIntRate / 12;
		this.Balance += interest;
		System.out.printf("New balance after interest rate is applied %.2f", + this.Balance);
	}
	
}
