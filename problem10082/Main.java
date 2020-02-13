package com.company;

import java.io.BufferedInputStream;
import java.util.*;

class Main {

	public static void main(String []args) {
		Scanner input = new Scanner(new BufferedInputStream(System.in));
		char[][] keyboard = {
				{'`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '='},
				{'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', '[', ']', '\\'},
				{'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ';', '\''},
				{'Z', 'X', 'C', 'V', 'B', 'N', 'M', ',', '.', '/'}
		};

		HashMap<Character, Character> oneAway = new HashMap<>();
		for(char[] row : keyboard) {
			for(int i = 1; i < row.length; i++) {
				oneAway.put(row[i], row[i-1]);
			}
		}

		while (input.hasNextLine()) {
			String a = input.nextLine();

			StringBuilder builder = new StringBuilder();

			for (int i = 0; i < a.length(); i++) {
				char charToCheck = a.charAt(i);
				if (a.charAt(i) == ' ') {
					builder.append(charToCheck);
				} else {
					builder.append(oneAway.get(charToCheck));
				}
			}

			System.out.println(builder.toString());
		}
	}
}