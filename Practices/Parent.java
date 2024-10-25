public class Parent {
    int a=10;
}
class Child extends Parent{
   
    int a=20;

    public void show()
    {
        System.out.println(super.a);
    }
   
}


 class Test{
    
    public static void main(String[] args)
     {
      
        Child c=new Child();
        Parent p=new Parent();
        c.show();
        System.err.println(c.a);
        System.err.println(p.a);
        
        

    
    }

}