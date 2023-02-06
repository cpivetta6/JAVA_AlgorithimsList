package SearchAlgorithims;

public class LinearSearch {

	//Linear Search: It is a simple search algorithm that checks each item in a list sequentially until the target value is found 
	//or it is clear that the value is not in the list. It is not as efficient as binary search, especially for large lists.
	
	//LINEAR SEARCH DONT DIVIDE TO CONQUEST
	
	public int linearSearch(int[] arr, int target) {
		   for (int i = 0; i < arr.length; i++) {
		      if (arr[i] == target) {
		         return i;
		      }
		   }
		   return -1;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
