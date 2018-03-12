package com.dinesh.elumalai.java.alg.sorting;

import java.util.Arrays;

/**
 * 
 * @author Dinesh Elumalai
 * Below is an simple illustration of Merge Sort 
 * Best time Complexity : O(nlogn)
 * Avg time Complexity : O(nlogn)
 * Worst time Complexity : O(nlogn)
 * Worst Space Complexity : O(n)
 */
public class MergeSort {
	
	
	 public static void main(String a[]){
         
	        Integer[] arr = {34,45,565,3,324,6436};
	        System.out.println(Arrays.toString(arr));
	        sort(arr);
	        System.out.println(Arrays.toString(arr));
	    }
	 
        
    @SuppressWarnings("unchecked")
	static void sort(Comparable<Integer>[] arr) {
    		if(arr.length<=1) {
    			return;
    		}
    		Comparable<Integer>[] first =new Comparable[arr.length / 2];
    		Comparable<Integer>[] second =new Comparable[arr.length-first.length];
    		System.arraycopy(arr, 0, first, 0, first.length);
    		System.arraycopy(arr, first.length, second, 0, second.length);
    		
    		sort(first);
    		sort(second);
    		merge(first,second,arr);
    }

	private static void merge(Comparable<Integer>[] first, Comparable<Integer>[] second, Comparable<Integer>[] arr) {
		
		int iFirst = 0,iSecond = 0,iMerged = 0;
		 
		while(iFirst<first.length && iSecond < second.length) {
			if(first[iFirst].compareTo((Integer) second[iSecond])<  0) {
				arr[iMerged]= first[iFirst];
				iFirst++;
			}else {
				arr[iMerged]=second[iSecond];
				iSecond++;
			}
			iMerged++;
			
		}
		System.arraycopy(first, iFirst, arr, iMerged, first.length-iFirst);
		System.arraycopy(second, iSecond, arr, iMerged, second.length-iSecond);
	}
}
