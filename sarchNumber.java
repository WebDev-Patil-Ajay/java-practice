import java.util.Scanner;

class SearchNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] == search)
            {
                found = true;
                break;
            }
        }

        if(found)
        {
            System.out.println("Number Found");
        }
        else
        {
            System.out.println("Number Not Found");
        }
    }
}