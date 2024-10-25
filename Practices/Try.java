public class Try {
    
int age;
Try(int age)
{
    this.age=age;

}
Try(Try ref)
{
    a=ref.a;
    b=ref.b;
}
public static void main(String[] args) {
    
    Try T=new Try(12);
    Try Y=new Try(Try);
    int a=T.age;
    System.out.println(T);
}

}
