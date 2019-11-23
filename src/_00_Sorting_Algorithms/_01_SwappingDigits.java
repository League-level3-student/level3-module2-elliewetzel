package _00_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _01_SwappingDigits {

	@Test
	void test() {
		int[] x = {5, 6};
		int[] y = {6, 5};
		swapArrayOfTwo(x);
		assertArrayEquals(y, x);
		
		int[] z = {7, 3, 5, 9, 2};
		int[] q = {2, 3, 5, 7, 9};
		sortIntArray(z);
		assertArrayEquals(q, z);
		
		int[] m = {7, 3, 9, 5, 2};
		assertEquals(5, findMiddle(m));
	}
	//1. Complete the method so that the first two elements of the array are swapped
	public static void swapArrayOfTwo(int[] arr) {
		int i = arr[0];
		arr[1] = arr[0];
		arr[1] = i;
	}
	//2. Complete the method so that it sorts the array using a bubble sort.
	//   Iterate through the array and when you find two elements that are out
	//   of order, swap them. Repeat this until the array is in order.
	public static void sortIntArray(int[] arr) {
	for(int k = 0; k < arr.length-1; k++) {
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] < arr[i-1]) {
				int f = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = f;
			}
		}
	}
		/*boolean swap = true;
		while(swap) {
			swap = false;
				for(int j = 0; j < arr.length; j++) {
					if(arr[j] > arr[j+1]) {
						int g = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = g;
						swap = true;
					}
				}  
			}*/
	}	
	//3. Complete the method so that it finds the middle number in the array.
	//   *Hint* it helps to sort it first.
	//   *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		sortIntArray(arr);
		int m = arr.length/2;
		int v = 0; 
		for(int i = 0; i < arr.length-1; i++) {
			if(m ==i) {
				v = arr[i];
			}
		}
		return v;
		
		/*int j = arr.length;
		sortIntArray(arr);
		if(j % 2==1) {
			j /= 2;
			return arr[j];
		}
		else {
		j /= 2.5;
		return arr[j+1];
		}*/
		
	}
}
