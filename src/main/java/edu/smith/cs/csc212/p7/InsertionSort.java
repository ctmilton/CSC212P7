package edu.smith.cs.csc212.p7;

import edu.smith.cs.csc212.adtr.ListADT;
import edu.smith.cs.csc212.adtr.real.JavaList;

/**
 * InsertionSort is a simple sort that is O(n^2).
 * @author ctmilton
 *
 */
public class InsertionSort {
	/**
	 * Finds the middle value in the list
	 * Used this website to understand binary search: https://www.geeksforgeeks.org/binary-search/
	 * @param input - the list to be sorted.
	 * @param middle - the index of the list in which to start a loop.
	 */
	private static int binarySearch(ListADT<Integer> sorting, int middle) {
		// I am not sure how to go about this.
		int mid = sorting.size()/2;
		if (sorting.getIndex(mid) == middle) {
			return (mid);
		} else if (sorting.getIndex(mid) < middle) {
			ListADT<Integer> leftSlice = sorting.slice(0, mid);
			return binarySearch(leftSlice, middle);
		} else {
			ListADT<Integer> rightSlice = sorting.slice(mid, sorting.size());
			return binarySearch(rightSlice, middle);
		}
	}
	
	
	/**
	 * Selection Sort takes the smallest number and puts it at the front of the list.
	 * @param input - the list to be sorted.
	 */
	public static void insertionSort(ListADT<Integer> input) {
		int N = input.size();
		
		// use a binary search to possibly get extra credit
		// split the list into 2 lists using slice function
		while(!input.isEmpty()) {
			// take first value and place it in correct spot in new list
			// all before it must be smaller and all after must be greater
			ListADT<Integer> sorting = new JavaList<>();
			for (int i=0; i < N-1; i++) {
				if (sorting.isEmpty()) {
					sorting.addFront(input.getFront());
					input.removeFront();
				} else {
					// divide sorted.size() in half to get middle index
					int middle = sorting.getIndex((sorting.size()/2));
					// if input.getFront() is smaller than middle value,
					int result = binarySearch(sorting, 0, sorting.size(), middle);
					//if (input.getFront())
					// put the new value before middle value,
					// else, put the new value after middle value
				}
			}
			N--;
		}
	}
}
