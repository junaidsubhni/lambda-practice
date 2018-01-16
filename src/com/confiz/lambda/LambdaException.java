package com.confiz.lambda;

import java.util.function.BiConsumer;

public class LambdaException {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int key = 0;
		
		process(arr,key, exceptionWrapper((v, k) -> System.out.println(v/k)));

	}

	public static void process(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i : arr) {
			consumer.accept(i, key);;
		}	
	}
	
	public static BiConsumer<Integer, Integer> exceptionWrapper(BiConsumer<Integer, Integer> consumer){
		return (v,k) -> {
			try {
				consumer.accept(v, k);
			}catch (Exception e) {
				System.out.println("Exception Occured");
			}
		};
	}

}
