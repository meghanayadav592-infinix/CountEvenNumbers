import java.util.Scanner;
public class lowestandhighestmarks {
	public static void main(String[] args) {
		Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int n = scanner.nextInt();

		if (n <= 0) {
			System.out.println("The number of students must be positive.");
			scanner.close();
			return;
		}

		int[] marks = new int[n];
		int total = 0;
		int highest;
		int lowest;

		for (int i = 0; i < n; i++) {
			System.out.print("Enter mark for student " + (i + 1) + ": ");
			marks[i] = scanner.nextInt();
			total += marks[i];
		}

		highest = marks[0];
		lowest = marks[0];
		for (int mark : marks) {
			if (mark > highest) {
				highest = mark;
			}
			if (mark < lowest) {
				lowest = mark;
			}
		}

		System.out.println("Highest mark: " + highest);
		System.out.println("Lowest mark: " + lowest);
		System.out.println("Average mark: " + ((double) total / n));

		scanner.close();
	}
}
