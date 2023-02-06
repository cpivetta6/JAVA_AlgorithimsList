package SearchAlgorithims;

public class BinarySearch {

	public static void main(String[] args) {
		
		//Binary Search: It is an efficient algorithm for finding an item from a sorted list of items.
		//It works by repeatedly dividing the list in half, searching the portion where the target value could be, 
		//and discarding the other half. The process continues until the target value is found or it is clear that the value is not in the list.
		
		//DIVIDE TO CONQUEST
	}
	
	public int binarySearch(int[] arr, int target) {
		   int left = 0;
		   int right = arr.length - 1;
		   
		   while (left <= right) {
		      int mid = left + (right - left) / 2;
		      if (arr[mid] == target) {
		         return mid;
		      } else if (arr[mid] < target) {
		         left = mid + 1;
		      } else {
		         right = mid - 1;
		      }
		   }
		   return -1;
		}
	
}
