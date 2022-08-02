package codingChallenges;

class Main
{
	//defining a printstring method which accept no argument and print the message"hello"
	void printString()
	{
		System.out.println("Hello Great Learning....>");
	}
}
public class MethodBasicDemo1 {
	
	public static void main(String[]args)
	{
		/* how to call the printstring method inside the main function
		 * 
		 *by creating object
		 */
		
		Main obj=new Main();
		obj.printString();
	}

}
