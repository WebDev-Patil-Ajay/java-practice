class typecasting
{
    void explicit()
    {
        double a=20.2;
        int b=(int)a;
        System.out.println(b);

    }
    public static void main(String []args)
    {
        int a=10;
        double b=a;
        System.out.println(b);

        typecasting obj =new typecasting();
         obj.explicit();
    }

}