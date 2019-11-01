package com.devops;

public class SumProduct {

	static void foo(int[] array) {
		 int sum = 0;
		 int product = 1;
		 for (int i= 0; i < array.length; i++) {
		 sum += array[i];
		 }
		 for (int i= 0; i < array.length; i++) {
		 product*= array[i];
		 }
		 System.out.println(sum + ", " + product);
		 }
	public static void main(String[] args) {
		 
		int[] array={1,4,8,8,8,3,6};
		SumProduct.foo(array);
	}
}
