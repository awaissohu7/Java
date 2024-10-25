public class Factorial {
    public int fact(int x)
{
        if(x==0 || x==1)
    {
        return 1;
    }
    else {
        return x*fact(x-1);
    }
}
    public static void main(String[] args) 
    {
        Factorial f=new Factorial();
        System.out.println(f.fact(4));
    }
}
