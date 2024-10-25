interface A {
    
  
    void show();
    void config();

}

interface B{

    void run();
}


class X implements A{

    public  void show(){
        System.out.println("hello");
    }
    public void config(){
        System.out.println("config");
 }
public void run()
{
    System.out.println("Running");
}


    public static void main(String[] args) {
        
        X b=new X();      
        b.show();
        b.config();
        b.run();
   
    }
    
}




