public class Staticmethod {
    
static int age;
static String name;
 static void show()

{
    System.out.println("My age  : "+age);
    System.out.println("My name : "+name);
}








}
class TestStaticmethod{
    public static void main(String[] args) {
        
       Staticmethod sm=new Staticmethod();
        Staticmethod.name="Awais";
        Staticmethod.age=19;


        Staticmethod.show();
        sm.show();












    }
}