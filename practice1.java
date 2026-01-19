class practice1
{
    static int a =10;
    void fun()
    {
        int b =20;
        System.out.println(a+" "+b);
        ++a; ++b;
    }
    public static void main(String[] args)
    {
        practice1 obj=new practice1();
        obj.fun();
        obj.fun();
    }
}