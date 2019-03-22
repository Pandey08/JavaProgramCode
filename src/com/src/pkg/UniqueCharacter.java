package com.src.pkg;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr = "My Name is Bishal Pandey";
		// String arr = "MaMt";
		arr = arr.toLowerCase();
        
		int len = arr.length();
		for (int i = 0; i < len; i++) {
			Character currentChar = arr.charAt(i);

			boolean isDuplicate = false;

			for (int j = 0; j < len; j++) {

				Character character = arr.charAt(j);

				// ignoring the Current character position taken for iteration
				if (i == j) {
					continue;
				}

				if (currentChar.equals(character)) {
					isDuplicate = true;
					break;
				}

			}

			if (!isDuplicate)
				System.out.print(currentChar + " ");
		}

		
	}
	

}
