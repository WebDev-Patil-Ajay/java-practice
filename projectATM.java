import java.util.Scanner;
class projectATM
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);

        String currectusr="Ajay123";
        String currectpass="ajay123";

        System.out.println("1. login");
        System.out.println("2. rigitation");

        System.out.println("enter your choise:");
        int choise=obj.nextInt();
        obj.nextLine();

        if(choise==1)
        {
            System.out.println("Enter your Username ");
            String currect=obj.nextLine();

            System.out.println("enter your password:");
            String passcurrect=obj.nextLine();

        if(currect.equals(currectusr) && (passcurrect.equals(currectpass)))
        {
            System.out.println("login successful");
    
        }
        else
        {
            System.out.println("invalid usr pass");
            }
        }
        
            String newusr="";
            String newpass="";

        if(choise==2)
        {
            System.out.println("enter new username:");
            newusr=obj.nextLine();

            System.out.println("enter new password:");
            newpass=obj.nextLine();

            System.out.println("create accoutn successful");
            System.out.println("username :"+newusr);
            System.out.println("passsword :"+newpass);
        }
    }
}