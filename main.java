import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int studentLetterLength = input.nextInt();
		int[] studentGrade = new int[studentLetterLength];
		
		for (int i = 0; i < studentGrade.length; i++)
			studentGrade[i] = input.nextInt();
		
		int top = studentGrade[0];
		
		for (int i = 0; i < studentGrade.length; i++)
		{
			if(top < studentGrade[i])
				top = studentGrade[i];
		}
		
		for (int i = 0; i < studentGrade.length; i++)
		{
			System.out.print("Student" + i + " score is " + studentGrade[i] + " and grade is ");
			
			if(studentGrade[i] >= top - 10)
				System.out.print("A\n");
			else if(studentGrade[i] >= top - 20)
				System.out.print("B\n");
			else if(studentGrade[i] >= top - 30)
				System.out.print("C\n");
			else if(studentGrade[i] >= top - 40)
				System.out.print("D\n");
			else
				System.out.print("F\n");
			
		}
		
	}

}
