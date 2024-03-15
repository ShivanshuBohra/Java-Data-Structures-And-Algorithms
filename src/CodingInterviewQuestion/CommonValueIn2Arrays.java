package CodingInterviewQuestion;

import java.awt.event.ItemEvent;
import java.util.HashMap;

//to check if any common valiue in 2 Arrays
// if we loop each element of table 1 in table 2 :: BigO is (n²) 
// to make if more efficient use hashMap .. it will be O(2n) = O(n)
public class CommonValueIn2Arrays {
	
	public  static boolean itemInCommon(int[] arr1 , int[] arr2) {
		HashMap<Integer, Boolean> hmap = new HashMap<Integer, Boolean>();
		
		for (int i : arr1) {
			hmap.put(i, true);
		}
		for (int j : arr2) {
			if(hmap.get(j) != null) {
				return true;
			}
		}
		return false;
		
	}
   
	public static void main(String[] args) {
		int[] arr1 = {1,3,5};
		int[] arr2 = {2,4, 5};
		System.out.println(itemInCommon(arr1, arr2));
		
	}
}
