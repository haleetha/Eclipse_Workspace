import java.util.Scanner;
public class MultiplicationTable {
	
	/*
	 * Write a program that prompts the user to input a positive integer.
	 * It should then print the multiplication table of that number. 
	 */

	public static void main (String [] args)

	{
	Scanner in=new Scanner(System.in);
	System.out.println(" Enter any integer number");
	int userNum=in.nextInt();
	int mul;
	for(int i=1; i<=12;i++)
	{
	mul=userNum*i;
	System.out.println(i +"*" + userNum +"=" +mul);
	
	

	}
	}
}
