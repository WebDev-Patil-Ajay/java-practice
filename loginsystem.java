import java.util.Scanner;
class loginsystem
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        String currectuse="Ajay123";
        String currectpass="pass@123";

        System.out.println("enter username:");
        String userName=obj.nextLine();

        System.out.println("enter Password:");
        String password=obj.nextLine();

        if(userName.equals(currectuse) && password.equals(currectpass))
        {
            System.out.println("login Successful");
        }
        else if(!userName.equals(currectuse))
        {
            System.out.println("invalid username");
        }
        else if(!password.equals(currectpass))
        {
            System.out.println("invalid password");
        }
        else
        {
            System.out.println("login faild");
        }


    }
}