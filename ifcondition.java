import java.util.Scanner;

class icondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        if (marks >= 75) {
            System.out.println("Result: PASS");
            System.out.println("Grade: A");
        } 
        else if (marks >= 60) {
            System.out.println("Result: PASS");
            System.out.println("Grade: B");
        } 
        else if (marks >= 35) {
            System.out.println("Result: PASS");
            System.out.println("Grade: C");
        } 
        else {
            System.out.println("Result: FAIL");
            System.out.println("Grade: No Grade");
        }

        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
