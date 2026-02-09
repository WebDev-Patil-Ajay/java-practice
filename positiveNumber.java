import java.util.Scanner;
class positiveNumber
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number to check positive or nigitive:");
        int a=obj.nextInt();
        if(0<a)
        {
            System.out.println("you Enter number are positive ="+a);
        }
        else
        {
            System.out.println("you Enter negative number ="+a);

        }
    }
}