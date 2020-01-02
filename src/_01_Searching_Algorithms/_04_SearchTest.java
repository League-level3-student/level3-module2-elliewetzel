package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
		@Test
		public void testLinearSearch() {
			_00_LinearSearch l = new _00_LinearSearch();
			String[] name = {"Molly", "Kieu", "Michael", "Hanan"};
			//1. use the assertEquals method to test your linear search method.
			assertEquals(3, l.linearSearch(name, "Hanan"));
			assertEquals(0, l.linearSearch(name, "Molly"));
			assertEquals(2, l.linearSearch(name, "Michael"));
	}
	@Test
	public void testBinarySearch() {
		_01_BinarySearch b = new _01_BinarySearch();
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] num= {2,4,6,7,9,10,15};
		assertEquals(0, b.binarySearch(num, 0, num.length, 2));
		assertEquals(3, b.binarySearch(num, 0, num.length, 7));
		assertEquals(6, b.binarySearch(num, 0, num.length, 15));
	}
	@Test
	public void testInterpolationSearch() {
		_02_InterpolationSearch in = new _02_InterpolationSearch();
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] num= {1,3,6,8,10,50,74};
		assertEquals(0, in.interpolationSearch(num, 1));
		assertEquals(3, in.interpolationSearch(num, 8));
		assertEquals(5, in.interpolationSearch(num, 50));
	}
	@Test
	public void testExponentialSearch() {
		_03_ExponentialSearch e = new _03_ExponentialSearch();
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] num = {1,3,6,8,10,50,70};
		assertEquals(0, e.exponentialSearch(num, 1));
		assertEquals(4, e.exponentialSearch(num, 10));
		assertEquals(6, e.exponentialSearch(num,70));
	}
}
