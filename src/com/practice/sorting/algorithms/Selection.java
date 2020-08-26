package com.practice.sorting.algorithms;

public class Selection {
	public int[] selection_sort(int[] arr) {
		
		int temp = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			int min_value = Integer.MAX_VALUE;
			int min_index = i;
			
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j]<min_value) {
					min_value = arr[j];
					min_index = j;
				}
			}
			
			if(arr[i]>arr[min_index]) {
				temp = arr[i];
				arr[i] = arr[min_index];
				arr[min_index] = temp;
			}
		}
		
		return arr;
	}
}
