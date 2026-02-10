class ifelseDemo {
    public static void main(String[] args) {

        int number = 7;
        int marks = 62;

        // Positive / Negative / Zero
        if (number > 0) {
            System.out.println("Number is Positive");
        } else if (number < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }

        // Even / Odd
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        // Pass / Fail
        if (marks >= 35) {
            System.out.println("Student is Pass");
        } else {
            System.out.println("Student is Fail");
        }
    }
}
