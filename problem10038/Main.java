package com.company;

import java.io.BufferedInputStream;
import java.util.BitSet;
import java.util.Scanner;

class Main {

	public static void main(String []args) {
		Scanner input = new Scanner(new BufferedInputStream(System.in));

		while (input.hasNextLine()) {
			boolean jolly = true;
			Scanner numScanner = new Scanner(input.nextLine());
			int size = numScanner.nextInt();

			int[] inputList = new int[size];
			int index = 0;
			while (numScanner.hasNextInt()) {
				inputList[index] = numScanner.nextInt();
				index++;
			}

			BitSet bitSet = new BitSet(size);

			for (int i = 0; i < inputList.length - 1; i++) {
				int difference = Math.abs(inputList[i] - inputList[i+1]);
				if (difference < 1 | difference >= size || bitSet.get(difference)) {
					jolly = false;
					break;
				}
				bitSet.set(difference);
			}

			if (jolly) {
				System.out.println("Jolly");
			} else {
				System.out.println("Not jolly");
			}

		}

		input.close();
	}
}

