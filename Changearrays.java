import java.util.Scanner;

public class Changearrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();
		int[] original = new int[n];
		int[] copy = new int[n];

		System.out.println("Enter " + n + " integer elements:");
		for (int i = 0; i < n; i++) {
			original[i] = scanner.nextInt();
			copy[i] = original[i];
		}

		System.out.println("Original array: " + java.util.Arrays.toString(original));
		System.out.println("Copied array: " + java.util.Arrays.toString(copy));
		scanner.close();
	}
}
