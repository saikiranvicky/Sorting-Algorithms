package com.practice.sorting.algorithms;

public class Bubble {
	public int[] bubble_sort(int[] arr) {
		int size = arr.length, temp = 0;
		for(int i = size-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public int[] optimize_bubble_sort(int[] arr) {
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			boolean swap = false;
			for(int j = 0; j < arr.length - i -1; j++) {
				 if(arr[j]>arr[j+1]) {
					 temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
					 swap = true;
				 }
			}
			if(swap == false) {
				break;
			}
		}
		return arr;
	}
}
