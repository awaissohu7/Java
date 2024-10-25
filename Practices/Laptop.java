public class Computer {
    void price()
    {
        System.out.println("Price:  20000" );
    }
}

    public class Laptop extends Computer
    {
        public void price()
        {
            System.out.println("Price:  50000 " );
        }
    
    }


    public class Tablet extends Computer
    {
        
    void price()
    {
        System.out.println("Price:  27000" );
    }
        
    }

    public class Mobile extends Computer
    {
    

        void price()
    {
        System.out.println("Price: 283000 );
    
    }
}

        public class Smartwatch extends Computer
        {

            void price()
            {
                System.out.println("Price: " );
            }
    
        }

public class Test 
{
    public static void main(String[] args) 
    {
        Computer computer = new Computer();
        computer.price();
    }









}
