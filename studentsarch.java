import java.util.Scanner;

class StudentProject
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int size = sc.nextInt();

        String names[] = new String[size];
        int marks[] = new int[size];

        // 🔹 Input
        for(int i=0; i<size; i++)
        {
            System.out.print("Enter name: ");
            names[i] = sc.next();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
        }

        // 🔹 Display
        System.out.println("\nStudent Data:");
        for(int i=0; i<size; i++)
        {
            System.out.println(names[i] + " : " + marks[i]);
        }

        // 🔍 Search
        System.out.print("\nEnter name to search: ");
        String search = sc.next();

        boolean found = false;

        for(int i=0; i<size; i++)
        {
            if(names[i].equalsIgnoreCase(search))
            {
                System.out.println("Found! Marks: " + marks[i]);
                found = true;
                break;
            }
        }

        if(found == false)
        {
            System.out.println("Student not found");
        }

        // 🏆 Max (Topper)
        int max = marks[0];
        String topper = names[0];

        for(int i=1; i<size; i++)
        {
            if(marks[i] > max)
            {
                max = marks[i];
                topper = names[i];
            }
        }

        System.out.println("\nTopper: " + topper + " (" + max + ")");
    }
}
