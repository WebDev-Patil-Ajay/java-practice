import java.util.Scanner;

class NestedIfDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if(age >= 18)
        {
            System.out.println("Do you have voter ID? (true/false)");
            boolean id = sc.nextBoolean();

            if(id == true)
            {
                System.out.println("You can vote.");
            }
        }
    }
}
