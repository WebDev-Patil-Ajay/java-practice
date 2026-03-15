import java.util.Scanner;

class StudentMarksAvr
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int[] marks = new int[5];
        int sum = 0;

        System.out.println("Enter marks of 5 students:");

        for(int i = 0; i < 5; i++)
        {
            marks[i] = obj.nextInt();
            sum = sum + marks[i];
        }

        int avg = sum / 5;

        System.out.println("Average Marks: " + avg);
    }

}