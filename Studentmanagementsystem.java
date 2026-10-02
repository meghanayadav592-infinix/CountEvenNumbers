public class Studentmanagementsystem {
     String studentName;
     int studentId;
     String branch;

    public Studentmanagementsystem(String studentName, int studentId, String branch) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.branch = branch;
    }

    void displayStudentDetails() {

        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Branch: " + branch);
    }
}

class Main {
    public static void main(String[] args) {
        Studentmanagementsystem s1 = new Studentmanagementsystem(
            "AISHA",
            101,
            "ECE"
        );

        Studentmanagementsystem s2 = new Studentmanagementsystem(
            "YASH",
            102,
            "ECE"
        );
        s1.displayStudentDetails();

        s2.displayStudentDetails();
    }
 }
