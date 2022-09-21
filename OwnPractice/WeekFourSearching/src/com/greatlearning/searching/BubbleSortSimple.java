package com.greatlearning.searching;

import java.lang.reflect.Array;

public class BubbleSortSimple {
	
	public static int[] bubbleSortImple(int[] arr)
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
		}
		return arr;
		
	}
	public static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		
		System.out.println();
	}

	public static void main(String[] args) 
	{
		int[] myArr= {9,1,3,2,7,0,50,43};
		System.out.println("before sorting..");
		display(myArr);
		myArr=bubbleSortImple(myArr);//calling sorting mthd
		System.out.println("after sorting..");
		display(myArr);
	}

}
