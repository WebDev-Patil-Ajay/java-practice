import java.util.Scanner;
class sizearray
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int size =obj.nextInt();

        int number[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println(number[i]);
        }

    }
}