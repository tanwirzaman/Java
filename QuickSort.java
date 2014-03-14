package edu.interview;

public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numbers[]={5,4,2,8,7,3,-1,-2,9,12,47};
		Quicksort(numbers,0,numbers.length-1);
		for(int i:numbers)
			System.out.print(i+" ");
	}

	private static void Quicksort(int[] arr, int low, int high) {
		int index=partition(arr,low,high);
		if(low < index-1)
		{
			Quicksort(arr,low,index-1);
		}
		if(index < high)
		{
			Quicksort(arr,index,high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int i=low;
		int j=high;
		int pivot=arr[(low+high)/2];
		
		while(i<=j)
		{
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			if(i<=j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}			
		}
		return i;
	}

}
