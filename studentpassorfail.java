import java.util.Scanner;
 public class studentpassorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER YOUR MARKS: ");

        int marks = sc.nextInt();

        if (marks >= 40)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        sc.close();
    }
}