import java.util.Scanner;
public class PowerFinder {

	public static void main (String []args)
	{
		
		System.out.println("enter the base number");
		Scanner in=new Scanner(System.in);
		int base=in.nextInt();
		System.out.println("enter the power number");
		int power=in.nextInt();
		int result=1;
		for(int i=1;i<=power;i++)
		{
			result *= base;// base=base*i;
		}
		System.out.println("the answer is " + base + " power " + power + " is = " + result  );
	}
}
