// Program to Reverse an array

// Author: AJ


// Iterative Solution
class ReverseArray {

	public static void reverseArray(int[] array, int n) {

		int temp = 0;
		for (int i = 0; i < n; i++) {

			if (i >= n/2) break;
			
			temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}	

	}

	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7,  8, 9, 10};
		reverseArray(array, array.length);
		printArray(array);

	}

}


/*
// Recusrive Solution
class ReverseArray {

	public static void reverseArray(int[] array, int start, int end) {

		System.out.println("HI");

		if (start >= end) {
			return;
		}

		int temp = 0;
		temp = array[start];
		array[start] = array[end];
		array[end] = temp;

		reverseArray(array, ++start, --end);	

	}

	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		reverseArray(array, 0, 9);
		printArray(array);

	}
}
*/