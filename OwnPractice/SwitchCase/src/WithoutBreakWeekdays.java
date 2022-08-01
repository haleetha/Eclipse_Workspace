import java.util.Scanner;
public class WithoutBreakWeekdays {
	
		public static void main (String []args)
		{
			System.out.println("Enter any day ..>");
			Scanner in=new Scanner (System.in);
			String userDay=in.nextLine();
			
			switch (userDay.toUpperCase())
			{
			case "MONDAY" : 
			case "TUESDAY":
			case "WEDNESDAY" : 
			case "THURSDAY":
			case "FRIDAY" : 
				System.out.println("this is a Weekday..>");
				break;
			
			case "SATURDAY":
			case "SUNDAY" :
				System.out.println("this is a Weekend..>");
				break;
				default:
					System.out.println("not a valid input...>");
					
			
			}
		

	}
}
