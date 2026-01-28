import java.util.Scanner;
class rilationlOperator
{
    public static void main(String[]args)
    {
    Scanner obj=new Scanner(System.in);
    int a,b;
     System.out.println("enter two numer");
    a=obj.nextInt();
    b=obj.nextInt();
     System.out.println("less than="+(a<b));
     System.out.println("gretar than="+(a>b));
     System.out.println("less than equal="+(a<=b));
     System.out.println("gretar than equal="+(a>=b));
     System.out.println("equal equal="+(a==b));
     System.out.println("not equal="+(a!=b));

    }
}
