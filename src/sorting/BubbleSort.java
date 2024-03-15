package sorting;

import java.util.Arrays;

//compares element with all other in list 
// O(n^2) inefficient
public class BubbleSort {
	
	public static void bubbleSort(int[] intArray) {
		for(int i = intArray.length - 1 ; i>0 ;i--) {

		for(int j=0; j<i ;j++) {
			if(intArray[j] > intArray[j+1]) {
				int temp = intArray[j];
				intArray[j] =intArray[j+1];
				intArray[j+1] = temp;
			}
		}
		
		}
	}
	
	
  public static void main(String[] args) {
   int[] intArray = new int[]{1,10,3,4,17,21,6};
   
   bubbleSort(intArray);
   
   for(int i : intArray) {
	   System.out.println(i);
   }
   
  
}


  
}
