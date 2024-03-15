package sorting;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// take pointer at both aarays and check compare and add in result
public class MergeSortedArray {
	
	
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
		// IntStream is used to handle primitive type int . 
//		return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
//                .sorted()
//                .toArray();
		
				}
	
public static void main(String[] args) {
	int[] arr1 = new int[] {1,4,5,9};
	int[] arr2 = new int[] {2,3,11};

	System.out.println(	Arrays.toString( merge(arr1 , arr2)));

}


}
