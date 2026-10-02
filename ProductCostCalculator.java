import java.util.Scanner;

public class ProductCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input product price and quantity
        System.out.print("Enter the price of the product: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Calculate total cost using the multiplication arithmetic operator
        double totalAmount = price * quantity;

        // Display results
        System.out.println("\n--- Product Details ---");
        System.out.println("Product Price : $" + price);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Total Amount  : $" + totalAmount);

        scanner.close();
    }
}