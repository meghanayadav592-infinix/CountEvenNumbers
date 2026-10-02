import java.util.Scanner;
 public class gradecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR SCORE(0-100): ");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("GRADE: A");
        } else if (score >= 80) {
            System.out.println("GRADE: B");
        } else if (score >= 70) {
            System.out.println("GRADE: C");
        } else if (score >= 59) {
            System.out.println("GRADE: D");
        } else {
            System.out.println("GRADE: F");
        }
        scanner.close();
    }
}