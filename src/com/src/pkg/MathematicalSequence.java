package com.src.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathematicalSequence {
	private static int FIRST_INDEX = 0;
	private static int SECOND_INDEX = 1;

	public static void main(String args[]) {
		// input
		ArrayList<String> userInputs = new ArrayList<String>(Arrays.asList(args));
		ArrayList<Integer> input = new ArrayList<Integer>();

		for (String s : userInputs)
			input.add(Integer.valueOf(s));

		System.out.println("input =>" + input);

		// validtion
		if (userInputs.size() < 2) {
			System.out.println("No match");
			return;
		}

		if (isFibonacci(input)) {
			System.out.println("Fibonacci");

		} else if (isArthProgression(input)) {
			System.out.println("AP");
		} else if (isGeoProgression(input)) {
			System.out.println("GP");
		} else {
			System.out.println("No match");
		}
	}

	public static boolean isFibonacci(List<Integer> input) {
		boolean result = true;
		
		
		int firstElement = -1;
		int secondElement = -1;
		for (Integer element : input) {

			if (firstElement == -1) {
				firstElement = element;
				continue;
			}
			
			if (secondElement == -1) {
				secondElement = element;
				continue;
			}

			if ((firstElement + secondElement ) != element) {
				result = false;
				break;
			}
			
			firstElement = secondElement;
			secondElement = element; 
		}
		
		
		return result;
	}

	public static boolean isArthProgression(List<Integer> input) {
		boolean result = true;
		double ratio = input.get(SECOND_INDEX) - input.get(FIRST_INDEX);

		if (ratio == 0) {
			return false;
		}

		double nextElement = 0;
		for (Integer element : input) {

			if (nextElement <= 0) {
				nextElement = element + ratio;
				continue;
			}

			if (nextElement != element) {
				result = false;
				break;
			}

			nextElement = element + ratio;
		}
		return result;
	}

	public static boolean isGeoProgression(List<Integer> input) {
		if(input.get(FIRST_INDEX) == 0 || input.get(SECOND_INDEX) == 0 ) {
			return false;
		}
		
		boolean result = true;
		double ratio = input.get(SECOND_INDEX) / input.get(FIRST_INDEX);

		if (ratio == 0) {
			return false;
		}

		double nextElement = 0;
		for (Integer element : input) {

			if (nextElement <= 0) {
				nextElement = element * ratio;
				continue;
			}

			if (nextElement != element) {
				result = false;
				break;
			}

			nextElement = element * ratio;
		}

		return result;
	}

}
