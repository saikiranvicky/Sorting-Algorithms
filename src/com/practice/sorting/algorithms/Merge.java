package com.practice.sorting.algorithms;

public class Merge {
	public int[] merge_sort(int[] arr, int n) {
		if(n<2) {
			return arr;
		}
		int middle = n/2;
		int[] left_arr = new int[middle];
		int[] right_arr = new int[n-middle];
		for(int i = 0; i < middle; i++) {
			left_arr[i] = arr[i];
		}
		for(int j = middle; j < n; j++) {
			right_arr[j-middle] = arr[j]; 
		}
		merge_sort(left_arr,middle);
		merge_sort(right_arr, (n-middle));
		merge(left_arr, right_arr, arr);
		return arr;
	}

	private void merge(int[] left_arr, int[] right_arr, int[] arr) {
		// TODO Auto-generated method stub
		int i = 0, j =0, k = 0;
		while(i<left_arr.length && j<right_arr.length) {
			if(left_arr[i]<=right_arr[j]) {
				arr[k++] = left_arr[i++];
			}
			else {
				arr[k++] = right_arr[j++];
			}
		}
		while(i<left_arr.length) {
			arr[k++] = left_arr[i++];
		}
		while(j<right_arr.length) {
			arr[k++] = right_arr[j++];
		}
	}
}
