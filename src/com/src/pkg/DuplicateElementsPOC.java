package com.src.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElementsPOC {

	public static void main(String args[]) {

		int arr[] = { 1, 2, 5, 4, 1, 2, 5, 6, 6, 7, 8, 9, 1, 2 };
		ArrayList<Integer> duplicateList = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int currentElement = arr[i];

			// if(currentElement==arr[j] && !duplicateList.contains(currentElement))
			if (!duplicateList.contains(currentElement)) {
				duplicateList.add(currentElement);
			}

		}
		System.out.println(duplicateList);
	}

}
