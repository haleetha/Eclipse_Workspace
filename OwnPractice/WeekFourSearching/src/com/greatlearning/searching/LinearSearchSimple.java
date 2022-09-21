package com.greatlearning.searching;

public class LinearSearchSimple {
	

	
	public int linearSearchimplementation(int[] arrayName,int searchElement)
	{
		for(int i=0;i<arrayName.length;i++)
		{
			if(arrayName[i]==searchElement)
				return i;
				
		}
		
		return -1;
	}
	
	
	
	

	public static void main(String[] args) {
		
		int[] arr= {7,8,3,0,1};
		int search=7;
		
		LinearSearchSimple obj=new 	LinearSearchSimple();
		int result=obj.linearSearchimplementation(arr, search);
		if(result==-1)
			System.out.println("The elemnt is not founded ");
		else
			System.out.println("The elemnt is  founded at the index " +result);
		
	}

}
