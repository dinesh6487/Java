package com.dinesh.elumalai.java.alg.sorting;

import java.util.Arrays;

/**
 * 
 * @author Dinesh Elumalai
 * Below is an simple illustration of Insertion Sort 
 * Best time Complexity : O(n)
 * Avg time Complexity : O(n^2)
 * Worst time Complexity : O(n^2)
 * Worst Space Complexity : O(1)
 */
public class InsertionSort {

    public static void doInsertionSort(int[] arr){

        int temp;
        for (int i = 1; i <arr.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void  main(String args[]){
        int[] toSort = {10,3,56,57,623,8};
        System.out.println(Arrays.toString(toSort));
        doInsertionSort(toSort);
        System.out.println(Arrays.toString(toSort));
    }
}
