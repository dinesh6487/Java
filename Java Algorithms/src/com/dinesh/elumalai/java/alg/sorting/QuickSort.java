package com.dinesh.elumalai.java.alg.sorting;

import java.util.Arrays;

/**
 * 
 * @author Dinesh Elumalai 
 * Below is an simple illustration of Quick Sort 
 * Best time Complexity : O(nlogn)
 * Avg time Complexity : O(nlogn)
 * Worst time Complexity : O(n^2)
 * Worst Space Complexity : O(logn)
 */
public class QuickSort {
	
	public static void main(String[] args) {
		int[] x = { 9, 2, 4, 10, 8, 6 };
		System.out.println(Arrays.toString(x));
		int low = 0;
		int high = x.length - 1;
		quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
	}

	private static void quickSort(int[] x, int low, int high) {
		
		//Check for null and break if low is greater than equal to high
		if(x ==null || x.length <=0 || low>=high) {
			return;
		}
		//Setting the pivot to x[high]
		int pivot = x[high];
		int left = low, right = high;
		while(left<=right) {
			//Check until all values on left side array are lower than pivot
			while(x[left]<pivot) {
				left++;
			}
			//Check until all values on left side array are greater than pivot
			while(x[right]>pivot) {
				right--;
			}
			//Now compare values from both side of lists to see if they need swapping
            //After swapping move the iterator on both lists
			if(left<=right) {
				swap(x,left,right);
				left++;
				right--;
			}
			
		}
		//Do same operation as above recursively to sort two sub arrays
		if(low<right) {
			quickSort(x, low, right);
		}
		if(high>left) {
			quickSort(x, left, high);
		}
		
	}

	private static void swap(int[] x, int left, int right) {
		int temp = x[left];
		x[left] = x[right];
		x[right]= temp;
		
	}

	

	

}