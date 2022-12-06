import java.util.Scanner;
public class Jeepney_Fare
{
	public static void main(String[] args){
	    
	    Scanner scanner = new Scanner(System.in);
	    String FareType = scanner.next();
	    scanner.nextLine();
	    String distance = scanner.nextLine();
	    
	    double doubleDistance = Double.parseDouble(distance);
	    
	    double fare = 7.5;
	    
	    if(doubleDistance > 5){
	        fare += (doubleDistance - 5) * 1.25;
	    }
	    
	    switch(FareType.toUpperCase()){
	        case "R" : System.out.println("Fare is Php" + String.format("%.2f", fare));
	            break;
	        case "D" : System.out.println("Fare is Php" + String.format("%.2f", fare*.8));
	            break;        
	    }
	    
	 }
}