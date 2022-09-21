package com.greatlearning.searching;
import java.util.Scanner;

public class BinarySearchUserInput {
		Scanner in=new Scanner(System.in);
		int[] arr;
		int size,searchElement,firstElement,lastElement;
	public void binarysearchImpl()
	{
		inputArray();
		displayArray();
		searchInput();
		binarySearch(arr, firstElement, lastElement, searchElement);
	}
	
	public void inputArray()
	{
		System.out.println("Enter the size of array..");
		size=in.nextInt();
		arr=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		
		firstElement=0;
		lastElement=arr.length-1;
		
	}
	
	public void displayArray()
	{
		System.out.println("The array elements are..");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void searchInput()
	{
		System.out.println("Enter the element value to search in array..");
		searchElement=in.nextInt();
	}
	public void binarySearch(int[] array,int first,int last,int key)
	{
		while(first<=last)
		{
			int mid=(first+last)/2;
		if(arr[mid]==key)
		{
			System.out.println("The element is found at the index "+mid);
			break;
		}
		else if(arr[mid]<key)
		{
			//search value is high..so right side..so have to update the first index, last index remains same
		first=mid+1;
		}
		else if(arr[mid]>key)
		{
			//key so left side..first index same..update the last index
			last=mid-1;
			}
		
		}
		if(first>last)
		System.out.println("not found");
	}


	

	public static void main(String[] args) {
		BinarySearchUserInput obj=new BinarySearchUserInput();
		obj.binarysearchImpl();

	}

}
