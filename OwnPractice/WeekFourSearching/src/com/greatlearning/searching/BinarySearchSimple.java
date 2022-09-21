package com.greatlearning.searching;

public class BinarySearchSimple {
	
	
	public void BinarySearchImpl(int[] arr,int first,int last,int key)
	{
	//search start from middle index
		
		
		//again and again have to search and update the mid..so loop
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
		
int[] myArr= {1,2,3,4,5,6,7,8};//ascending order
int searchElement=8;
int firstIndex=0;
int lastIndex=myArr.length-1;
BinarySearchSimple obj=new BinarySearchSimple();
obj.BinarySearchImpl(myArr,firstIndex,lastIndex,searchElement);
	}

}
