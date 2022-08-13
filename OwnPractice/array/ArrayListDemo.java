import java.util.ArrayList;

class ArrayListDemo
{
	public static void main (String [] args)
	{
	// arraylist can be used only as objects..that is new keyword

	ArrayList<String> myarr1=new ArrayList<String> ();
	// to add to the array

	myarr1.add("hello");
	myarr1.add("i am halees");
	myarr1.add("how are you");
	myarr1.add(" whats up ");


// to display any value of the arraylist ..use get function

System.out.println("the 0th element is...>" + myarr1.get(0));

	// to display using for loop

	for(int i=0;i<myarr1.size();i++)
	{
	// in arraylist the length of the array is found as size()

	myarr1.get(i);
	System.out.println("contents of the arraylist..." + myarr1.get(i));
	}


	//to remove any item using rmv function

	myarr1.remove(0);

	//to check


	System.out.println("to check whether it is removed or not..>");

for(int i=0;i<myarr1.size();i++)
	{
	// in arraylist the length of the array is found as size()

	myarr1.get(i);
	System.out.println("contents of the arraylist..." + myarr1.get(i));
	}
	//to set using set fucntion


	myarr1.set(0,"my dear");


	System.out.println("this for setting...>" + myarr1.get(0));
	}
}