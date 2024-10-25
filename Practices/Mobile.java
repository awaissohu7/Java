
public class Mobile {
    String brand;
    int price;
    static String name;

    void show()
    {
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
   
    }
}

class TestMobile{
    public static void main(String[] args) {
        
        Mobile mobile=new Mobile();
        mobile.brand="Samsung";
        mobile.price=20000;
        mobile.name="Mobile";

        Mobile mobile2=new Mobile();
        mobile2.brand="iphone";
        mobile2.price=190000;
        mobile2.name="Smart Phone";

        Mobile mobile3=new Mobile();
        mobile3.brand="PTCL";
        mobile3.price=23000;
        mobile3.name="Telephone";
       
        
        mobile.show();
        mobile2.show();
        mobile3.show();











    }
}