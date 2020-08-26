package com.practice.sorting.algorithms;

public class SortingTest {
	public static void display(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		Insertion ins = new Insertion();
		int[] arr1 = {25,17,31,18,2};
		System.out.println("Inserstion Sort : ");
		SortingTest.display(ins.insertion_sort(arr1));
		Selection sel = new Selection();
		int[] arr2 = {8,11,14,15,12,13,7,4};
		System.out.println("Selection Sort : ");
		SortingTest.display(sel.selection_sort(arr2));
		Bubble bub = new Bubble();
		int[] arr3 = {6,2,1,8,3,9};
		System.out.println("Bubble Sort : ");
		SortingTest.display(bub.bubble_sort(arr3));
		System.out.println("Optimized Bubble Sort : ");
		SortingTest.display(bub.optimize_bubble_sort(arr3));
		Merge mer = new Merge();
		System.out.println("Merge Sort : ");
		SortingTest.display(mer.merge_sort(arr1, arr1.length));
		QuickSort qs = new QuickSort();
		int[] arr4 = {14,50,18,41,32};
		System.out.println("Quick Sort : ");
		SortingTest.display(qs.quick_sort(arr4, 0, arr4.length-1));
		Heap hp = new Heap();
		int[] arr5 = {18,16,14,22,17,19,15,12,13,8,24};
		System.out.println("Heap Sort : ");
		SortingTest.display(hp.heap_sort(arr5));
	}

}
