package com.devops;

import java.util.Arrays;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] array = {2,6,7,9,10};
		reverse(array);
	}
	
	static void reverse(int[] array) {
		for (int i= 0; i <array.length/ 2; i++) {
		int other= array.length - i - 1;
		 int temp= array[i];
		 array[i] = array[other];
		 array[other] = temp;
		 //System.out.println(array[other]);
		 }
		System.out.println(Arrays.toString(array));
		 } 
}
