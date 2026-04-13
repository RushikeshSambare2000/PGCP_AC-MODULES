package com.pgcp.feb26;

import java.util.ArrayList;

public class ArrayVSArrayList {

	public static void main(String[] args) {
		 int n = 1000000;

	        // -----------------------
	        // ARRAY TEST
	        // -----------------------
	        int[] arr = new int[n];

	        long startArrayInsert = System.nanoTime();

	        for (int i = 0; i < n; i++) {
	            arr[i] = i;
	        }

	        long endArrayInsert = System.nanoTime();

	        System.out.println("Array Insert Time: "
	                + (endArrayInsert - startArrayInsert) + " ns");


	        // Update test
	        long startArrayUpdate = System.nanoTime();

	        arr[50000] = 999;

	        long endArrayUpdate = System.nanoTime();

	        System.out.println("Array Update Time: "
	                + (endArrayUpdate - startArrayUpdate) + " ns");


	        // -----------------------
	        // ARRAYLIST TEST
	        // -----------------------

	        ArrayList<Integer> list = new ArrayList<>();

	        long startListInsert = System.nanoTime();

	        for (int i = 0; i < n; i++) {
	            list.add(i);
	        }

	        long endListInsert = System.nanoTime();

	        System.out.println("ArrayList Insert Time: "
	                + (endListInsert - startListInsert) + " ns");


	        // Update test
	        long startListUpdate = System.nanoTime();

	        list.set(50000, 999);

	        long endListUpdate = System.nanoTime();

	        System.out.println("ArrayList Update Time: "
	                + (endListUpdate - startListUpdate) + " ns");


	        // -----------------------
	        // INSERT AT BEGINNING TEST
	        // -----------------------

	        long startInsertBeginning = System.nanoTime();

	        list.add(0, 111);

	        long endInsertBeginning = System.nanoTime();

	        System.out.println("ArrayList Insert at Beginning Time: "
	                + (endInsertBeginning - startInsertBeginning) + " ns");


	}

}
