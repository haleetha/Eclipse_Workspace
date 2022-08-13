
import java.util.Arrays;
class arrayMultiDimensional
{
	public static void main (String [] args)
	{
	// declaring multi dimensional array

	int myArr1[][]={{0,1,2,3},{7,8,9,10}};

	//accessing the array element by its index

	// myArr1[0][2] ----> first [0] specifies the which array block
	// second [2]---.> specifies the value in the selected array block

	System.out.println("printing the third value in 0th array...>" + myArr1[0][3]);
	//remember array index starts from 0

	System.out.println("printing the third value in 1 th array...>" + myArr1[1][3]);

	//to change the particular array element..

	// going to replace 7 in 1 st array to 100

	myArr1[1][0]=100;

	//to display it as string

	//System.out.println("displaying the array as string...>" + Arrays.toString(myArr1));
	System.out.println(myArr1[1][0]);
		}
}