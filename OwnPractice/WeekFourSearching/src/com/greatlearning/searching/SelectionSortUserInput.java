package com.greatlearning.searching;

import java.util.Scanner;

public class SelectionSortUserInput {
	
	
	

	public void insertArray()
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
		
		boolean b=checkStatus(myArray);
		
		if(b==false)
		{
			selectionSortImp(myArray);
		System.out.println("The elements of array are ..after sorting...");
		display(myArray);
		}
		else
		{
			System.out.println("The array is already sorted..!");
		}
		
		
		
		
	}
		
	public static boolean checkStatus(int[] ar)
	{
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1])//first ele big
				return false;
		}
		return true;
	}
		

	
	
	public static void selectionSortImp(int[] arr)
	{
		//compare and find the smaller element
		//then swap the smaller elemtnt with 0th element 
		//then repeat
		
		
		for(int i=0;i<arr.length;i++)
		{
			int index=i;
			
			for(int j=0+i;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
					index=j;
				}
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
			display(arr);
		}
	}
	public static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		
		System.out.println();
	}

	public static void main(String[] args) {
	SelectionSortUserInput obj=new SelectionSortUserInput();
	obj.insertArray();
		
	}

}
