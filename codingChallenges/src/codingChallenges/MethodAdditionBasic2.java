package codingChallenges;
import java.util.Scanner;
class addition
{
	//creating a method to perform addition
		/*
		 * having int return type
		 * accept two user input argument
		 */

	int additionTwoNumber(int num1,int num2)
	{
		return(num1+num2);
	}
}
public class MethodAdditionBasic2 {
	
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number 1...>");
		int num1=in.nextInt();
		System.out.println("Enter the number 2...>");
		int num2=in.nextInt();
		addition add=new addition();
		int result=add.additionTwoNumber(num1, num2);
		System.out.println("The sum of two number is....>" +result);
	}
}
