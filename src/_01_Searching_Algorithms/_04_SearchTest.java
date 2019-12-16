package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	String[] molly = {"1200", "205", "0673", "294", "29584", "2857", "284", "29475", "3957", "283", "8146", "955", "312"};
	
	int[] book = {3, 5, 8, 9, 13, 15, 19, 26, 27, 50};
	
	@Test
	public void testLinearSearch() {
		_00_LinearSearch l = new _00_LinearSearch();
		//1. use the assertEquals method to test your linear search method.
		assertEquals(5, l.linearSearch(molly, "1200"));
		assertEquals(0, l.linearSearch(molly, "205"));
		assertEquals(30, l.linearSearch(molly, "0673"));
	}
	@Test
	public void testBinarySearch() {
		_01_BinarySearch b = new _01_BinarySearch();
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
