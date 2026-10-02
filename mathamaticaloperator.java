import java.util.Scanner;
public class mathamaticaloperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ENTER FIRST NUMBER: ");
        double a = scanner.nextDouble();

        System.out.println( " ENTER SECOND NUMBER: ");
        double b = scanner.nextDouble();
        
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        
        scanner.close();
    }
}