package com.practice.sorting.algorithms;

public class QuickSort {
	public int partition(int[] arr, int low, int high) {
		int pivot = arr[high], temp = 0, i = (low-1);
		for(int j = low; j < high; j++) {
			if(arr[j]<=pivot) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[i+1];
		arr[i+1] = pivot;
		arr[high] = temp;
		
		return i+1;
	}
	
	public int[] quick_sort(int[] arr, int low, int high) {
		if(low < high) {
			int value = partition(arr,low,high);
			quick_sort(arr,low,value-1);
			quick_sort(arr,value+1,high);
		}
		return arr;
	}
}
