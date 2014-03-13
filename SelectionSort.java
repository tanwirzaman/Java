public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			int arr[]={2,6,14,7,1,33,8,29,0,-5,11};
			arr=selectionSort(arr);
			for(int i: arr)
				System.out.print(i+" ");
	}

	

	private static int[] selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr;
	}

}
