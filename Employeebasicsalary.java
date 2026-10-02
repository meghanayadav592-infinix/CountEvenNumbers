import java.util.Scanner;
public class Employeebasicsalary {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER EMPLOYEE BASIC SALARY: ");
        double basicsalary = sc.nextDouble();

        System.out.println("ENTER YOUR HOUUSE RENT ALLOWANCE(HAR): ");
        double hra = sc.nextDouble();

        double grosssalary = basicsalary + hra;
        System.out.println("ENTER ALLOWANCE: ");

        double allowance = sc.nextDouble();
        System.out.println("BASIC SALARY: " + basicsalary);
        
        System.out.println("HOUSE RENT ALLOWANCE: " + hra);
        System.out.println("ALLOWANCE: " + allowance);
        System.out.println("GROSS SALARY: " + grosssalary);
        sc.close();
}
}