import java.util.Scanner;

class Ifelse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        System.out.println("----- Result -----");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

        if (marks >= 35) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}
