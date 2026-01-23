import java.util.Scanner;
class Input
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("enter first number");
        int a=obj.nextInt();

        System.out.println("entar secound number");
        int b=obj.nextInt();

        System.out.println("division ="+(a/b));

    }
}