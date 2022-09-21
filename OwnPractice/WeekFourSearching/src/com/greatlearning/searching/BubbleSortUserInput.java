package com.greatlearning.searching;
import java.util.Scanner;
public class BubbleSortUserInput {
	
	public static void insertArray()
	{
		
		Scanner in=new Scanner(System.in);
		 int size;
		System.out.println("Enter the size of array..");
		size=in.nextInt();
		int[] myArray=new int[size];
		
		System.out.println("Enter the elements  of array at..");
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element at "+i+" position");
			myArray[i]=in.nextInt();
		}
		
		
		System.out.println("The elements of array are ..before sorting...");
		display(myArray);
		
		bubbleSortImple(myArray);//calling the sort method
		
	}
	
	public static void bubbleSortImple(int[] arr)
	{
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j-1]>arr[j])//swap
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("array output after"+i+" iteration");
			display(arr);//to print the output after every itertion as per the coding challenge ques
		}
		
		System.out.println("after sorting completely..");
		display(arr);
	}
	
	public static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		
		System.out.println();
	}

	public static void main(String[] args) {
		
		
		insertArray();
		

	}

}
