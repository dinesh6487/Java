package com.dinesh.elumalai.java.alg.sorting;

import java.util.Arrays;

/**
 * 
 * @author Dinesh Elumalai
 * Below is an simple illustration of Selection Sort 
 * Best time Complexity : O(n^2)
 * Avg time Complexity : O(n^2)
 * Worst time Complexity : O(n^2)
 * Worst Space Complexity : O(1)
 */
public class SelectionSort {

    public static void doSelectionSort(int[] arr){

        for (int i = 0; i <arr.length-1 ; i++) {
            int index = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[index])
                    index = j;
            }
            int smallest = arr[index];
            arr[index] = arr[i];
            arr[i] = smallest;
        }
    }

    public static void  main(String args[]){
        int[] toSort = {1,45,20,33,526,57,623,8};
        System.out.println(Arrays.toString(toSort));
        doSelectionSort(toSort);
        System.out.println(Arrays.toString(toSort));
    }
}
