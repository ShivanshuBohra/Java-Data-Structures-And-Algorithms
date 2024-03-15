package sorting;

import java.util.Arrays;
// big O : (O n logn) best case and medium case
//worst case (everything sorted) :O(n^2)  , use insertion sort for sorted data 

//1> Choose a pivot element from the array.
//2>Partition the array such that all elements less than the pivot are placed before it, 
//and all elements greater than the pivot are placed after it.
//3>Recursively apply the above steps to the subarrays on the left and right 
//of the pivot until the entire array is sorted.

public class QuickSort {
	
	private static void swap(int[] array , int firstIndex , int secondIndex) {
	int temp = array[firstIndex];
	array[firstIndex] = array[secondIndex];
	array[secondIndex] = temp;
	}
	
	// rearranges the array pivotIndex is start of array and it changes arrays such that
	// all smaller are to pivot index are to left and large ones to right
	// returns index of pivot 
	private static int pivot(int[] array , int pivotIndex , int endIndex) {
		int swapIndex = pivotIndex;
		
		for(int i =pivotIndex+1 ; i<endIndex ;i++) {
			if(array[i]< array[pivotIndex]) {
				swapIndex++;
				swap(array , swapIndex ,i);
			}
		}
		swap(array, pivotIndex , swapIndex);
		return swapIndex;
	}
	
	
	public static void quickSort(int[] array , int left , int right) {
		if(left<right) {
		int pivotIndex =pivot(array, left , right);
		quickSort(array, left, pivotIndex-1);
		quickSort(array, pivotIndex +1, right);
		}
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {1, 7,1,3,2,9, 1};
		quickSort(array, 0, array.length);
		System.out.println(Arrays.toString(array));
	}

}
