package com.company;

import java.io.BufferedInputStream;
import java.util.*;

class Main {

	public static void main(String []args) {
		Scanner input = new Scanner(new BufferedInputStream(System.in));

		String a = input.nextLine();

		int numTests = Integer.parseInt(a);

		for (int i = 0; i < numTests; i++) {
			a = input.nextLine();
			ArrayList<Integer> distances = new ArrayList<>();

			Scanner rowScan = new Scanner(a);
			int numRelatives = rowScan.nextInt();

			while(rowScan.hasNextInt()) {
				distances.add(rowScan.nextInt());
			}

			Collections.sort(distances);

			int median = distances.get(numRelatives/2);
			int dev = 0;

			for(int x: distances) {
				dev += Math.abs(median - x);
			}

			System.out.println(dev);
		}
	}
}