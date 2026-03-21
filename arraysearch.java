import java.util.Scanner;
class arraysearch
{
    public static void main(String[]args)
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=obj.nextInt();

        int number[]= new int[size];

        for(int i=0;i<size;i++)
        {
            number[i]=obj.nextInt();
        }
            System.out.println("Enter number to find index number:");
            int x=obj.nextInt();

        for(int i=0;i<number.length;i++)
        {
            if(number[i]==x)
            {
                System.out.println("you Enter number "+ x+"there number index is here:"+i);
            }
        }
    }
}