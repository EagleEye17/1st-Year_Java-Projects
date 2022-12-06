import java.util.Scanner;

public class Quiz_2_Main {

	public static void main(String[] args) {
		
		Scanner inputDevice = new Scanner(System.in);
		
		Date newDate = new Date();

		newDate.setYear(inputDevice.nextInt());
		newDate.setMonth(inputDevice.nextInt());
		newDate.setDay(inputDevice.nextInt());
		
		newDate.output();
		
		inputDevice.close();
		
	}

}
