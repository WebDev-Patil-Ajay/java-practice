import java.util.Scanner;

class EvanOdd
{
    public static void main(String []args)
    {
        int a;
        Scanner obj=new Scanner(System.in);

        System.out.println("enter number");
        a=obj.nextInt();

        if(a %2==0)
        {
            System.out.println("this even number");
        }
        else
        {
            System.out.println("this is odd number");
        }
    }
}