import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Main {

	public static void main(String []args){
		Scanner input = new Scanner(new BufferedInputStream(System.in));

		while (input.hasNextLine()) {
			boolean jolly = true;
			ArrayList<Integer> inputList = new ArrayList<>();
			HashSet<Integer> readIntegers = new HashSet<>();
			Scanner numScanner = new Scanner(input.nextLine());

			while (numScanner.hasNextInt()) {
				int nextInt = numScanner.nextInt();
				inputList.add(nextInt);
				readIntegers.add(nextInt);
			}

			for (int i = 0; i < inputList.size(); i++) {
				if (i < inputList.size() - 1) {
					if (!readIntegers.contains(Math.abs(inputList.get(i) - inputList.get(i+1)))) {
						jolly = false;
					}
				}
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

