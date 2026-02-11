import java.util.Scanner;

class IfElseDemo2 {
    public static void main(String[] args) {

        int a;

        System.out.println("Enter number to check positive or negative:");
        Scanner obj = new Scanner(System.in);

        a = obj.nextInt();

        // Positive or Negative Check
        if (a >= 0) {
            System.out.println("Your number is positive: " + a);
        } else {
            System.out.println("Your number is negative: " + a);
        }

        // Even or Odd Check
        if (a % 2 == 0) {
            System.out.println("Your number is even: " + a);
        } else {
            System.out.println("Your number is odd: " + a);
        }

        obj.close();
    }
}
