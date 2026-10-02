import java.util.Scanner;

public class Markscalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double subject3 = scanner.nextDouble();

        double totalMarks = subject1 + subject2 + subject3;
        double averageMarks = totalMarks / 3.0;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        scanner.close();
    }
}
