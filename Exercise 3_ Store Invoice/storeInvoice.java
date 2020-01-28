//package storeInvoice;
		
import java.util.Scanner;
		
public class storeInvoice {

			
	public static void main(String[] args) 
			
	{	
		Scanner input = new Scanner(System.in);

		storeInvoiceClass newStoreInvoiceClass = new storeInvoiceClass();
		
		newStoreInvoiceClass.setNumVar(input.next());
		newStoreInvoiceClass.setDescription(input.next());
		newStoreInvoiceClass.setQuantity(input.nextInt());
		newStoreInvoiceClass.InvoiceCheck();
		newStoreInvoiceClass.setPrice(input.nextDouble());
		newStoreInvoiceClass.InvoiceCheck();
	
		System.out.printf("Invoice amount is: ");		
		System.out.printf("%.2f", newStoreInvoiceClass.overallTotal());
				
		input.close();		
			}
	}
