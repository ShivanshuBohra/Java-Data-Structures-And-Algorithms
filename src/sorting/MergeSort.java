package sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

// divide the array  into half until we reach single element arrays and then merge them
// big O is O(n log n) : o(log n ) as array divided in half times and them combines n times
// eg if 8 items 3 steps needed (2power 3)
public class MergeSort {
	
		private static int[] merge(int[] arr1, int[] arr2) {
			int[] combined = new int[arr1.length + arr2.length];
			int index =0; //pointer to combined array
			int i= 0;    // pointer to 1st array
			int j = 0;   // pointer to 2nd array
			
			while(i<arr1.length && j< arr2.length) {
				if(arr1[i] < arr2[j]) {
					combined[index] = arr1[i];
					index ++;
					i++;
				}
				else {
					combined[index] = arr2[j];
					index ++;
					j++;
				}
			}
			
			// there can be case when one list is empty but other element are remaining
			while(i < arr1.length) {
				combined[index] =arr1[i];
				index ++;
				i++;
			}
			while(j < arr2.length) {
				combined[index] =arr2[j];
				index ++;
				j++;
			}
			
			return combined;	
			}
		
		public static int[] mergeSort(int[] array) {
			if(array.length ==1) return array;
			int midIndex = array.length/2;
			// copy od range exclude last elemet 0-midindex midindex will not be considered
			int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
			int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
            
			return merge(left,right);
			
		}
		
		public static void main(String[] args) {
			int[] originalArray = new int[] {3,1,4,2,2,1,2,1,1,1,3,4};
			int[] sortedArray = mergeSort(originalArray);
			
			System.out.println(Arrays.toString(sortedArray));
		}
		
		

}
