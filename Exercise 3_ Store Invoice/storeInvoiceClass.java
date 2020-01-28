//package storeInvoice;

public class storeInvoiceClass {

	private String numVar;
	private String description;
	private int quantity;
	private double price;
	
	public storeInvoiceClass()
	{
		this("","", 0, 0);
	}
	
	public storeInvoiceClass(String numVar, String description, int quantity, double price) {
		super();
		this.numVar = numVar;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getNumVar() {
		return numVar;
	}

	public void setNumVar(String numVar) {
		this.numVar = numVar;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double overallTotal() 
	{
		double total = this.quantity*this.price;
		return total;
	}
	
	public void InvoiceCheck()
	{
		if(this.quantity < 0) 
		{
			this.quantity = 0;
		}
		if(this.price < 0) 
		{
			this.price = 0;
		}
	}
}
