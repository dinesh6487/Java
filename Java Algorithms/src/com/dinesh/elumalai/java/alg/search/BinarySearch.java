package com.dinesh.elumalai.java.alg.search;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int left, int right, int find) {
		
		if (right>=left) {
			
			int mid = left + (right-left) /2;
			
			if(arr[mid]==find)
				return mid;
			
			if(arr[mid]>find)
				return binarySearch(arr, left, mid-1, find);
			return binarySearch(arr, mid+1, right, find);
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {34,45,2,6,5,84,23};
		int find = 84;
		int foundAt =binarySearch(arr, 0, arr.length-1, find);
		System.out.println(foundAt);
	}

}
