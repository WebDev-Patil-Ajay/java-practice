import java.util.Scanner;
class loginnestedif
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);

        String storeuserName="@ajaycreatorx";
        String storpassword="Pass#425111";

        System.out.println("======loging System=======");

        System.out.println("enter userName:");
        String userName=obj.nextLine();

        System.out.println("Enter Password:");
        String Password=obj.nextLine();

        if(userName.equals(storeuserName))
            {
                if(Password.equals(storpassword))
                {
                    System.out.println("login successful");
                }
                else
                {
                    System.out.println("wrong password");
                }
            }
            else
            {
                System.out.println("wrong username");
            }
            }
    }

