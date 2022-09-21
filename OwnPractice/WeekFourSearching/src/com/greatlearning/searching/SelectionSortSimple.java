package com.greatlearning.searching;

public class SelectionSortSimple {
	
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
		
		int myArr[]= {3,1,0,6,4,40,23};
		System.out.println("Before sorting");
		display(myArr);
		
		selectionSortImp(myArr);
		
		System.out.println("after sorting");
		display(myArr);
		
	}

}
