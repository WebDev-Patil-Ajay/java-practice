import java.util.Scanner;
class ifelseMuli
{
    public static void main(String[]args)
    {
        int marks;
        System.out.println("enter your marks:");
        Scanner obj=new Scanner(System.in);
        marks=obj.nextInt();
        if(marks>=90)
        {
            System.out.println("grade A="+marks);
        }
        else if(marks>=75)
        {
            System.out.println("grade B");
        }
        else if(marks>=50)
        {
            System.out.println("grade C"+marks);
        }
    }
}