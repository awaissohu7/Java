public class T1
{
    

public static void main(String[] args) {
    


String Firstname;
String Lastname;


try
{

    Firstname = args[0];
    Lastname = args[1];
    try{
        int a=10/0;
    }
    catch(ArrayIndexOutOfBoundsException a)
    {
        System.out.println(a);
    }
}


catch(Exception e)
{

Firstname="default";
Lastname="default";

}
System.out.println(Firstname);
}
}