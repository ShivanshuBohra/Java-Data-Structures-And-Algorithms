package sorting;

import java.util.Arrays;

// select indexes for minimum and swaps
//O(n^2) inefficient
public class SelectionSort {
	 
	private static void  selectionSort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			if(i != minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,3,2,8,3,1};
		
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
