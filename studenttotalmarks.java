import java.util.Scanner;

class StudentData
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter number of subjects:");
        int size = obj.nextInt();
        obj.nextLine(); // buffer clear

        String subjects[] = new String[size];
        int marks[] = new int[size];

        int sum = 0;

        for(int i = 0; i < size; i++)
        {
            System.out.println("Enter subject name:");
            subjects[i] = obj.nextLine();

            System.out.println("Enter marks:");
            marks[i] = obj.nextInt();
            obj.nextLine(); // buffer clear

            sum = sum + marks[i];
        }

        System.out.println("\n--- Result ---");

        for(int i = 0; i < size; i++)
        {
            System.out.println(subjects[i] + " : " + marks[i]);
        }

        System.out.println("Total = " + sum);

        double avg = (double)sum / size;
        System.out.println("Average = " + avg);
    }
}