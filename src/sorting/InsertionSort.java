package sorting;

import java.util.Arrays;

// big O is O(n^2) but if sorted array is there then it is O(n)
// compared each element with previous element and swaps
public class InsertionSort {
	
	private static void insertionSort(int[] arr) {
		for (int i = 1 ; i < arr.length ;i++) {
			int temp = arr[i];
			int j = i-1;
			//add j>-1 for the case when 1st element is smaller then 0th pos 
		// add j>-1 in first as when j is -1 then arr[j] will give error
			while(j>-1 &&  temp < arr[j]) {
				arr[j+1] = arr[j];
				arr[j] =temp;
				j--;
			}
			
		}
	}

	 public static void main(String[] args) {
		int arr[] = new int[] {2,1,4,3,9,5,3,2};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
