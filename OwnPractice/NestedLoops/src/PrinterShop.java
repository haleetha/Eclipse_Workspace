import java.util.Scanner;
public class PrinterShop {
 /* persons standing in queue
  * get no of persons standing from user
  * get how many pages to be printed for user
  * display the printing times
  * 
  */
public static void main (String []args)
{
Scanner in=new Scanner(System.in);
System.out.println("How many persons standing in the queue");
int noOfPersons= in.nextInt();




for(int j=1;j<=noOfPersons;j++)
{
	System.out.println(" enter no of copy for person " + j);
	int noOfCopy= in.nextInt();
	
	for(int i=1; i <= noOfCopy;i++)
	{
		System.out.println("Print out happening..copy number ..>" + i);	}
	}
}
}

