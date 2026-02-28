import java.util.Scanner;
class passwordcheck
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        String correctPassword = "ajay123";
        String userPassword;

        for(int i=1; i<=3; i++)
        {
            System.out.println("Enter Password:");
            userPassword = obj.next();

            if(userPassword.equals(correctPassword))
            {
                System.out.println("Login Successful!");
                break;
            }
            else
            {
                System.out.println("Wrong Password!");

                if(i == 3)
                {
                    System.out.println("Account Blocked!");
                }
            }
        }
    }
}