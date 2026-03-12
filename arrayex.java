import java.util.Scanner;

class arrayex
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++)
        {
            numbers[i] = obj.nextInt();
        }

        int max = numbers[0];

        for(int i = 1; i < 5; i++)
        {
            if(numbers[i] > max)
            {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number is: " + max);
    }
}