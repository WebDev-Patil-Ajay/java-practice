class towNumber
{
    void addition()
    {
        int a=10,b=80,n;
        n=a+b;
        System.out.println("addition ="+n);
    }

    void subtraction()
    {
        int a=10,b=43,n;
        n=a-b;
        System.out.println("subtraction ="+n);
    }

    void division()
    {
        int a=34,b=65,n;
        n=a/b;
        System.out.println("division =" +n);
    }

    void multiplication()
    {
        int a=20,b=78,n;
        n=a*b;
        System.out.println("multiplication ="+n);
    }
    public static void main(String[]args)
    {
       towNumber obj = new towNumber();
       obj.addition();
       obj.subtraction();
       obj.division();
       obj.multiplication();

    }
}