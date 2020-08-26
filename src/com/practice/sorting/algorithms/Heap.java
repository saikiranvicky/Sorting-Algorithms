package com.practice.sorting.algorithms;

//import java.util.Arrays;

public class Heap {
	public int[] max_heapify(int[] arr,int n, int index){
		if(2*index >= arr.length-1) {
			return arr;
		}
		int left = 2*index + 1;
		int right = 2*index + 2;
		int largest, temp;
		if(left<n && arr[left] > arr[index]) {
			largest = left;
		}else {
			largest = index;
		}
		if(right < n && arr[right] > arr[largest]) {
			largest = right;
		}
		if(largest!=index) {
			temp = arr[index];
			arr[index] = arr[largest];
			arr[largest] = temp;
			max_heapify(arr, n , largest);
		}
		return arr;
	}
	public int[] build_max_heap(int[] arr) {
		int heap_size = arr.length;
		int half_height = (arr.length-1)/2 ;
		for(int i = half_height; i >= 0 ; i--) {
			max_heapify(arr,heap_size,i);
		}
		return arr;
	}
	
	public int[] heap_sort(int[] arr) {
		build_max_heap(arr);
		int heap_size = arr.length;
		for(int i = arr.length-1; i>0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heap_size = heap_size - 1;
			max_heapify(arr,heap_size,0);
		}
		return arr;
	}
	
}
