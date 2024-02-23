package BigO;

public class theoryHowToCalculateBigO {
	//https://www.bigocheatsheet.com/  : check which data structure has what complexity 
	//this helps to know which Data structure / sorting / searching is best in our scenario

	//Big O is calculated on basis of
//	    1> time(No. of operations performed) 
//	    2>  space complexity(Space used by code)

	//3 cases can be there on the basic of number of operations to be performed
	//best case : omega Ω(n)  best case
	//average case : theta Θ   mid case
	//worst case : omicron (O): called big O

	//How to calculate O(n) : calculate number of operations
	//3 types can be get worst to best : O(n²)LOop within Loop , O(nlogn)(quicksort , merge sort) , 
	//O(n) propotional ,  Olog(n)divide and conquer , O(1)Constant
	 // O(a+b) , O(a*b) if 2 loops till different inputs  
	//
	// O(n)
	//  for(int i =0;i<n;i++){
	// }


	// O(n) = O(2n) : drop contraint so O(n)
	// for(int i =0;i<n;i++){
	// }
	// for(int j =0;i<n;i++){
	// }
	//
	//  O(n) = O(n²) :  loop inside loop running n*n times
	// for(int i =0;i<n;i++){
//	     for(int j =0;i<n;i++){
	// }
	// }


	// Drop non dominant : below runs O(n² + n) = :O(n²)  if we have n as 100 and n² is 10000 and if we add 100 then it does not effect much as dominant n² so remove n
	// for(int i =0;i<n;i++){
//	     for(int j =0;i<n;i++){
	// }
	// }
	//  for(int k =0;k<n;i++){
	// }


	//O(1) : best case only one operation ;
	//public int sum(int n){
	//return n +n;
	//}
	// if above returns n+n +n then 2 operations first n+n then again plus n so O(2) , but still said as O(1) as constant

	//BigO  : Olog(n) how many times a array should split to get 1 single element
	//for ex 8 elements [1-8] then dicvide get [1-4] then divide [1,2] then divide 1 
	//  Olog(n) : it is very efficent for ex. 8 elements then 3 times split in half to get 1 element
	//get log2(8) = 3 so getting 3 log2(16) then 4 time it should divide

	// for arrays O(1) if we look with index
	// arrays if we look with value if is O(n) as it can be at any nth position as well
	// adding element in array is O(1) as only last added but removing is O(n) as if 1st removed
	//all positions needs to be shifted


	// if n grows the worst case also grows exponentially
	// eg n=100  O(1)=1 , O(log n)=7 , O(n) = 100 , O(n²)= 10000 
}
