package com.dinesh.elumalai.java.alg.string;

import java.util.Scanner;

public class ArrayRotateLeft {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        rotateLeft(a,k);
        for(int i =0 ;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    private static void rotateLeft(int[] a, int k){
        for(int i=0;i<k;i++)
           rotateByOne(a);
    }
    private static void rotateByOne(int[] a){
        int i,temp;
            temp= a[0];
        for( i=0;i<a.length -1; i++)
            a[i]= a[i+1];
        a[i]= temp;
        
        
    }

}
