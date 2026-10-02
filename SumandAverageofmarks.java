import java.util.Scanner;
public class SumandAverageofmarks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		int sum = 0;

		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
		}

		System.out.println("Sum = " + sum);
		if (n > 0) {
			System.out.println("Average = " + (double) sum / n);
		} else {
			System.out.println("Average = 0.0");
		}

		scanner.close();
	}
}
