package codingChallenges;
import java.util.Scanner;

public class switchArithmeticCalculator {

	public static void main (String []args)
	{
		// to get user input
		Scanner input = new Scanner (System.in);
		System.out.println(" enter the first number....>");
		int num1=input.nextInt();
		System.out.println(" enter the second number....>");
		int num2=input.nextInt();
		//System.out.println("the two numbers are" +num1 +num2);
		System.out.println(" Arithmetic Operations list ...>");
		System.out.println(" 1 for Addition"
				+ "2 for subtraction "  + "3 for multiplication" + " 4 for division ");
		int userChoice =input.nextInt();
		switch(userChoice)
		{
		case 1 : int add=num1 +num2 ;
			System.out.println("the addition value is " + add);
			break;
		case 2 : int sub=num1 - num2 ;
			System.out.println("the addition value is " + sub);
			break;
		case 3 : int mul=num1 * num2 ;
			System.out.println("the addition value is " +mul);
			break;
		case 4 : 
			if(num2!=0)
				{
				double div=num1  /num2 ;
				System.out.println("the addition value is " + div);
				}
			else
			{
				System.out.println("invalid");
			}
			break;
		
		
		
		
		}
	}
}
