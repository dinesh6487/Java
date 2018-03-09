package com.dinesh.elumalai.java.alg.sorting;

import java.util.Arrays;

/**
 * 
 * @author Dinesh Elumalai
 * Below is an simple illustration of Bubble Sort 
 * Best time Complexity : O(n)
 * Avg time Complexity : O(n^2)
 * Worst time Complexity : O(n^2)
 * Worst Space Complexity : O(1)
 */
public class BubbleSort {

    public  static void doBubbleSort(int[] arr){
        int temp;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void  main(String args[]){
        int[] toSort = {123,3,234,57,623,8,4567,89};
        System.out.println(Arrays.toString(toSort));
        doBubbleSort(toSort);
        System.out.println(Arrays.toString(toSort));
    }

}
