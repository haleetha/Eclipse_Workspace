package codingChallenges;

public class InfiniteForLoopTableofTwo {

	public static void main (String []args)
	{
		//print table of two
		/*using continue skip the number not in table
		 * use break if it exceeds 20
		 */
		int i=1;
		for(;;i++)
		{
			if(i%2!=0)
			
				continue;
			 
			 else if(i==20)
				 break;
			 else
				 System.out.println(i);
			System.out.println();
		}
	}
}
