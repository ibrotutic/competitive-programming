import java.io.BufferedInputStream;
import java.util.*;

class Main {

	public static void main(String []args) {
		int[] countsA = new int [128];
		int[] countsB = new int [128];
		Scanner input = new Scanner(new BufferedInputStream(System.in));

		while (input.hasNextLine()) {
			//read two lines of input
			String a = input.nextLine();
			String b = input.nextLine();

			//initialize counts array for each char in lowercase alphabet
			for (int i = 'a'; i <= 'z'; ++i) {
				countsA[i] = 0;
				countsB[i] = 0;
			}

			//count chars in string A
			for (int i = 0; i < a.length(); ++i) {
				++countsA[a.charAt(i)];
			}

			//count chars in string B
			for (int i = 0; i < b.length(); ++i) {
				++countsB[b.charAt(i)];
			}

			StringBuilder builder = new StringBuilder();

			//Check permutations in strings A and B by looking at their counts
			for (int i = 'a'; i <= 'z'; ++i) {
				while (countsA[i] > 0 && countsB[i] > 0) {
					char c = (char) i;
					builder.append(c);
					--countsA[i];
					--countsB[i];
				}
			}
			System.out.println(builder.toString());
		}
	}
}