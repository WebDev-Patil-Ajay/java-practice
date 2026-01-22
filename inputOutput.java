import java.util.Scanner;
class inputOutput
{
    public static void main(String[]args)
    {
        int a,b,n;
        System.out.println("enter first number");
        Scanner obj=new Scanner(System.in);
       a= obj.nextInt();
       System.out.println("enter second number");
       b=obj.nextInt();
       n=a+b;
       System.out.print("addition is "+n);


    }
}