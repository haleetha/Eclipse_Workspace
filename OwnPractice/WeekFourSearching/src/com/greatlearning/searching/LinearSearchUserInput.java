package com.greatlearning.searching;
import java.util.Scanner;

public class LinearSearchUserInput {
	
	
	public static int linearSearchimplementation(int[] arrayName,int searchElement)
	{
		for(int i=0;i<arrayName.length;i++)
		{
			if(arrayName[i]==searchElement)
				return i;
				
		}
		
		return -1;
	}
	
	

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the size of the array..");
		int size=in.nextInt();
		
		int[] array=new int[size];
		
		System.out.println("Enter the elements of the array..");
		for(int i=0;i<size;i++)
		{
			array[i]=in.nextInt();
		}
		
		System.out.println("Enter the element to search");
		int searchElement=in.nextInt();
		
		int result=linearSearchimplementation(array, searchElement);//static mthd so no pbject
		
		
		if(result==-1)
			System.out.println("The elemnt is not founded ");
		else
			System.out.println("The elemnt is  founded at the index " +result);
		in.close();
		
	}
	

}
