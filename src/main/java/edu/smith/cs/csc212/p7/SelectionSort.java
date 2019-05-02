package edu.smith.cs.csc212.p7;

import edu.smith.cs.csc212.adtr.ListADT;

/**
 * SelectionSort is a simple sort that is O(n^2).
 * @author ctmilton
 *
 */
public class SelectionSort {
	/**
	 * Finds the minimum value in the list
	 * @param input - the list to be sorted.
	 * @param start - the index of the list in which to start a loop.
	 */
	private static int findMin(ListADT<Integer> input, int start) {
		int min = input.getIndex(start);
		int minIndex = 0;
		for (int i = start; i < input.size(); i++) {
			int current = input.getIndex(i);
			if (min > current) {
				min = current;
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	/**
	 * Selection Sort takes the smallest number and puts it at the front of the list.
	 * @param input - the list to be sorted.
	 */
	public static void selectionSort(ListADT<Integer> input) {
		int N = input.size();
		
		while(true) {
			int start = 0;
			boolean sorted = true;
			for (int i=0; i < N-1; i++) {
				input.swap(i, findMin(input, start));
				start++;
				sorted = false;
			}
			if (sorted) {
				break;
			}
			N--;
		}
	}
}
