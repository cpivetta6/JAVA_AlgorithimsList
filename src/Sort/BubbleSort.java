package Sort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] array = {9,8,7,6,5,4,3,2,1};
		int num;
		
		for(int i = array.length - 1; i > 0; i--) {
			for(int j = 0; j < i-1; j++) {
				if(array[j] > array[j+1]) {
					num = array[j];
					array[j] = array[j+1];
					array[j+1] = num;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(i);
		}
		
		
		
	}
	
}
