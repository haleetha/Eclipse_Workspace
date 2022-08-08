import java.util.Scanner;
//import java.lang.invoke.StringConcatException;
class StringDemo
{
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any sentences....");

		String sent1=in.nextLine();
System.out.println("enter second sent");
String sent2=in.nextLine();
//concate
String rslt=sent1.concat(sent2);
System.out.println("the concatenation of two string is " + rslt);

//trim

System.out.println("the trimmed result will be,,"  + sent1.trim());

//indexOf

int rsltnum=sent1.indexOf("a");
System.out.println("the index of a in sent 1 is..." +rsltnum);

//equals
boolean b=sent1.equals(sent2);
System.out.println("checking whether two are equal " + b);

//toUpperCase

System.out.println("to uppercase " + sent2.toUpperCase());

//toLower case


System.out.println("to lowerrcase " + sent2.toLowerCase());

//replace

 rslt=sent1.replace("a", "w");

System.out.println("the replaced rlst is " + rslt);

//startswith


System.out.println("checking whether given sentence 1 starts with a...." + sent1.startsWith("a"));

//ends with

System.out.println("checking whether given sentence 1 ends with a...." + sent1.endsWith("a"));

//length


System.out.println("lenght of sent 1 is...." + sent1.length());
	}
}