package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for(int jj = 0; jj < array.length-1; jj++) {
			for(int j = 0; j < array.length-jj-1; j++) {
				if(array[j+1] < array[j]) {
					int sub = array[j];
					array[j] = array[j+1];
					array[j+1] = sub;
					display.updateDisplay();
				}
			}
		}
	}
	
}
