import java.util.Scanner;
public class mathematicaloperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          try {

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            System.out.print("Enter the operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double result = 0;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operation!");
                    return;
            }

            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            scanner.close();
        }
    }
}