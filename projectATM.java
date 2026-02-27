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

        double balance=10000;

        if(choise==1)
        {
            System.out.println("Enter your Username ");
            String currect=obj.nextLine();

            System.out.println("enter your password:");
            String passcurrect=obj.nextLine();

            if(currect.equals(currectusr) && passcurrect.equals(currectpass))
            {
                System.out.println("login successful");

                //  ATM MENU आता इथे आहे
                System.out.println("1. check balanse ");
                System.out.println("2. deposite");
                System.out.println("3. Withdraw");
                System.out.println("4. Exite");

                System.out.println("enter number:");
                int choiseTwo=obj.nextInt();

                if(choiseTwo==1)
                {
                    System.out.println("your balnse is:"+balance);
                }
                else if(choiseTwo==2)
                {
                    System.out.println("enter deposite amount:");
                    double amount=obj.nextInt();

                    balance=balance+ amount;
                    System.out.println("Amount deposite successfully");
                    System.out.println("your current Amount"+balance);
                }
                else if(choiseTwo==3)
                {
                    System.out.println("Enter amount to withdraw");
                    double withdraw = obj.nextInt();

                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Withdraw Successfully");
                        System.out.println("Current Balance: " + balance);
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                }
                else if(choiseTwo == 4)
                {
                    System.out.println("Thank You");
                }
            }
            else
            {
                System.out.println("invalid usr pass");
            }
        }
    }
}