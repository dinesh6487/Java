package com.dinesh.elumalai.java.alg.stack;

import java.util.Arrays;

/**
 * 
 * @author Dinesh Elumalai
 *
 * @param <E>
 */
public class CustomStackUsingArray<E> {
	Object[] elements;
	private static final int default_size = 10;
	int size = 0;

	public CustomStackUsingArray() {
		elements = new Object[default_size];
	}

	public void push(E e) {
		if(size == elements.length){
			increaSize();
		}
		elements[size++] = e;
	}

	private void increaSize() {
		int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);		
	}

	@SuppressWarnings("unchecked")
	public E pop() {
		E e = (E) elements[--size];
		elements[size] = null;
		return e;
	}
	
	@Override
	public String toString() {
		return "CustomStack [elements=" + Arrays.toString(elements) + ", size=" + size + "]";
	}

	public static void main(String[] args) {
		CustomStackUsingArray<Integer> stack = new CustomStackUsingArray<>();
		 
        for (int i = 0; i <15; i++) {
			stack.push((int) (Math.random()*100));
		}
         
        System.out.println(stack);
        for (int i = 0; i <3; i++) {
        	System.out.println( "Item Poped : "+stack.pop() );
        } 
        System.out.println( stack );
	}

}
