import java.io.BufferedInputStream;
import java.util.Scanner;

class Main {

	public static void main(String []args){
		Scanner input = new Scanner(new BufferedInputStream(System.in));

		while (input.hasNext()) {
			int num1, original1, num2, original2;
			num1 = original1 = input.nextInt();
			num2 = original2 = input.nextInt();

			if (num1 > num2) {
				int temp = num2;
				num2 = num1;
				num1 = temp;
			}

			int cycleLength = 0;
			int maxCycle = Integer.MIN_VALUE;
			for (int i = num1; i <= num2; i++) {
				cycleLength = cycleLength(i);
				if (cycleLength >= maxCycle) {
					maxCycle = cycleLength;
				}
			}
			System.out.println(original1 + " " + original2 + " " + maxCycle);
		}

		input.close();
	}

	static int cycleLength(int i) {
		int cycleLength = 1;

		while(i != 1) {
			if (i % 2 == 0) {
				i = i / 2;
			} else {
				i = 3 * i + 1;
			}
			cycleLength++;
		}

		return cycleLength;
	}
}
