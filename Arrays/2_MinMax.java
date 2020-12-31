// Program to find Minimum and Maximum of an array, using Minimum number of Comparisions

// Author: AJ


// Linear Search
class MinMax {
	
	static class MinMaxPair {
		int min;
		int max;
	}

	public static MinMaxPair findMinMax(int[] array, int n) {
		
		MinMaxPair res = new MinMaxPair();
		
		if (n == 1) {
			res.min = array[0];
			res.max = array[0];
			return res;
		}

		if (array[0] > array[1]) {
			res.max = array[0];
			res.min = array[1];
		} else {
			res.max = array[1];
			res.min = array[0];
		}

		for (int i = 2; i < n; i++) {

			if (array[i] < res.min) {
				res.min = array[i];
			} else if (array[i] > res.max) {
				res.max = array[i];
			}
		}

		return res;

	}

	public static void main(String[] args) {

		int[] array = new int[] {14, 62, 31, 84, 53, 46, 7,  28, 19, 10};
		MinMaxPair pair = findMinMax(array, array.length);
		System.out.println("Maximum: " + pair.max);
		System.out.println("Minimum: " + pair.min);
	}
}


/*
// Tournament Method
class MinMax {
	
	static class MinMaxPair {
		int min;
		int max;
	}

	public static MinMaxPair findMinMax(int[] array, int start, int end) {
		
		MinMaxPair res = new MinMaxPair();
		
		if (start == end) {
			res.min = array[start];
			res.max = array[end];
			return res;
		}

		if (start == end + 1) {
			if (array[start] > array[end]) {
				res.max = array[start];
				res.min = array[end];
			} else {
				res.max = array[end];
				res.min = array[start];
			}
		}

		int mid = (start + end) / 2;

		MinMaxPair pairLeft = findMinMax(array, start, mid);
		MinMaxPair pairRight = findMinMax(array, mid + 1, end);

		if (pairLeft.max > pairRight.max) {
			res.max = pairLeft.max;
		} else {
			res.max = pairRight.max;
		}

		if (pairLeft.min < pairRight.min) {
			res.min = pairLeft.min;
		} else {
			res.min = pairRight.min;
		}

		return res;

	}

	public static void main(String[] args) {

		int[] array = new int[] {14, 62, 31, 84, 53, 46, 7,  28, 19, 10};
		MinMaxPair pair = findMinMax(array, 0, array.length - 1);
		System.out.println("Maximum: " + pair.max);
		System.out.println("Minimum: " + pair.min);
	}
}
*/

/*
// Comparing in Pairs
class MinMax {
	
	static class MinMaxPair {
		int min;
		int max;
	}

	public static MinMaxPair findMinMax(int[] array, int n) {
		
		MinMaxPair res = new MinMaxPair();
		
		if (n%2 != 0) {
			res.min = array[0];
			res.max = array[0];
			return res;
		} else {

			if (array[0] > array[1]) {
				res.max = array[0];
				res.min = array[1];
			} else {
				res.max = array[1];
				res.min = array[0];
			}
		}

		int i = 2;

		while (i < n) {
			if (array[i] < array[i + 1]) {
				if (array[i] < res.min) {
					res.min = array[i];
				}
				if (array[i + 1] > res.max) {
					res.max = array[i + 1];
				}
			} else {
				if (array[i] > res.max) {
					res.max = array[i];					
				}
				if (array[i + 1] < res.min) {
					res.min = array[i + 1];
				}
			}

			i += 2;
		}

		return res;

	}

	public static void main(String[] args) {

		int[] array = new int[] {14, 62, 31, 84, 53, 46, 7,  28, 19, 10};
		MinMaxPair pair = findMinMax(array, array.length);
		System.out.println("Maximum: " + pair.max);
		System.out.println("Minimum: " + pair.min);
	}
}
*/