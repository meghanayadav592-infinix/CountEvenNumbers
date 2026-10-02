import java.util.Scanner;
public class elementpresentornotpresent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = {10, 20, 30, 40, 50};
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element is present in the array.");
        } else {
            System.out.println("Element is not present in the array.");
        }
        scanner.close();
    }
}
