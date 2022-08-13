//import java.util.Arrays;
class ArrayLength
{
	public static void main(String []args)
	{
	char chararr1[] ={'a','b','c','d'};
	int []intarr1={1,2,3,4,5};
	String [] strarr1={"halees","fight"};
	int intArrLength=intarr1.length;
	int charArrLength=chararr1.length;
	System.out.println("length of string array..>" + strarr1.length );
	System.out.println("length of int array..> " + intArrLength);
	System.out.println("length of char array...>" +charArrLength);
	System.out.println("contents of string array...>" + Arrays.toString(strarr1));
	System.out.println("contents of character array...." + chararr1);
	//string array display
	System.out.println("contents of String array..> "+ strarr1 );
	}
}